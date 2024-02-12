//Sri Naga Hansi Mamidi
public class IDLListTest {

	public static void main(String[] args) {
		IDLList<Integer> myList= new IDLList<Integer>();
		
		//Adding elements into the list
		myList.add(0);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		
		myList.append(5); //adding an element to the list end
		myList.add(4, 6); //adding an element after an index
		
		System.out.println(myList.get(1));	//gets the element in the list at index 1
		System.out.println(myList.getHead());	//gets the head element in the list
		System.out.println(myList.getLast());	//gets the tail element in the list
		
		System.out.println(myList.remove()); //removes element at head and returns the head element
		System.out.println(myList.removeLast());	//removes the last element in the list
		System.out.println(myList.removeAt(3));		//removes the element st index 3 from the list
		System.out.println(myList.remove(1));		//removes the element 1 from list on its first occurrence
			
		System.out.println(myList.toString());		//converting the list elements to string representation
	}

}
