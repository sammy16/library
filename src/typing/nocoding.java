package typing;
import java.io.*;

class nocoding{
	public static void main(String args[])
	{	try{
		
		BufferedReader scan1=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(scan1.readLine());
		String[] str=new String[a];
		int[] sum=new int[a];
		for(int i=0;i<a;i++)
			sum[i]=0;
		scan1=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<a;i++)
			str[i]=scan1.readLine();
		for(int i=0;i<a;i++)
		{	for(int j=0;j<str[i].length()-1;j++)
				sum[i]+=(int)str[i].charAt(j+1)-(int)str[i].charAt(j)<0?(int)str[i].charAt(j+1)-(int)str[i].charAt(j)+26:(int)str[i].charAt(j+1)-(int)str[i].charAt(j);
			sum[i]+=str[i].length()+1;
		}
		for(int i=0;i<a;i++)
		{	if(sum[i]<11*str[i].length())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}catch(Exception e)
	{
		
	}
	
	}
	
}