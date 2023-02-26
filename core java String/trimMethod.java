package String123;
//
//ProblemStatement
//Write a program to trim any leading or trailing whitespace from a givenstring.
//i/p :
//String s=    abcd     ;
//o/p :
//abcd

public class trimMethod {

	
			//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "   ab   cd  ";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//write code here
				int i=0;
				while(true)
				{
					if(s1.charAt(i)==' ')
					i++;
					else
					break;
				}
				int j=s1.length()-1;
				while(true)
				{
					if(s1.charAt(j)==' ')
					j--;
					else
					break;
				}
				System.out.println("start : "+i);
				System.out.println("end : "+j);
				for(int k=i; k<=j; k++)
				{
					System.out.print(s1.charAt(k));
				}
			}
		}
