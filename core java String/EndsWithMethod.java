package String123;

//ProblemStatement
//Write a program to check whether a given string ends with the contents of another string.
//i/p :
//String s1 ="abcd";
//String s2 ="abcd";
//o/p :
//true
//RestrictedKeyWordsInCode: endsWith
public class EndsWithMethod {

	public static void main(String[] args) {
		//StartOfMainMethod
			
				String s1 ="abcd";
				String s2 ="";
				myCode(s1,s2);
			}
			//EndOfMainMethod
			private static void myCode(String s1,String s2) 
			{
				//write code here
				boolean ans=myEndsWithMethod(s1 ,s2);
				System.out.println(ans);		
			}
			private static boolean myEndsWithMethod(String s1, String s2)
			{
				if(s2.length()>s1.length())
				return false;
				int i=s1.length()-1;
				int j=s2.length()-1;
				int count=0;
				while(j>=0)
				{
					if(s1.charAt(i)!=s2.charAt(j))
					return false;
					j--;
					i--;
				}
				return true;
			}
		}

