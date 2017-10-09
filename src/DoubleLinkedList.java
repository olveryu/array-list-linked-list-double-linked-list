
// Implement this class according to the instructions
public class DoubleLinkedList<T extends Comparable<T>> implements List<T>{
	
	private static class Node<T>{
		// element
		T item;
		// next node
		Node<T> next;
		// previous node
		Node<T> prev;

		// constructor of node
		public Node(T item, Node<T> next, Node<T> prev) {
			this.item = item;
			this.next = next;
			this.prev = prev;
		}
	}
	private int size;
	private Node<T> head;
	private Node<T> tail;

	// DoubleLinkedList constructor
	public DoubleLinkedList(){
		head = new Node<T>(null, null, null);
		tail = new Node<T>(null,head,null); 
		head.next = tail; 
		size = 0;
	}

	@Override
	public void append(T elem) {
		add(size,elem);
	}

	@Override
	public void prepend(T elem) {
		add(0,elem);
	}

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		try{
			if(idx < 0 || idx > size){
				throw new Exception();
			}
			// get the current node
			Node<T> currentNode = getNode(idx);
			// add before the node
			addBefore(currentNode, elem);
		}catch(Exception e){
			System.out.println("Index: " + idx + ", Size: " + size());	
		}	
	}

	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		try{
			if(idx < 0 || idx > size-1){
				throw new Exception();
			}
			// get the element of the node
			return getNode(idx).item;
		}catch(Exception e){
			System.out.println("Index: " + idx + ", Size: " + size());	
			return null;
		}
	}

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		try{
			if(idx < 0 || idx > size-1){
				throw new Exception();
			}
			// current node
			Node<T> currentNode = getNode(idx);
			// previous node
			Node<T> preNode = currentNode.prev;
			// next node
			Node<T> nextNode = currentNode.next;
			if(preNode == null){
				// become the head
				head = nextNode;
			}else{
				// previous node's next pointer to nextNode
				preNode.next = nextNode;
				currentNode.next = null;
			}
			if(nextNode == null){
				// become the tail
				tail = preNode;
			}else{
				// next node's prev pointer point to preNode
				nextNode.prev = preNode;
				currentNode.prev = null;
			}
			currentNode.item = null;
			size--;
		}catch(Exception e){
			System.out.println("Index: " + idx + ", Size: " + size());	
		}
	}

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		try{
			if(lo < 0 || hi > size){
				throw new Exception();
			}
			for(int i = lo; i < hi; i++){
				// match the element of the index i node
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

	/*
	 * this function is to the the node for specific index
	 * 
	 * @param: idx which is the index of the node
	 * @return: the specific node 
	 */
	public Node<T> getNode(int idx){
		// when idx less than the size/2, use next to get the node
		if (idx < (size/2)) {
			Node<T> temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp;
		}else{
			// when idx greater than the size/2, use next to get the node
			Node<T> temp = tail;
			for (int i = size; i > idx; i--) {
				temp = temp.prev;
			}
			return temp;
		}
	}

	/*
	 * this function is to add a node before the specific node with a element
	 * 
	 * @param: currentNode is the specific idx node you want to add a node before it
	 * @param: elem is the element you want to add to the node
	 */
	public void addBefore(Node<T> currentNode,T elem){
		// get the previous node
		Node<T> preNode = currentNode.prev;
		// create a new node with next node is the specific node and prev node is the preNode
		Node<T> newNode = new Node<>(elem, currentNode, preNode);
		// if preNode is null, head is the new node
		if (preNode == null) {
			head = newNode;
		} else {
			// the nest node of preNode will be the newNode
			preNode.next = newNode;
		}
		// the prev node of specific node is the newNode
		currentNode.prev = newNode;
		size++;
	}
}