package week3.day1;

public class SmartPhone extends AnroidPhone {
	public void connectWhatsApp() {

		System.out.println("ConnectWhatsApp method");
	}
	
	public void takeVideo() {
		System.out.println("take video method from smartPhone class");

	}

	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone();

		obj.makeCall();
		obj.sendMsg();
		obj.saveContact();
		obj.takeVideo();
		obj.connectWhatsApp();

	}

}
