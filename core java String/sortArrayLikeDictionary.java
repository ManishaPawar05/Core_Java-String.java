package String123;
//
//ProblemStatement
//Write a program to sort the array of String like dictionary?
//i/p :
//String s1 = "welcome to hefshine";
//o/p :
//hefshine to welcome 
//RestrictedKeyWordsInCode: compareTo,sort

public class sortArrayLikeDictionary {
		//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "welcome to hefshine";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//WriteCode Here
				String[] sa=s1.split(" ");
				for(int i=0; i<sa.length; i++)
				{
					for(int j=i+1; j<sa.length; j++)
					{
						if(myCompareMethod(sa[i],sa[j])>0)
						{
							String temp=sa[i];
							sa[i]=sa[j];
							sa[j]=temp;
						}
					}
				}
				for(String s:sa)
				System.out.print(s+" ");
			}
			private static int myCompareMethod(String s1, String s2)
			{
				for(int i=0; i<s1.length()&&i<s2.length(); i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					return s1.charAt(i)-s2.charAt(i);
				}
				return s1.length()-s2.length();
			}
		}
