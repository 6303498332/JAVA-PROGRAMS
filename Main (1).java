/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int m,n,opt,add,sub,mul;
	    double div,sin;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter first number:");
	    m = s.nextInt();
		System.out.print("Enter second number:");
		n = s.nextInt();
		while(true)
		{
		    System.out.println("Enter 1 for addition");
		    System.out.println("Enter 2 for subtraction");
		    System.out.println("Enter 3 for multiplication");
		    System.out.println("Enter 4 for division");
		    System.out.println("Enter 5 for sin");
		    System.out.println("Enter 6 for cos");
		    System.out.println("Enter 7 for tan");
		    System.out.println("Enter 8 for Exit");
		    opt = s.nextInt();
		    switch(opt)
		    {
		        case 1:
		        add = m+n;
		        System.out.println("Result:"+add);
		        break;
		        case 2:
		        sub = m-n;
		        System.out.println("Result:"+sub);
		        break;
		        case 3:
		        mul = m*n;
		        System.out.println("Result:"+mul);
		        break;
		        case 4:
		        div = (double)m/n;
		        System.out.println("Result:"+div);
		        break;
		        case 5:
		        System.out.println(Math.sin(45));
		        break;
		        case 6:
		        System.out.println(Math.cos(60));
		        break;
		        case 7:
		        System.out.println(Math.tan(45));
		        break;
		        case 8:
		        System.exit(0);   
		    }

		}
	}
}
