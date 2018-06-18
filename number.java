import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		if(a>=1 && a<=100000){
			System.out.println("Positive");
		}
		else if(a<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
