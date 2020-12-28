package Question1;

public class Main {

	public static void main(String[] args) {

        LinkedList list = new LinkedList(); 
        
        list.insert(5);
        list.insert(10);
        list.insert(4);
        
        list.delete(1); // 1. eleman silindi (10) 
        
        list.insert(15);
        list.insert(20);
        
        list.delete(2); // 2. eleman silindi (4)
        
        System.out.println("Liste Boyutu = " + list.getSize());
        
        System.out.println("1. Eleman: " + list.getValue(1));
        System.out.println("2. Eleman: " + list.getValue(2));
        System.out.println("3. Eleman: " + list.getValue(3));
        System.out.println();
        System.out.println("4. Eleman var mi?: " + list.getValue(4));
	}

}
