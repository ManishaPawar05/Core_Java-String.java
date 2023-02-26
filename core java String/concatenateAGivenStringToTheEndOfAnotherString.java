package String123;


//		Write a program to concatenate a given string to the end of anotherstring
//		i/p :
//		String s1 ="abcd";
//		String s2="efg";
//		o/p :
//		abcdefg


		public class concatenateAGivenStringToTheEndOfAnotherString 
		{
			//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 ="abcd";
				String s2="efg";
				myCode(s1,s2);
			}
			//EndOfMainMethod
			private static void myCode(String s1,String s2) 
			{
				//write code here
				String s3=s1+s2;
				System.out.println(s3);
			}
		}

