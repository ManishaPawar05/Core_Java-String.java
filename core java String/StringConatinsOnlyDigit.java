package String123;
//ProblemStatement
//Write a program to test if a given string contains only digits
//i/p :
//String s1 ="1f23";
//o/p
//not contains only digit :
public class StringConatinsOnlyDigit {
//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 ="1f23";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//write code here
				if(onlyDigit(s1))
				{
					System.out.println("contains only digits");
				}
				else
				{
					System.out.println("not contains only digit");
				}
			}
			private static boolean onlyDigit(String s1)
			{
				for(int i=0; i<s1.length(); i++)
				{
					char ch=s1.charAt(i);
					if(ch<'0' ||ch>'9')
					return false;
				}
				return true;
			}
		}
