class LazySingletonObject
{
    private static LazySingletonObject ins;
    private LazySingletonObject()
    {
        System.out.println("Example of Lazy Singleton");
    }
    public static synchronized LazySingletonObject getins()
    {
        if(ins==null)
        {
            ins=new LazySingletonObject();
        }
        return ins;
    }
}
public class LazySingleton
{
    public static void main(String args[])
    {
        Thread t1=new Thread(()->
        {
            LazySingletonObject o1=LazySingletonObject.getins();
            System.out.println("Instance1");
        });

         Thread t2=new Thread(()->
        {
            LazySingletonObject o2=LazySingletonObject.getins();
            System.out.println("Instance2");
        });

        t1.start();
        t2.start();
    }
} 
