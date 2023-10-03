package Javapractice;

public class CalenderString {

	public static void main(String[] args) {
		
		String S=" 29 Aug, 2023 ";
		
	/*	String S11=S.replaceAll("[,]","");
		System.out.println(S11);
		
		String S12=S11.trim();
		System.out.println(S12);
		
		String S1=S12.split(" ")[0];
		String S2=S12.split(" ")[1];
		String S3=S12.split(" ")[2]; 
		
		
	    System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);  */
		
		String S1=S.split(" ")[0];
		String S2=S.split(" ")[1];
		String S3=S.split(" ")[2].replace(",", "");
		String S4=S.split(" ")[3]; 
		
		
	    System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3); 
		System.out.println(S4);
		

	}

}
