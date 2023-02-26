package String123;
//
//ProblemStatement
//Write a program to reverse every word in a string using methods.
//i/p :
//String s1 = "I am a good boy";
//o/p :
//I ma a doog yob

public class reverseEvryWordInAAtring {
		//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "I am a good boy";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//WriteCode Here
				String[] sa=s1.split(" ");
				for(int i=0; i<sa.length; i++)
				{
					String so=sa[i];
					String sr="";
					for(int j=0; j<so.length(); j++)
					{
						sr=so.charAt(j)+sr;
						sa[i]=sr;
					}
					System.out.print(sa[i]+" ");
				}
			}
		}

