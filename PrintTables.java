import java.util.Scanner ;
class PrintTables{
	public static void main (String ar[]){
		int Table ,num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which table you have to show");
		Table = sc.nextInt();
		System.out.println("Table : ");
		for(int i = 1 ; i <= 10; i++){
			num = i * Table ;
			System.out.println(num);
		}
		
	}
}
