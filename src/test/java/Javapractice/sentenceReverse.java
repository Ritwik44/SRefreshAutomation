package Javapractice;

import java.util.Scanner;

public class sentenceReverse {

	public static void main(String[] args) {

//		Reversing  a sentence
//		===================================
//		Scanner sc = new Scanner(System.in);
/*        String str = "How are you";
        String rev = "";
        
        //Breaking the sentence into words
        String s[] = str.split(" ");
        
        //Adding the words stored in the array to the last
        for(int i=(s.length)-1;i>=0;i--){
            rev = rev+" "+s[i];
        }
        
        //Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev);
   */
		
//  Reversing a String
//	=====================
/*		String str="Ramanya";
		String rev="";
		
		for(int i=(str.length())-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
 
		System.out.println("Reversed string: " + rev);
	} */
		
		
	
// Count the no of vowels in a string
//	===================================	
		
		String str="Ramanya";
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
	 System.out.println("no of vowels are:"+count);	
	}
	
	
	
	

}
