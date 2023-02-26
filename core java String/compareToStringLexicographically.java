package String123;
//
//ProblemStatement
//Write a program to compare two stringslexicographically.
//i/p :
//String s1 ="vsh";
//String s2 ="abcv";
//o/p : 
//21
//RestrictedKeyWordsInCode: compareTo
public class compareToStringLexicographically {

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 ="abcd";
			String s2 ="abCd";
			myCode(s1,s2);
		}
		//EndOfMainMethod
		private static void myCode(String s1,String s2) 
		{
			//write code here
			int result=myCompareMethod(s1, s2);
			System.out.println(result);
		}
		private static int myCompareMethod(String s1, String s2)
		{
			int len=0;
			if(s1.length()<s2.length())
			len=s1.length();
			else
			len=s2.length();
			for(int i=0; i<len; i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				return s1.charAt(i)-s2.charAt(i);
			}
			return s1.length()-s2.length();
		}
	}

