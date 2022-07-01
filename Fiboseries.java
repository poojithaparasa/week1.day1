package week1.Day1;

public class Fiboseries {
	public static void main (String[] args) {
		int n1=-1,n2=1,sum;
		for(int i=0;i<10;i++) {
			
			sum=n1+n2;
			System.out.println(sum+ " ");
			n1=n2;
			n2=sum;
		}
			
}

}
