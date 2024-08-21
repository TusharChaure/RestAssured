package api.utils;

public interface readConfigFile {
	
	static String baseURL = ConfigManager.getInstance().getString("baseUrl");
	static String basePath = ConfigManager.getInstance().getString("basePath");
	static String username = ConfigManager.getInstance().getString("username");
	static String password = ConfigManager.getInstance().getString("password");


}
