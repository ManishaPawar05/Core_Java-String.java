package String123;

public class FindSmallestAndLargestWordInString {

	public static void main(String[] args) 
		
			//StartOfMainMethod
			
			{
				String s1 = "welcome to hefshine soft pvt ltd";
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
						if(sa[i].length()>sa[j].length())
						{
							String temp=sa[i];
							sa[i]=sa[j];
							sa[j]=temp;
						}
					}
				}
				System.out.println("smallest word : "+sa[0]);
				System.out.println("largest word : "+sa[sa.length-1]);	
			}
		}

