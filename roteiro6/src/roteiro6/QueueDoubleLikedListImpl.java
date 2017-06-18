package roteiro6;

public class QueueDoubleLikedListImpl implements Queue {

	private int size;
	private DoubleLinkedListImpl list;
	
	public QueueDoubleLikedListImpl(int size) {
		list = new DoubleLinkedListImpl();
		this.size = size;
	}
	@Override
	public void enqueue(int elemento) {
		this.list.insert(elemento);

	}

	@Override
	public int dequeue() {
		if (isEmpty())
			return -1;
		int aux = list.getFirst().getValor();
		list.removeFirst();
		return aux;
	}

	@Override
	public boolean 	isEmpty() {
		return list.isEmpty() == true;

	}

	@Override
	public boolean isFull() {
		return list.size() == size;

	}

}
