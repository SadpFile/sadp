

import java.util.Scanner;

interface words
{
	 String getword();
	
}
class basic_words implements words
{
	public String getword()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter worrd in uppercase");
		String str=sc.nextLine();
		return str;
	}
}

 class Lower implements words
{
	 public words w;
	 public Lower(words w)
	 {
		 this.w=w;
	 }
	 
	public String getword() {
		
		return convertlower(w);
	}
	public String convertlower( words w)
	{
		return w.getword().toLowerCase();
	}
}

public class Decorator {

	public static void main(String[] args) {

		words c=new basic_words();
		
		words rc=new Lower(c);
		

		System.out.println("Lower:"+rc.getword());
		

	}

}
