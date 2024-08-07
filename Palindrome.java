import java .util.Scanner;
class Palindrome{
	public static void main (String ar []){
		int num, r,sum=0,temp; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome");
		 num = sc.nextInt();
		temp = num ;
		while(num > 0){
			r = num % 10  ;
			sum = (sum * 10) + r ;
			num = num /10 ;
		}
		
		if(temp == sum )
			System.out.println("Palindrome Number");
		
		else
			System.out.println("Not Palindrome");
	}
}

 