package week1.Day1;

public class ArmStrongNumber {
	public static void main (String[] args) {
		
		// Find whether the number is Armstrong Number or not
		
		@SuppressWarnings("unused")
		int i=153,ARM=0,i2=i,rem;
		System.out.println("input is " +i);
		while(i>0) {
			rem=i%10;
			ARM=ARM+rem*rem*rem;
			i=i/10;
			
		}
	
	Object system;
	if (ARM==i2)
		
		system.out.println(i2 + " Is Armstrong Number");
	else
		system.out.println(i2 + " Is not Armstrong Number");

}
}