package String123;
//
//ProblemStatement
//Write a program to convert all the characters in a string Uppercase.
//i/p :
//String s1 = "welcome";
//o/p :
//WELCOME
//RestrictedKeyWordsInCode: toUpperCase
public class UpperCase {
//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//WriteCode Here
				for(int i=0; i<s1.length(); i++)
				{
					char ch=s1.charAt(i);
					if(ch>='a' && ch<='z')
					ch=(char)(ch-32);
					System.out.print(ch);
				}
			}
		}
