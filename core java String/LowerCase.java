package String123;

//Write a program to convert all the characters in a string tolowercase.
//i/p :
//String s1 = "WELCOME";
//o/p :
//welcome
//RestrictedKeyWordsInCode: toLowerCase

public class LowerCase {
		//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "WELCOME";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//WriteCode Here
				for(int i=0; i<s1.length(); i++)
				{
					char ch=s1.charAt(i);
					if(ch>='A'&&ch<='Z')
					ch=(char)(ch+32);
					System.out.print(ch);
				}
			}
		}

