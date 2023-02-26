package String123;
//ProblemStatement
//Write a program to get lowest frequency of a character in a string.
//i/p :
//String s1 = "weLcome";
//o/p :
//1
//w
public class lowestFrequncyOfStringChar {
	//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "weLcome";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				int min=Integer.MAX_VALUE;
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
						if(freq<min)
						{
							min=freq;
							ch=s1.charAt(i);
						}
					}
				}
				System.out.println(min);
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


		