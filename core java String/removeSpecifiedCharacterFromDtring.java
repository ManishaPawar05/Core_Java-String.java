package String123;

//ProblemStatement
//Write a program to remove a specified character from a givenstring.
//i/p :
//String s="Aabcd";
//Char ch='a';
//o/p :Abcd

public class removeSpecifiedCharacterFromDtring {
	//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1="Aabcd";
				char ch='a';
				myCode(s1,ch);
			}
			//EndOfMainMethod
			private static void myCode(String s1,char ch) 
			{
				//WriteCode Here
				for(int i=0; i<s1.length(); i++)
				{
					char ch1=s1.charAt(i);
					if(ch1!=ch)
					System.out.print(ch1);
				}
			}
		}
