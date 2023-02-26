package String123;

//Write a program to replace all the 'd' characters with 'f'characters.
//i/p :
//String s="dddaa";
//o/p :
//fffaa
//RestrictedKeyWordsInCode: replace

public class replaceDwithF {
		//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "dddaa";
				char ch1='d';
				char ch2='f';
				myCode(s1,ch1,ch2);
			}
			//EndOfMainMethod
			private static void myCode(String s1,char ch1,char ch2) 
			{
				//write code here
				for(int i=0; i<s1.length(); i++)
				{
					char ch=s1.charAt(i);
					if(ch==ch1)
					ch=ch2;
					System.out.print(ch);
				}
			}
		}

