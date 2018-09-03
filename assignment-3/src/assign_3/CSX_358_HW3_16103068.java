package assign_3;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class CSX_358_HW3_16103068
{
	public static void main(String[] args)throws Exception
	{
		File file=new File("//home//rdrj-hunt//Java Lab//csx-351-hw3-Rdrj-master//HW3-unsorted-keywords.txt");
		List<String> keywords =new ArrayList<String>();
		Scanner sc =new Scanner(file);
		String s;
		while(sc.hasNextLine())
		{
			s=sc.nextLine();
			keywords.add(s.trim());
		}
		sc.close();
		Collections.sort(keywords);
		fileoutput fo=new fileoutput();
	    fo.output(keywords);
	}
}
