import java.util.InputMismatchException;
import java.util.Scanner;

// Implement this class according to the instructions

public class Driver{
	public static void main(String [] args){
		// command out each block to test the run time for each method
		System.out.println("1.prepend\n" +
							"2.addpend\n" +
							"3.get\n" +
							"4.remove\n" +
							"5.search\n");
		System.out.println("Your choice is :");
		Scanner in = new Scanner(System.in);
		int choice = 0;
		try{
			choice = in.nextInt();
		}catch(Exception e){
			System.out.println("input Miss Match.");
		}
		switch(choice){
		case 1:
			System.out.println("------------prepend-----------");
			System.out.println("10");
			prepend(10);
			System.out.println("100");
			prepend(100);
			System.out.println("1000");
			prepend(1000);
			System.out.println("10000");
			prepend(10000);
			System.out.println("100000");
			prepend(100000);
			break;
		case 2:
			System.out.println("------------append-----------");
			System.out.println("10");
			append(10);
			System.out.println("100");
			append(100);
			System.out.println("1000");
			append(1000);
			System.out.println("10000");
			append(10000);
			System.out.println("100000");
			append(100000);
			break;
		case 3:
			System.out.println("------------get-----------");
			System.out.println("10");
			get(10);
			System.out.println("100");
			get(100);
			System.out.println("1000");
			get(1000);
			System.out.println("10000");
			get(10000);
			System.out.println("100000");
			get(100000);
			break;
		case 4:
			System.out.println("------------remove-----------");
			System.out.println("10");
			remove(10);
			System.out.println("100");
			remove(100);
			System.out.println("1000");
			remove(1000);
			System.out.println("10000");
			remove(10000);
			System.out.println("100000");
			remove(100000);
			break;
		case 5:					
			System.out.println("------------search-----------");
			System.out.println("10");
			search(10);
			System.out.println("100");
			search(100);
			System.out.println("1000");
			search(1000);
			System.out.println("10000");
			search(10000);
			System.out.println("100000");
			search(100000);
			break;
		default:
			System.out.println("invaid input.");
		}
		in.close();
	}
	public static void prepend(int time){
		//array list
		long startTime = System.currentTimeMillis();
		ArrayList<String> str1 = new ArrayList<String>();
		for(int i = 0; i < time ; i++){
			str1.prepend(Integer.toString(i));
		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.print("arrayList:");
		System.out.println(totalTime);

		//link list
		startTime = System.currentTimeMillis();
		LinkedList<String> str2 = new LinkedList<String>();
		for(int i = 0; i < time ; i++){
			str2.prepend(Integer.toString(i));
		}
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("LinkedList:");
		System.out.println(totalTime);

		//double link list
		startTime = System.currentTimeMillis();
		DoubleLinkedList<String> str3 = new DoubleLinkedList<String>();
		for(int i = 0; i < time ; i++){
			str3.prepend(Integer.toString(i));
		}
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("DoubleLinkList:");
		System.out.println(totalTime);	
	} // end of prepend

	public static void append(int time){
		// array list
		long startTime = System.currentTimeMillis();
		ArrayList<String> str1 = new ArrayList<String>();
		for(int i = 0; i < time ; i++){
			str1.append(Integer.toString(i));
		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.print("arrayList:");
		System.out.println(totalTime);

		// link list
		startTime = System.currentTimeMillis();
		LinkedList<String> str2 = new LinkedList<String>();
		for(int i = 0; i < time ; i++){
			str2.append(Integer.toString(i));
		}
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("LinkedList:");
		System.out.println(totalTime);

		// double link list
		startTime = System.currentTimeMillis();
		DoubleLinkedList<String> str3 = new DoubleLinkedList<String>();
		for(int i = 0; i < time ; i++){
			str3.append(Integer.toString(i));
		}
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("DoubleLinkList:");
		System.out.println(totalTime);	
	} // end of append

	public static void get(int time){
		// array list
		ArrayList<String> str1 = new ArrayList<String>();
		for(int i = 0; i < time ; i++){
			str1.append(Integer.toString(i));
		}
		long startTime = System.currentTimeMillis();
		str1.get(str1.size()/2);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.print("arrayList:");
		System.out.println(totalTime);

		// link list
		LinkedList<String> str2 = new LinkedList<String>();
		for(int i = 0; i < time ; i++){
			str2.append(Integer.toString(i));
		}
		startTime = System.currentTimeMillis();
		str2.get(str2.size()/2);
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("LinkedList:");
		System.out.println(totalTime);

		// double link list
		DoubleLinkedList<String> str3 = new DoubleLinkedList<String>();
		for(int i = 0; i < time ; i++){
			str3.append(Integer.toString(i));
		}
		startTime = System.currentTimeMillis();
		str3.get(str3.size()/2);
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("DoubleLinkList:");
		System.out.println(totalTime);
	} // end of get

	/**
	 * @param time
	 */
	public static void remove(int time){
		// array list
		ArrayList<String> str1 = new ArrayList<String>();
		for(int i = 0; i < time ; i++){
			str1.append(Integer.toString(i));
		}
		long startTime = System.currentTimeMillis();
		str1.remove(str1.size()/2);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.print("arrayList:");
		System.out.println(totalTime);

		// link list
		LinkedList<String> str2 = new LinkedList<String>();
		for(int i = 0; i < time ; i++){
			str2.append(Integer.toString(i));
		}
		startTime = System.currentTimeMillis();
		str2.remove(str2.size()/2);
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("LinkedList:");
		System.out.println(totalTime);

		// double link list
		DoubleLinkedList<String> str3 = new DoubleLinkedList<String>();
		for(int i = 0; i < time ; i++){
			str3.append(Integer.toString(i));
		}
		startTime = System.currentTimeMillis();
		str3.remove(str3.size()/2);
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("DoubleLinkList:");
		System.out.println(totalTime);
	} // end of remove

	/**
	 * @param time
	 */
	public static void search(int time){
		// array list
		ArrayList<String> str1 = new ArrayList<String>();
		for(int i = 0; i < time ; i++){
			str1.append(Integer.toString(i));
		}
		long startTime = System.currentTimeMillis();
		str1.search(Integer.toString(str1.size()/2), 0, str1.size());
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.print("arrayList:");
		System.out.println(totalTime);

		// link list
		LinkedList<String> str2 = new LinkedList<String>();
		for(int i = 0; i < time ; i++){
			str2.append(Integer.toString(i));
		}
		startTime = System.currentTimeMillis();
		str2.search(Integer.toString(str2.size()/2), 0, str2.size());
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("LinkedList:");
		System.out.println(totalTime);

		// double link list
		DoubleLinkedList<String> str3 = new DoubleLinkedList<String>();
		for(int i = 0; i < time ; i++){
			str3.append(Integer.toString(i));
		}
		startTime = System.currentTimeMillis();
		str3.search(Integer.toString(str3.size()/2), 0, str3.size());
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.print("DoubleLinkList:");
		System.out.println(totalTime);
	} // end of search
}