class SwitcWithoutThirdVarable{
	public static void main (String ar[]){
		int a1 = 10 , a2 =20 ,a3 ;
			System.out.println("Original : "+ "a1 : "+ a1 + " " +"a2 : " +a2);
			a2 = a2 + a1 ;
			a1 = a2 - a1 ;
			a2 = a2 - a1 ;
			System.out.println("Switch : " + "a1 : "+  + a1 + " " +"a2 : " +a2);
			}
}