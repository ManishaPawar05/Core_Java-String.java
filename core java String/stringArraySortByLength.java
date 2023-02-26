package String123;
//ProblemStatement
//Write a program to sort in ascending and descending order by length of the given array of strings.
//i/p :
//String s1 = "welcome to hef";
//o/p :
//to hef welcome 
public class stringArraySortByLength {
			//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 = "welcome to hef";
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
				for(String s:sa)
				System.out.print(s+" ");
			}
		}

