package javaproject;

public class Computer {
	public int computerModelNumber;
	public String computerName;
	
	public Computer() {}
	public Computer(String computerName) {
		this.computerName = computerName;
		System.out.println(computerName);
	}
		
	public String getComputerName() {
		return computerName;
	}
		
	public void modelNumber() {
		System.out.println("MAC2018");
	}
}














