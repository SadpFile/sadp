

import java.text.BreakIterator;

interface Iterator{
    public boolean hasNext();
    public Object next();

}
 interface Menu{
    public Iterator getMenu();
 }

public class Breakfast implements Menu {
    public String names[]={"Vadapav", "Misal","Dosa"};
    
    public Iterator getMenu()
    {
        return new BreakfastIter();
    }
    
    private class BreakfastIter implements Iterator
    {
        int index;
        public boolean hasNext()
        {
            if(index<names.length)
            {
                return true;
            }
            return false;
        }

        public Object next()
        {
            if(this.hasNext())
            {
                return names[index++];

            }
            return null;
        }
    } 
}

