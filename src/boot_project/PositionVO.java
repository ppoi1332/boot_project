package boot_project;

public class PositionVO {
	
	long number;
	String p_name;
	
	public PositionVO() {}
	
	public PositionVO(long number, String p_name) {
		this.p_name = p_name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	
}
