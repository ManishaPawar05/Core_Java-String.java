package String123;
//ProblemStatement
//Write a program to get the index of all the characters of thealphabet.
//i/p :
//String s1 ="abcd";
//o/p :
//0 a
//1 b
//2 c
//3 d
public class IndexOfAllTheCharcter {
			//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 ="abcd";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//write code here
				for(int i=0; i<s1.length(); i++)
				{
					char ch=s1.charAt(i);
					System.out.println(i+" "+ch);
				}
			}
		}
