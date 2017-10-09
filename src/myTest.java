
public class myTest {
	public static void main(String [] args){
		
		ArrayList<String> str = new ArrayList<String>();
		LinkedList<String> linkList = new LinkedList<String>();
		DoubleLinkedList<String> doubleLinkList = new DoubleLinkedList<String>();
		/*
		// add elements to the array list
		str.prepend("1");
		str.append("2");
		str.append("3");
		str.add(1,"4");
		str.add(0,"5");
		str.append("6");
		str.prepend("7");
		for(int i = 0; i< str.size(); i++){
			System.out.println(str.get(i));
		}
		str.remove(2);
		System.out.println("Size of al after additions: " + str.size());

		// display the array list
		for(int i = 0; i< str.size(); i++){
			System.out.println(str.get(i));
		}
		System.out.println("position: " + str.search("7", 0, str.size()));
		
		*/
		
		linkList.append("1");
		linkList.append("2");
		linkList.add(1, "3");
		linkList.append("4");
		linkList.prepend("5");
		linkList.add(1, "6");
		linkList.remove(linkList.size()-1);
		linkList.remove(0);
		//System.out.println("position: " + linkList.search("6", 0, linkList.size()));
		//System.out.println("position: " + linkList.search("4", 0, linkList.size()));	
		for(int i = 0; i< linkList.size(); i++){
			System.out.println(linkList.get(i));
		}
		
		
		/*
		doubleLinkList.append("1");
		//doubleLinkList.append("2");
		//doubleLinkList.append("3");
		//doubleLinkList.prepend("4");
		//doubleLinkList.prepend("5");
		//doubleLinkList.append("6");
		//doubleLinkList.append("7");
		//doubleLinkList.add(6,"8");
		//doubleLinkList.add(0,"9");
		//doubleLinkList.add(doubleLinkList.size(),"10");
		//doubleLinkList.remove(doubleLinkList.size()-1);
		for(int i = 0; i < doubleLinkList.size(); i++){
			System.out.println(doubleLinkList.get(i));
		}
		*/
		//System.out.println("position:" + doubleLinkList.search("1", 0, doubleLinkList.size()));
		
	}	
}
