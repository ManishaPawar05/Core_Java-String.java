package String123;
//
//Write a program to count and print all the duplicates in the inputstring.
//print all duplicate excluding unique
//i/p :
//String s1 ="abcdabcd";
//o/p :
//4
//abcd
//
//


public class PrintAllDuplicate {

	public static void main(String[] args) {
	
		
			//StartOfMainMethod
				String s1 ="abcdabcd";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//write code here
				String s2="";
				char[] ch=s1.toCharArray();
				for(int i=0; i<ch.length; i++)
				{
					int cnt=0;
					for(int j=i+1; j<ch.length; j++)
					{
						if(ch[i]==ch[j])
						{
							cnt++;
							continue;
						}
					}
					if(cnt!=0)
					{
						s2=s2+ch[i];
					}
				}
				System.out.println(s2);
				System.out.println(s2.length()); 
			}
		}

