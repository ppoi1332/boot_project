package boot_project;

import java.time.LocalDate;

public class SoldierVO {
	
	long number;
	String name;
	long position_Code;
	LocalDate inDay;
	LocalDate outDay;
	long year;
	
	public SoldierVO() {}
	
	public SoldierVO(long number, String name, long position_Code, LocalDate inDay, LocalDate outDay, long year) {
		this.number = number;
		this.name = name;
		this.position_Code = position_Code;
		this.inDay = inDay;
		this.outDay = outDay;
		this.year = year;
	}
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPosition_Code() {
		return position_Code;
	}

	public void setPosition_Code(long position_Code) {
		this.position_Code = position_Code;
	}

	public LocalDate getInDay() {
		return inDay;
	}

	public void setInDay(LocalDate inDay) {
		this.inDay = inDay;
	}

	public LocalDate getOutDay() {
		return outDay;
	}

	public void setOutDay(LocalDate outDay) {
		this.outDay = outDay;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}
}
