package roteiro6;

public class DoubleLinkedListNode extends SingleLinkedListNode {

	private DoubleLinkedListNode previous;

	public DoubleLinkedListNode(int atual, DoubleLinkedListNode next, DoubleLinkedListNode previous) {
		super(atual, next);
		this.previous = previous;
	}

	public DoubleLinkedListNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoubleLinkedListNode previous) {
		this.previous = previous;
	}
}
