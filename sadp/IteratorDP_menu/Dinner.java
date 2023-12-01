

public class Dinner implements Menu {
    public String names[]={"Hakka Noodles", "Rayata","Biryani"};
    
    public Iterator getMenu()
    {
        return new DinnerIter();
    }
    
    private class DinnerIter implements Iterator
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
