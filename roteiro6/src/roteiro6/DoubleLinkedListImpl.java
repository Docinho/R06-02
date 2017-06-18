package roteiro6;

import java.io.ObjectInputStream.GetField;
import java.util.DuplicateFormatFlagsException;

public class DoubleLinkedListImpl extends SingleLinkedList implements DoubleLinkedList {

	private DoubleLinkedListNode last;

	@Override
	public void insertFirst(int elemento) {
		if (!isEmpty()) {
			DoubleLinkedListNode aux = getLast();

			while (aux.getPrevious() != null)
				aux = aux.getPrevious();
			aux.setPrevious(new DoubleLinkedListNode(elemento, aux, null));
			super.setHead(aux.getPrevious());
		} else {
			insert((SingleLinkedListNode) (new DoubleLinkedListNode(elemento, null, null)));
		}
		modificarLast();
	}

	@Override
	public void insert(int elemento) {
		DoubleLinkedListNode aux = getLast();
		if (aux == null)
			insertFirst(elemento);
		else {
			aux.setNext(new DoubleLinkedListNode(elemento, null, aux));
			setLast((DoubleLinkedListNode) aux.getNext());
		}
	}

	private void modificarLast() {
		DoubleLinkedListNode aux = getLast();
		setLast(aux);
	}

	@Override
	public void removeFirst() {
		int first = super.getHead();
		remove(first);
	}

	@Override
	public void remove(int elemento) {
		if (!isEmpty()) {
			if (head.getValor() == elemento) {
				if (head.getNext() == null) {
					head = null;
					last = null;
				} else {
					head = head.getNext();
					((DoubleLinkedListNode) head).setPrevious(null);
				}
			} else {
				DoubleLinkedListNode aux = (DoubleLinkedListNode) head;
				while (aux != null) {
					if (aux.getValor() == elemento) {
						if (aux.equals(last))
							last = aux.getPrevious();
						aux.getPrevious().setNext(aux.getNext());
						if (aux.getNext() != null)
							((DoubleLinkedListNode) aux.getNext()).setPrevious(aux.getPrevious());

						break;
					}
					aux = (DoubleLinkedListNode) aux.getNext();
				}
			}
		}

	}

	@Override
	public void removeLast() {
		if (size() == 1) {
			remove(getHead());
		} else
			remove(getLast().getValor());
	}

	@Override
	public SingleLinkedListNode getFirst() {
		DoubleLinkedListNode aux = getLast();
		if (aux != null) {

			while (aux.getPrevious() != null) {
				aux = aux.getPrevious();
			}
		}
		return aux;
	}

	public DoubleLinkedListNode getLast() {
		if (size() == 0)
			return null;
		if (size() == 1)
			return (DoubleLinkedListNode) super.getFirst();
		return last;
	}

	public void setLast(DoubleLinkedListNode last) {
		this.last = last;
	}

}
