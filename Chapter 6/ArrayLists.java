import java.util.ArrayList;

public class ArrayLists{
	public static void main(String[] args){
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		//To Add
		list.add(2, "Clinton");
		
		//To Remove
		list.remove("Henry");
		list.remove(3);
		
		//To Clear the list
		list.clear();
		
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		//To Get
		System.out.println(list.get(3));
		System.out.println("==============================");
		
		//To update
		list.set(3, "Peter");
		
		for(String name: list){
			System.out.printf("%s%n", name);
		}
	}
}
		