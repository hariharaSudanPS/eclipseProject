package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capcity; // get and set method


	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capcity=cap;
 }
	public int getCapcity(){
		return capcity;
		
	}
	public int getBusNo() {
		return busNo;
	}
	public boolean getIsAc() {
		return ac;
	}
	public void setCapcity(int cap) {
		capcity=cap;
	}
	public void setIsAc(boolean val) {
		ac=val;
	}
	public void displayBusinfo(){
		System.out.println("Bus No:" + busNo + "  AC:" + ac + "\tTotal capcity:" + capcity);
		
	}
	
 }