package roteiro6;

public interface LinkedList {

	public boolean isEmpty();
	
	public int size();
	
	public int search(int elemento);
	
	public void insert(int elemento);
	
	public void remove(int elemento);
	
	public int[] toArray();
}
