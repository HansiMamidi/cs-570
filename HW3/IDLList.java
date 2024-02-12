//Sri Naga Hansi Mamidi

import java.util.ArrayList;
public class IDLList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	private ArrayList<Node<E>> indices = new ArrayList<>();

	
	private static class Node<E> {
		
		E data;
		private Node<E> next = null;
		private Node<E> prev = null;
		
		Node (E elem) {
			this.data = elem;
		}
		
		Node (E elem, Node<E> prev, Node<E> next) {
			this.data = elem;
			this.prev = prev;
			this.next = next;
		}
	}
	
	//Creates an empty double-linked list
	public IDLList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	//method that adds elem at position index
		public boolean add(int index, E elem) {
			if (index < 0 || index > size) {
				throw new IndexOutOfBoundsException();
			}
			Node<E> ind = indices.get(index);
			Node<E> temp = new Node<E>(elem , ind.prev, ind);
			ind.prev.next = temp;
			ind.prev = temp;
			indices.add(index,temp);
			size++;
			return true;
		}
		
		//method that adds elem at the head
		public boolean add(E elem) {
			if(head == null) {
				Node<E> temp = new Node<E>(elem);
				temp.data = elem;
				head = temp;
				tail = temp;
				indices.add(head);
				size++;
				return true;
			}
			else {
				Node<E> temp = new Node<E>(elem);
				temp.next = head;
				head.prev = temp;
				head = temp;
				indices.add(0,temp);
				size++;
				return true;
			}

		}
		//method that adds elem as the new last element of the list
		public boolean append(E elem) {
			if(head == null) {
				head.data = elem;
				tail.data = elem;
				indices.add(head);
				size++;
				return true;
			} else {
				Node<E> temp = new Node<E>(elem);
				tail.next = temp;
				temp.prev = tail;
				tail = temp;
				indices.add(tail);
				size++;
				return true;
			}
		}

		//method that returns the object at position index from the head
		public E get(int index) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException();
			}
			return this.indices.get(index).data;
		}
		
		//method that returns the object at the head
		public E getHead() {
			return head.data;
		}
		
		//method that returns the object at the tail
		public E getLast() {
			return tail.data;
		}
		
		//method that returns the list size
		public int size() {
			return size;
		}
		
		//method that removes and returns the element at the head
		public E remove() {
			if (size == 0) {
				throw new IndexOutOfBoundsException();
			}
			if(head == tail) {
				Node<E> temp = head;
				head = null;
				tail = null;
				size--;
				return temp.data;
			}
			head = head.next;
			head.prev = null;
			size--;
			return indices.remove(0).data;
		}
		
		//method that removes and returns the element at the tail
		public E removeLast() {
			if (size == 0) {
				throw new IndexOutOfBoundsException();
			}
			if(head == tail) {
				Node<E> temp = head;
				head = null;
				tail = null;
				size--;
				return temp.data;
			}
			tail = tail.prev;
			tail.next = null;
			size--;
			return indices.remove(size).data;
		}
		
		//method that removes and returns the element at the index index
		public E removeAt(int index) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException();
			}
			if(index == 0) {
				E temp = this.remove();
				return temp;
			}
			Node<E> temp = indices.get(index);
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			size--;
			return indices.remove(index).data;
		}
		
		//method that removes the first occurrence of elem in the list and returns true if exists
		public boolean remove(E elem) {
			Node<E> temp = head;
			int i = 0;
			while(temp.next != null){
				if(temp.data.equals(elem)){
					if(i == 0) {
							head = head.next;
							size--;
							indices.remove(0);
							return true;
					}
					temp.next.prev = temp.prev;
					temp.prev.next = temp.next;
					size--;
					indices.remove(i);
					return true;
				}
				temp = temp.next;
				i++;
			}
			return false;
		}
		
		//method that gives a string representation of the list
		public String toString() {
			Node<E> temp = head;
			StringBuilder result = new StringBuilder();
			while (temp != null) {
				result.append(temp.data);
				if (temp.next != null) {
					result.append(" --> ");
				}
				temp = temp.next;
			}
			return result.toString();
		}

	}
