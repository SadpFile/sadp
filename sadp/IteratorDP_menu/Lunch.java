

public class Lunch implements Menu {
    public String names[]={"PuneriThali", "Panjabi Thali","Lasun Thali"};
    
    public Iterator getMenu()
    {
        return new LunchIter();
    }
    
    private class LunchIter implements Iterator
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
