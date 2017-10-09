import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	LinkedList<String> str = new LinkedList<String>();
	@Test
	public void testAppend() {
		for(int i = 0; i < 100; i++){
			str.append(Integer.toString(i));
		}
		for(int i = 0; i < 100; i++){
			Assert.assertEquals(Integer.toString(i), str.get(i));
		}	
	}

	@Test
	public void testAdd() {
		for(int i = 0; i < 5; i++){
			str.append(Integer.toString(i));
			str.prepend(Integer.toString(i));
		}
		str.add(5, "add");
		Assert.assertEquals("add", str.get(5));
		str.add(0, "start");
		Assert.assertEquals("start", str.get(0));
		str.add(str.size(), "end");
		Assert.assertEquals("end", str.get(str.size()-1));
	}

	@Test
	public void testGet() {
		for(int i = 0; i < 100; i++){
			str.append(Integer.toString(i));
			Assert.assertEquals(Integer.toString(i), str.get(i));
		}
	}

	@Test
	public void testPrepend() {
		for(int i = 0; i < 100; i++){
			str.prepend(Integer.toString(i));
		}
		int counter = 0;
		for(int i = 99; i >= 0; i--){
			Assert.assertEquals(Integer.toString(i), str.get(counter));
			counter ++;
		}	
	}

	@Test
	public void testRemove() {
		for(int i = 0; i < 5; i++){
			str.append(Integer.toString(i));
			str.prepend(Integer.toString(i));
		}
		str.add(5, "add");
		str.add(0, "start");
		str.add(str.size(), "end");
		str.remove(0);
		Assert.assertEquals("4", str.get(0));
		str.remove(str.size()-1);
		Assert.assertEquals("4", str.get(str.size()-1));
		str.remove(5);
		Assert.assertEquals("0", str.get(5));
	}

	@Test
	public void testSearch() {
		for(int i = 0; i < 5; i++){
			str.append(Integer.toString(i));
			str.prepend(Integer.toString(i));
		}
		str.add(5, "add");
		str.add(0, "start");
		str.add(str.size(), "end");
		Assert.assertEquals(0,str.search("start", 0, str.size()));
		Assert.assertEquals(6,str.search("add", 0, str.size()));
		Assert.assertEquals(str.size()-1,str.search("end", 0, str.size()));
	}


	@Test
	public void testSize() {
		for(int i = 0; i < 100; i++){
			str.append(Integer.toString(i));
		}
		Assert.assertEquals(100, str.size());
	}
}
