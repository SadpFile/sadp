import java.io.*;
import java.util.*;

interface os{
    void draw();
}
class windows implements os{
    public void draw(){
    
    System.out.println("Hi i am a windows");
    }
}
class linux implements os{
    public void draw(){
    
    System.out.println("Hi i am a linux");
    }
}
class macbook implements os{
    public void draw(){
    
    System.out.println("Hi i am a macbook");
    }
}

class ShapeFactory{
    public os getIns(String shapeType){
        if(shapeType==null){
            return null;
        }
        else if(shapeType.equalsIgnoreCase("WINDOWS")){
            return new windows();
        }
        else if(shapeType.equalsIgnoreCase("LINUX")){
            return new linux();
        }
        else if(shapeType.equalsIgnoreCase("MACBOOK")){
            return new macbook();
        }
        return null;
    }
}
public class FactoryOS{
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the os\nEnter 1 for windows \n 2 for linux \n 3 for ");
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        
        switch(var){
            case 1:
                os s1 = shapeFactory.getIns("WINDOWS");
                s1.draw();
                break;
                 case 2:
                os s2 = shapeFactory.getIns("LINUX");
                s2.draw();
                break;
                 case 3:
                os s3 = shapeFactory.getIns("MACBOOK");
                s3.draw();
                break;
           }
        }
    }


