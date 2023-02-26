package String123;
//ProblemStatement
//implemrnt split method 
//i/p :
//String s1 ="abc    pres  jkl   xyz";
//		char ch=' ';
//o/p :
//abc , , , ,pres , ,jkl , , ,xyz
//RestrictedKeyWordsInCode: split
public class splitMethod {

	public static void main(String[] args) {
		//StartOfMainMethod
				String s1 ="abc    pres  jkl   xyz";
				char ch=' ';
				String[] sa=myCode(s1,ch);
				for (int i = 0; i < sa.length; i++) 
				{
					if(i<sa.length-1)
					System.out.print(sa[i]+" ,");
					else
					System.out.print(sa[i]);
				}
			}
			//EndOfMainMethod
			private static String[] myCode(String s1,char ch) 
			{
				//write code here
				int spaceCount=giveMeSpaceCount(s1, ch);
				int index=0;
				String s2="";
				String[] sa=new String[spaceCount+1];
				for(int i=0; i<s1.length(); i++)
				{
					if(s1.charAt(i)!=ch)
					{
						s2=s2+s1.charAt(i);
					}
					else
					{
						sa[index++]=s2;
						s2="";
					}
				}
				sa[index++]=s2;
				return sa;
			}
			private static int giveMeSpaceCount(String s1, char ch)
			{
				int count=0;
				for(int i=0; i<s1.length(); i++)
				{
					if(s1.charAt(i)==ch)
					count++;
				}
				return count;
			}
		}

