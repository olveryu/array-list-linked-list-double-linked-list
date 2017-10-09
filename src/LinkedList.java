

// Implement this class according to the instructions

public class LinkedList<T extends Comparable<T>> implements List<T>{

	private static class Node<T>{
		private T item;
		// pointer point to next address
		private Node<T> next;
		@SuppressWarnings("unused")

		// constructor of node with next node
		public Node(T item,Node<T> next){
			this.item = item;
			this.next = next;
		}
		// constructor of node without next node
		public Node(T item){
			this.item = item;
			next = null;
		}
	}

	// size of the list
	private int size;
	// first element of the list
	private Node<T> head;

	// link list constructor
	public LinkedList(){
		size = 0;
		head = null;
	}


	@Override
	public void append(T elem) {
		// create a new node for the new element
		Node<T> newNode = new Node<T>(elem);
		if(head == null){
			head = newNode ;
		}else {
			// move position to the last node
			Node<T> pNode = head;
			while(pNode.next != null){
				pNode = pNode.next;
			}
			// last node point to the new node
			pNode.next = newNode;
		}
		size ++;
	}

	@Override
	public void prepend(T elem) {
		// create a new node
		Node<T> newNode = new Node<T>(elem,head);
		// the pointer of the new node point to the head
		newNode.next = head;
		// new node is the head now
		head = newNode;
		size ++;
	}

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		try{
			if(idx < 0 || idx > size){
				throw new Exception();
			}
			// if idx = 0, perform prepend
			if(idx == 0){
				prepend(elem);
				return;
			}
			// if idx = size, perform append
			if(idx == size){
				append(elem);
				return;
			}
			// add to specific index
			Node<T> pNode = head;
			for(int i = 0; i < idx-1; i++){
				pNode = pNode.next;
			}
			Node<T> newNode = new Node<T>(elem);
			newNode.next = pNode.next;
			pNode.next = newNode;
			size ++;
		}catch(Exception e){
			System.out.println("index out of bound : " + idx + " size: " + size);
		}
	}

	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		try{
			if(idx < 0 || idx > size-1){
				throw new Exception();
			}
			// reach the index
			Node<T> pNode = head;
			for(int i = 0; i < idx; i++){
				pNode = pNode.next;
			}
			// get the element
			return pNode.item;
		}catch(Exception e){
			System.out.println("index out of bound : " + idx + " size: " + size);
			return null;
		}
	}

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		try{
			if(idx < 0 || idx > size-1){
				throw new Exception();
			}

			Node<T> pNode= head;
			// reach the index of the previous node
			for(int i = 0; i < idx-1; i++){
				pNode = pNode.next;
			}
			Node<T> currentNode = pNode.next;	
			// previous node point to the next node of current node
			if(idx == 0){
				head = head.next;
			}else{
				pNode.next = currentNode.next;
				currentNode.next = null;
			}
			size --;
		}catch(Exception e){
			System.out.println("index out of bound : " + idx + " size: " + size);
		}	
	}

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		try{
			if(lo < 0 || hi > size){
				throw new Exception();
			}
			for(int i = lo; i < hi; i++){
				// check is the element match
				if(get(i) == s){
					return i;
				}
			}
			return -1;
		}catch(Exception e){
			System.out.println("index out of bound :" + " low limit: " + lo + " high limit: " + hi);
			System.out.println("size: " + size);
			return -1;
		}	
	}
	@Override
	public int size() {
		return size;
	}
}