package api.model.response.commonResponse;

public class Meta {
	
	protected String base;
	protected String next;
	protected Integer count;
	
	public Meta() {}
	
	public Meta(String base, String next, Integer count) {
		this.base = base;
		this.next = next;
		this.count = count;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
}