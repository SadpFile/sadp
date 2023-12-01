

import java.util.Enumeration;
import java.util.Iterator;

// Adapter class to adapt Enumeration to Iterator
class EnumerationAdapter<T> implements Iterator<T> {
    private Enumeration<T> enumeration;

    public EnumerationAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }
}

public class Adapter_enum {
    public static void main(String[] args) {
        java.util.Vector<String> vector = new java.util.Vector<>();
        vector.add("Item 1");
        vector.add("Item 2");
        vector.add("Item 3");
        Enumeration<String> enumeration = vector.elements();


        Iterator<String> iterator = new EnumerationAdapter<>(enumeration);

    
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}

