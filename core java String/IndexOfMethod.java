package String123;
//ProblemStatement
//implement indexof Method
//i/p :
//String s1 ="abcd";
//String s2="ab";
//o/p :0
//RestrictedKeyWordsInCode: indexOf
public class IndexOfMethod {
		//StartOfMainMethod
			public static void main(String[] args) 
			{
				String s1 ="abcd";
				String s2="cd";
				myCode(s1,s2);
			}
			//EndOfMainMethod
			private static void myCode(String s1,String s2) 
			{
				//write code here
				if(s2.length()==0)
				{
					System.out.println("0");
				}
				else
				{
					for(int i=0; i<s1.length(); i++)
					{
						if(s1.charAt(i)==s2.charAt(0))
						{
							int j=i;
							int k=0;
							int cnt=0;
							while(j<s1.length()&&k<s2.length())
							{
								if(s1.charAt(j)==s2.charAt(k))
								{
									cnt++;
								}
								else
								{
									break;
								}
								j++;
								k++;
							}
							if(cnt==s2.length())
							System.out.println(i);
							else
							System.out.println(-1);
						}
					}
				}
			}
		}

