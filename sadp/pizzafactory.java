
import java.util.*;
import java.io.*;
interface pizza
{
	void createPizza();
	void orderPizza();
	void preparePizza();
	void bake();
	void cut();
	void box();
	
}
class Nystylecheesepizza implements pizza
{
	public void createPizza()
	{
		System.out.println("Nystyle cheese pizza created");
	}
	public void orderPizza()
	{
		System.out.println("Nystyle cheese pizza ordered");
	}
	public void preparePizza()
	{
		System.out.println("Nystyle cheese pizza prepared");
	}
	public void bake()
	{
		System.out.println("Nystyle cheese pizza baked");
	}
	public void cut()
	{
		System.out.println("Nystyle cheese pizza is cut");
	}
	public void box()
	{
		System.out.println("Nystyle cheese pizza is boxed");
	}
}

class ChicagostylecheesePizza implements pizza
{
	public void createPizza()
	{
		System.out.println("ChicagostylecheesePizza created");
	}
	public void orderPizza()
	{
		System.out.println("ChicagostylecheesePizza ordered");
	}
	public void preparePizza()
	{
		System.out.println("ChicagostylecheesePizza prepared");
	}
	public void bake()
	{
		System.out.println("ChicagostylecheesePizza baked");
	}
	public void cut()
	{
		System.out.println("NyChicagostylecheesePizza is cut");
	}
	public void box()
	{
		System.out.println("ChicagostylecheesePizza is boxed");
	}
}
class WithoutCheesePizza implements pizza
{
	public void createPizza()
	{
		System.out.println("WithoutCheesePizza created");
	}
	public void orderPizza()
	{
		System.out.println("WithoutCheesePizza ordered");
	}
	public void preparePizza()
	{
		System.out.println("WithoutCheesePizza prepared");
	}
	public void bake()
	{
		System.out.println("WithoutCheesePizza baked");
	}
	public void cut()
	{
		System.out.println("WithoutCheesePizza is cut");
	}
	public void box()
	{
		System.out.println("WithoutCheesePizza is boxed");
	}
}




class PizzaFactary{
	

public pizza getIns(String st)
{
	if(st==null)
		return null;
	else if(st.equalsIgnoreCase("Nystylecheesepizza"))
		return new Nystylecheesepizza();
	else if(st.equalsIgnoreCase("ChicagostylecheesePizza"))
		return new ChicagostylecheesePizza();
	else if(st.equalsIgnoreCase("WithoutCheesePizza"))
		return new WithoutCheesePizza();
	return null;
}
}
public class pizzafactory  {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		PizzaFactary sf=new PizzaFactary();
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1:Nystylecheesepizza\n2:ChicagostylecheesePizza\n3:WithoutCheesePizza");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:	pizza s1=sf.getIns("Nystylecheesepizza");
				s1.createPizza();
				s1.orderPizza();
				s1.preparePizza();
				s1.bake();
				s1.cut();
				s1.box();
				break;
		case 2:	pizza s2=sf.getIns("ChicagostylecheesePizza");
				s2.createPizza();
				s2.orderPizza();
				s2.preparePizza();
				s2.bake();
				s2.cut();
				s2.box();
				break;
		case 3:	pizza s3=sf.getIns("WithoutCheesePizza");
				s3.createPizza();
				s3.orderPizza();
				s3.preparePizza();
				s3.bake();
				s3.cut();
				s3.box();
				break;
		default:	System.out.println("we dont have this kind pizza");
		}

	}

}
