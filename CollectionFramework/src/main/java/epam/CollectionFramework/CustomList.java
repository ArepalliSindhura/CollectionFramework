package epam.CollectionFramework;

import java.util.Arrays;

public class CustomList<E> 
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object values[];
    public CustomList(){
        values = new Object[DEFAULT_CAPACITY];
    }
    public int size() {
        return size;
    }
    public void add(E e){
        values[size++] = e;
    }
    @SuppressWarnings("unchecked")
    public E get(int i){
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) values[i];
    }
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = values[i];
        int numElts = values.length - ( i + 1 ) ;
        System.arraycopy(values, i + 1, values, i, numElts) ;
        size--;
        return (E) item;
    }
    public void clear(){
    	Object item;
    	if (size != 0) {
    		while(size > 0){
    			size--;
    		}
    	}
    }
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(values[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}