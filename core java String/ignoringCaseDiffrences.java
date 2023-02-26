package String123;

//ProblemStatement
//Write a program to compare two strings lexicographically, ignoring casedifferences.
//i/p :
//String s1 ="abcd";
//String s2 ="abCd";
//o/p :
//0
//RestrictedKeyWordsInCode: compareToIgnoreCase,

public class ignoringCaseDiffrences {

	public static void main(String[] args) {
				//StartOfMainMethod
				String s1 ="abcd";
				String s2 ="abCd";
				myCode(s1,s2);
			}
			//EndOfMainMethod
			private static void myCode(String s1,String s2) 
			{
				//write code here
				s1=s1.toLowerCase();
				s2=s2.toLowerCase();
				int result=myCompareToMethod(s1,s2);
				System.out.println(result);
			}
			private static int myCompareToMethod(String s1, String s2)
			{
				int length=0;
				if(s1.length()<s2.length())
				{
					length=s1.length();
				}
				else
				{
					length=s2.length();
				}
				for(int i=0; i<length; i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					return (s1.charAt(i)-s2.charAt(i));
				}
				return s1.length()-s2.length();
			}
		}

