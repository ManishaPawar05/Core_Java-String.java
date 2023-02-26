package String123;
//
//ProblemStatement
//Write a program to repeat each of the character twice in a given string.
//i/p :
//String s="abc";
//o/p :
//aabbcc


public class repeatEachCharTwice {

	public static void main(String[] args) {

		
			//StartOfMainMethod
			
				String s1 = "welcome";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//WriteCode Here
				String s2="";
				for(int i=0; i<s1.length(); i++)
				{
					char ch=s1.charAt(i);
					s2=s2+ch+ch;
				}
				System.out.print(s2);
			}
		}

