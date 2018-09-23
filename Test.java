package array_list;

import java.util.ArrayList;

public class Test {
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	public void input() {
		arr.add(8);
		arr.add(1);
		arr.add(9);
		arr.add(-7);
		arr.add(6);
		
	}
	public int sum() {
		int s=0;
		for (int i=0;i<arr.size();i++)
			s+=arr.get(i);
		return (s);
	}
	
	public void set() {
		
	}
	@Override
	public String toString() {
		return arr.toString();
	}
	
	public static void main(String []args) {
		Test test =new Test();
		test.input();
		System.out.println(test.toString());
		System.out.println(test.sum());
	}
}
