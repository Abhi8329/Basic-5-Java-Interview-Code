class ReverseOrderPrint{
	public static void main(String ar[]){
		String  str= "Let Reverse it" , rstr ="";
		char ch ;
		System.out.println("Original String : " + str);
		for(int i = 0 ; i< str.length();i++){
			ch = str.charAt(i); //extracts each character
			rstr = ch + rstr;
			}
		System.out.println("Reverse String" + rstr);
		}
}