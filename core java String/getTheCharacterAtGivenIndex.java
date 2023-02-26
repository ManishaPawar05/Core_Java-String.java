package String123;
//
//ProblemStatement
//Write a program to get the character at the given index within theString.
//i/p :
//String s1 ="abcd";
//int index=3;
//o/p :
//d
//---------------------
//i/p :
//String s1 ="abcd";
//int index=5;
//o/p :
//out of range index
//RestrictedKeyWordsInCode: charAt
public class getTheCharacterAtGivenIndex {
	//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 ="abcd";
				int index=3;
				myCode(s1,index);
			}
			//EndOfMainMethod
			private static void myCode(String s1,int index) 
			{
				//write code here
				char[] ch=s1.toCharArray();
				for(int i=0; i<s1.length(); i++)
				{
					if(i==index)
					System.out.println(ch[i]);
				}
				if(index>s1.length())
				System.out.println("out of range index");
			}
		}

