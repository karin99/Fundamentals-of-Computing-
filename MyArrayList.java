package array_list;

public class MyArrayList <E> {
	private int n;	 
	private E []a; 
	private int capacity;
	
	public MyArrayList(){
		capacity=4;
		a= (E[]) new Object[capacity];
		n=0;
	}

/*	public MyArrayList(E capauty){
		a= (E[]) new Object[capacity];
		n=0;
	}*/
	
	public void add(E element){
		if(n==capacity){
			capacity=capacity*2;
			E []b= (E[]) new Object[capacity];
			System.arraycopy(a, 0, b, 0, n);
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		
		a[n]=element;
		n++;
		
	}
	public void output(){
		System.out.println();
		for (int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n");
			
	}
	
	public int size(){
		return n;
	}
	public E get(int index){
		if (index < 0 || index >= size()){
			System.out.print("\nOut of range");
			return null;
		}
		else
			return (E)a[index];
		
	}
	
	public void set(int index,E e){
		if (index < 0 || index >= size()){
			System.out.print("\nOut of range");
		}
		else
			 a[index]=e;		
	}
	
	public boolean contains(E e){
		 for(int i=0;i<n;i++)
			 if(a[i]==e) return true;
		 return false;
	 }
	
	public int indexOf(E e) {
		for(int i=0;i<size();i++) 
			if(a[i]==e) 
				return i;			
		return -1;
	}
	
	public void remove(int index) {
		if(index<0||index>=n)
			System.out.println("Invaild index");
		else {
			for (int i=index;i<n;i++)
				a[i]=a[i+1];
			n--;
		}
	}
	
	public void add(E element, int index){
		if(index<0||index>n)  //ktra thuoc mang
			System.out.println("Invaild index");
		else {
			//ktra mang day?
			if(n==a.length){
				E[]b=(E[]) new Object[a.length*2];
				for(int i=0;i<n;i++)
					b[i]=a[i];
				a=b;
			}
			for (int i=n;i>index;i--)
				a[i]=a[i-1];
			a[index]=element;
			n++;
		}	
	}
	
	@Override
	public String toString() {
		String s="";
		for (int i=0;i<n;i++)
			s=s+" "+a[i];
		return s;
	}
}
