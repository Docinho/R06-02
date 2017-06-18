package roteiro6;

public class SingleLinkedList implements LinkedList {

	protected SingleLinkedListNode head;

	public SingleLinkedList() {
		this.head = null;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public int size() {
		SingleLinkedListNode aux = head;
		int valor = 0;
		while (aux != null) {
			aux = aux.getNext();
			valor++;
		}
		return valor;
	}

	@Override
	public int search(int elemento) {
		SingleLinkedListNode aux = head;
		int valor = -1;
		while (aux != null) {
			if (aux.getValor() == elemento) {
				valor = aux.getValor();
				break;
			}
			aux = aux.getNext();
		}
		return valor;
	}

	public SingleLinkedListNode getFirst() {
		return head;
	}
	@Override
	public void insert(int elemento) {
		if (!isEmpty()) {

			SingleLinkedListNode aux = this.head;

			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(new SingleLinkedListNode(elemento, null));
		} else {
			this.head = new SingleLinkedListNode(elemento, null);
		}
	}

	@Override
	public void remove(int elemento) {
		if (!isEmpty()) {
			if (head.getValor() == elemento) {
				if (head.getNext() == null)
					head = null;
				else
					head = head.getNext();
			} else {
				SingleLinkedListNode aux = head;
				while (aux.getNext() != null) {
					if (aux.getNext().getValor() == elemento){
						aux.setNext(aux.getNext().getNext());
						break;
					}
					aux = aux.getNext();
				}
			}
		}
	}

	public int getHead() {
		if (isEmpty())
			return -1;
		return head.getValor();
	}


	public void insert(SingleLinkedListNode singleLinkedListNode) {
		head = singleLinkedListNode;
		
	}
	
	@Override
	public int[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setHead(DoubleLinkedListNode previous) {
		head = previous;
		
	}

}
