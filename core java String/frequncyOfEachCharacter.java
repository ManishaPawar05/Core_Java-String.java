package String123;
//
//ProblemStatement
//Write a program to find frequency of character in a string
//i/p :
//String s1 = "aabbcc";
//o/p :
//a 2
//b 2
//c 2

public class frequncyOfEachCharacter {

	public static void main(String[] args) {
	
		
	
			//StartOfMainMethod
			
				String s1 = "aabbcc";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//write code here
				for(int i=0; i<s1.length(); i++)
				{
					int cnt=0;
					for(int j=0; j<i; j++)
					{
						if(s1.charAt(i)==s1.charAt(j))
						cnt++;
					}
					if(cnt==0)
					{
						int freq=findfreq(s1.charAt(i), s1);
						System.out.println(s1.charAt(i)+" "+freq);
					}
				}
			}
			private static int findfreq(char ch, String s1)
			{
				int cnt=0;
				for(int i=0; i<s1.length(); i++)
				{
					if(s1.charAt(i)==ch)
					cnt++;
				}
				return cnt;
			}
		}

