package Observer;

public class Client {
	public static void main(String[] args) {
		
	
	Subject subject = new Subject();

   HexaObserver hexa= new HexaObserver(subject);
    OctalObserver oc=new OctalObserver(subject);
    BinaryObserver binary=new BinaryObserver(subject);

    System.out.println("First state change: 15");	
    subject.setState(15);
    System.out.println("Second state change: 10");	
    subject.setState(10);
    binary.update();
    oc.update();
    hexa.update();
}	
}