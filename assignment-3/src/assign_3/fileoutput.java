package assign_3;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class fileoutput 
{
	public void  output(List<String>keywords)
	{
		try
		{
			FileWriter fw=new FileWriter("//home//rdrj-hunt//Java Lab//csx-351-hw3-Rdrj-master//HW3-output.txt",false);
			File file1=new File("//home//rdrj-hunt//Java Lab//csx-351-hw3-Rdrj-master//HW3-input-code.cpp");
			Scanner cc = new Scanner(file1);
			int linecount=0,t=0,x=0,count=0;
			while(cc.hasNextLine())
			{
				String s=cc.nextLine().trim();
				t=0;
				linecount++;
				x=1;
				int i=0;
				if(s.length()!=0)
				{
					char [] arrofcppcode= s.toCharArray();
					String m="";
					for(i=0;i<arrofcppcode.length;i++)
					{
						if(arrofcppcode[i]=='/' && arrofcppcode[i+1]=='/')
							break;
						else if(( (arrofcppcode[i]>='a') && (arrofcppcode[i]<='z') ) || ( (arrofcppcode[i]>='A') && (arrofcppcode[i]<='Z') ) )
						{
							m = m + arrofcppcode[i];
						}
						else if(m.length()!=0)
						{
							if(keywords.contains(m))
							{
								count++;
								if(x==1)
								{
									fw.write("\nLine " + linecount + ":" +" "+m+"("+t+") ");
									x=0;
								}
								else if(x==0)
								{
									fw.write(m +"("+t+") ");
								}
							}
							t=i+1;
							m="";
						}
						else
							t=i+1;
					}
				}
				
			}
			fw.write("\nNumber of keywords found = "+ count+"\n");
			fw.close();
			cc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
