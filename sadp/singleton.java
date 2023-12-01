
public class singleton{
    public static void main(String args[]){
        singeltoneObject obj1= singeltoneObject.getins();
        singeltoneObject obj2= singeltoneObject.getins();
        singeltoneObject obj3= singeltoneObject.getins();
                System.out.println(obj1);
                System.out.println(obj2);

                System.out.println(obj3);



    }
}
class singeltoneObject{
    private static singeltoneObject ins=new singeltoneObject();
    private singeltoneObject(){
        System.out.println("This is singeltone object");
    }
    public static singeltoneObject getins(){
        return ins;
    }
}
