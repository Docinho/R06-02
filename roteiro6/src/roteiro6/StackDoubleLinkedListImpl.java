package roteiro6;

public class StackDoubleLinkedListImpl implements Stack {

	private DoubleLinkedListImpl list;
	private int size;

	public StackDoubleLinkedListImpl(int size) {
		list = new DoubleLinkedListImpl();
		this.size = size;;
	}
	@Override
	public void push(int elemento) {
		if(!isFull()) {
			list.insert(elemento);
		}
			
		
	}

	@Override
	public DoubleLinkedListNode pop() {
		DoubleLinkedListNode aux = null;
		
		if (!isEmpty()){
			aux = list.getLast();
			list.removeLast();
		}
		return aux;
	}

	@Override
	public DoubleLinkedListNode top() {
		return list.getLast();
		
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
		
	}

	@Override
	public boolean isFull() {
		return list.size() == this.size;
	}

}
