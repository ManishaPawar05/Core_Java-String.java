package String123;
//ProblemStatement
//Write a program to print after removing duplicates from a givenstring.
//i/p :
//String s1 = "abcdabcdabcd";
//o/p :
//abcd

public class removeDuplicateEleFromString {

	public static void main(String[] args) {
	//StartOfMainMethod
			String s1 = "abbcfedafbcd";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//write code here
				char[] ch=s1.toCharArray();
				for(int i=0; i<ch.length; i++)
				{
					int cnt=0;
					for(int j=0; j<i; j++)
					{
						if(ch[i]==ch[j])
						cnt++;
					}
					if(cnt==0)
					{
						System.out.print(ch[i]);
					}
				}
			}
		}
