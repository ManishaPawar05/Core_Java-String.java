package String123;
//Write a program to find the second most frequent character in a givenstring.
//i/p : 
//aaabbc
//o/p :
//b 2
public class SecondMax {
//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "abcad";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//write code here
				int max=Integer.MIN_VALUE;
				int smax=Integer.MIN_VALUE;
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
						int frequncy=findFrequncyOfChar(s1.charAt(i), s1);
						if(frequncy>max)
						{
							max=frequncy;
						}
						if(frequncy!=max && frequncy>smax)
						{
							smax=frequncy;
							ch=s1.charAt(i);
						}
					}
				}
				System.out.println(ch+" "+smax);
			}
			private static int findFrequncyOfChar(char ch, String s1)
			{
				int count=0;
				for(int i=0; i<s1.length(); i++)
				{
					if(s1.charAt(i)==ch)
					count++;
				}
				return count++;
			}
		}

		