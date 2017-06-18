package roteiro6;

public interface Queue {
	

	public int dequeue();
	
	public boolean isEmpty();
	
	public boolean isFull();

	void enqueue(int elemento);

}
