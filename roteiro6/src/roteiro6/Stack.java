package roteiro6;

public interface Stack {
	
	
	public DoubleLinkedListNode pop();
	
	public DoubleLinkedListNode top();
	
	public boolean isEmpty();
	
	public boolean isFull();

	public void push(int elemento);

}
