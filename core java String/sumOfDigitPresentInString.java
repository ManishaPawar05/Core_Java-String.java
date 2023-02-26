	package String123;
	
public class sumOfDigitPresentInString 
	{
		//StartOfMainMethod
		public static void main(String[] args) 
				{
					String s1="a2ba1ca3d";
					myCode(s1);
				}
				//EndOfMainMethod
				private static void myCode(String s1) 
				{
					//WriteCode Here
					int sum=0;
					for(int i=0; i<s1.length(); i++)
					{
						char ch=s1.charAt(i);
						if(ch>='0' && ch<='9')
						{
							sum=sum+(ch-48);
						}
					}
					System.out.print(sum);
				}
			}
