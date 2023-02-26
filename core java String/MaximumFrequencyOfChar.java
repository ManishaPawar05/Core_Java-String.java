package String123;
//ProblemStatement
//Write a program to get largestfrequency of a character in a string.
//if all character frequency same then print first ele that occurs first
//i/p :
//String s1 = "abcaabcb";
//o/p :
//3
//a
public class MaximumFrequencyOfChar {

		
			//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "abcaabcb";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//Write code here
				int max=Integer.MIN_VALUE;
				char ch=0;
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
						int freq=findFreq(s1.charAt(i), s1);
						if(freq>max)
						{
							max=freq;
							ch=s1.charAt(i);
						}
					}
				}
				System.out.println(max);
				System.out.println(ch);
			}
			private static int findFreq(char ch, String s1)
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
