

// Implement this class according to the instructions

public class ArrayList<T extends Comparable<T>> implements List<T> {

	@SuppressWarnings("unchecked")
	private T[] array = (T[]) new Comparable[0];

	@Override
	public void append(T elem) {

		// create a temporary array
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Comparable[array.length + 1];

		// copy elements from the original array into the temp array
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		} // for

		// add the element to the last position in the temp array
		tmp[tmp.length - 1] = elem;

		// replace the array with the temp array
		array = tmp;
	} // add

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		try{
			// create a temporary array
			@SuppressWarnings("unchecked")
			T[] tmp = (T[]) new Comparable[array.length + 1];

			// copy elements from the original array into the temp array
			for (int i = 0; i < array.length + 1; i++) {
				if(i < idx){
					tmp[i] = array[i];
				}else if(i == idx){
					tmp[i] = elem;
				}else{
					tmp[i] = array[i-1];
				}
			} // for

			// replace the array with the temp array
			array = tmp;
		}catch(Exception e){
			System.out.println("index out of bound : " + e.getMessage());
		} 
	} // add

	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		try{
			return array[idx];
		}catch(Exception e){
			System.out.println("index out of bound : " + e.getMessage());
			return null;
		}
	} // get

	@Override
	public void prepend(T elem) {
		// create a temporary array
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Comparable[array.length + 1];
		// add the element to the last position in the temp array
		tmp[0] = elem;

		// copy elements from the original array into the temp array
		for (int i = 1; i < array.length + 1; i++) {
			tmp[i] = array[i-1];
		} // for

		// replace the array with the temp array
		array = tmp;
	} // prepend

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		try{
			// create a temporary array
			@SuppressWarnings("unchecked")
			T[] tmp = (T[]) new Comparable[array.length - 1];

			// copy elements from the original array into the temp array
			for (int i = 0; i < array.length - 1; i++) {
				if(i < idx){
					tmp[i] = array[i];
				}else{
					tmp[i] = array[i+1];
				}
			} // for

			// replace the array with the temp array
			array = tmp;
		}catch(Exception e){
			System.out.println("index out of bound : " + e.getMessage());
		}
	} // remove

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
		try{
			for(int i = lo; i < hi; i++){
				if(array[i] == s){
					return i;
				}
			}
			return -1;
		}catch(Exception e){
			System.out.println("index out of bound : " + e.getMessage());
			return -1;
		}
	} // search

	@Override
	public int size() {
		return array.length;
	} // size

	public void print(){
		for(int i = 0; i< size(); i++){
			System.out.println(array[i]);
		}
	}	
	
} // ArrayList

