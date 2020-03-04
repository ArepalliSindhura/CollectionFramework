package epam.CollectionFramework;

public class Collections {

	public static void main(String[] args) {
		CustomList<Integer> cl = new CustomList<Integer>();
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        cl.add(5);
        System.out.println("The list is : " + cl);
        cl.add(6);
        System.out.println("List after add operation : " + cl);
        cl.remove(3);
        System.out.println("List after remove operation " + cl);
        System.out.println("performing get operation "  +  cl.get(2));
        System.out.println("finding size of list "  +  cl.size());
        cl.clear();
        System.out.println("List after clear operation " + cl);
	}

}
