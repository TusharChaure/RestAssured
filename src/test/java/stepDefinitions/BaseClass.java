package stepDefinitions;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.ParseException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import api.stepimplementation.CommonMethods;
import api.stepimplementation.HelperClass;
import api.utils.readConfigFile;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class BaseClass implements readConfigFile {

	protected static CommonMethods commonMethods = new CommonMethods();
	protected static HelperClass helper = new HelperClass();
	protected static ResponseOptions<Response> res;
	protected static Object object;
	public static Scenario scenario;
	protected static Map<String, String> commonMessagesMap;
	protected static String endpoint, actualResponseMsg, actualErrorMsg, token, testName, pojoError;
	protected static String language = "";
	protected static List<String> additionalVerifications, actualList, expectedList;
	protected static String[] stringArray;
	protected static final Integer apiResponseTime = 10000;
	protected static Integer size;
	
	protected static void errorLogs(Exception e) {
		pojoError = e.toString();
	}
	
	protected static void listSorting(String order) {
		if(order.matches("ascending"))
			Collections.sort(expectedList);
		else
			Collections.sort(expectedList, Collections.reverseOrder());
	}
	
	protected static void timestampSorting(String order) {
		Collections.sort(expectedList, new Comparator<String>() {
			@Override
			public int compare(String timestampString1, String timestampString2) {
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm a");
					Timestamp timestamp1 = new Timestamp(dateFormat.parse(timestampString1).getTime());
					Timestamp timestamp2 = new Timestamp(dateFormat.parse(timestampString2).getTime());
					if(order.matches("ascending"))
						return timestamp1.compareTo(timestamp2); // Sort in ascending order
					else
						return timestamp2.compareTo(timestamp1); // Sort in descending order
				} catch (ParseException | java.text.ParseException e) {
					e.printStackTrace();
					return 0;
				}
			}
		});
	}

	protected static void verifyAssertEquality(String message, Object expected, Object actual) {
		assertEquals(message, expected, actual);
	}
	
	protected static List<String> getAdditionalVerificationListOfStrings(String assertion) {
		stringArray = assertion.split(",");
		return Arrays.asList(stringArray);
	}

	protected static String getResourceAction(String accountNumber, String module, String action) {
		if(accountNumber==null && action==null)
			return "";
		else if(accountNumber==null)
			return "action=" + action;
		else if(action==null)
			return "resource=jio:jcms:" + accountNumber + ":" + module + ":";
		else
			return "resource=jio:jcms:" + accountNumber + ":" + module + ":&" + "action=" + action;
	}

	protected static Map<String, String> getResponseErrorMessages(){
		FileInputStream file = null;
		XSSFWorkbook workbook = null;
		try {
			file = new FileInputStream(new File("src/test/resources/files/CommonMessages.xlsx"));
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		int lastCelNum = row.getLastCellNum();
		int cellNumberOfTranslation = 0;
		for (int i = 0; i < lastCelNum; i++) {
			XSSFCell cellValue = row.getCell(i);
			if (cellValue == null) {
				continue;
			}
			if (cellValue.getStringCellValue().contentEquals(language)) {
				cellNumberOfTranslation = i;
				break;
			}
		}
		Map<String, String> commonMessagesMap = new HashMap<String, String>();
		int lastRow = sheet.getLastRowNum();
		String key = null;
		String value = null;
		for (int i = 1; i <= lastRow; i++) {
			key = sheet.getRow(i).getCell(0).getStringCellValue();
			value = sheet.getRow(i).getCell(cellNumberOfTranslation).getStringCellValue();
			commonMessagesMap.put(key, value);
		}
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return commonMessagesMap;
	}

}
