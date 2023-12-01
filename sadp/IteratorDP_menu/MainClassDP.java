

import java.util.*;

public class MainClassDP {
    public static void main(String[] args) {
        System.out.println("What you want");
        System.out.println("1. Breakfast\n2.Lunch\n3.Dinner\n");
        System.out.println("Enter a number Only like 1,2,3");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1: Breakfast Breakfastiter=new Breakfast();
             System.out.println("Breakfast");
                    for(Iterator iter=Breakfastiter.getMenu();iter.hasNext();)
                    {
                        String namefast=(String)iter.next();
                       
                        System.out.println(namefast);
                    }

                    break;
            case 2: Lunch lunchiter=new Lunch();
                    System.out.println("Lunch Menu");
                    for(Iterator iter=lunchiter.getMenu();iter.hasNext();)
                    {
                        String namefast=(String)iter.next();
                        
                        System.out.println(namefast);
                    }

                    break;
                
            case 3: Dinner dinneriter=new Dinner();
                       System.out.println("Dinner Menu"); 
                    for(Iterator iter=dinneriter.getMenu();iter.hasNext();)
                    {
                        String namefast=(String)iter.next();
                        
                        System.out.println(namefast);
                    }

        }
    }
    
}
