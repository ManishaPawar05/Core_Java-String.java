package String123;
//ProblemStatement
//Write a program to check whether a given string starts with the contents of another string.
//i/p :
//String s1 ="Priyaabcd";
//String s2 ="abcd";
//false
//RestrictedKeyWordsInCode: startsWith

public class startsWithMethod {
		
		
			//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 ="Priyaabcd";
				String s2 ="abcd";
				myCode(s1,s2);
			}
			//EndOfMainMethod
			private static void myCode(String s1,String s2) 
			{
				//write code here
				boolean ans=myStartsWithMethod(s1, s2);
				System.out.println(ans);
			}
			private static boolean myStartsWithMethod(String s1, String s2)
			{
				if(s2.length()<=s1.length())
				{
					int cnt=0;
					for(int i=0; i<s2.length(); i++)
					{
						if(s1.charAt(i)==s2.charAt(i))
						cnt++;
					}
					if(cnt==s2.length())
					return true;
					else
					return false;
				}
				return false;
			}
		}

