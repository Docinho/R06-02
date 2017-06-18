package roteiro6;

public class SingleLinkedListNode {
	
	private SingleLinkedListNode next;
	private int valor;

	public SingleLinkedListNode(int valor, SingleLinkedListNode next) {
		this.valor = valor;
		this.next = next;
	}

	public SingleLinkedListNode getNext() {
		return next;
	}

	public void setNext(SingleLinkedListNode next) {
		this.next = next;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public boolean isNull() {
		return valor == 0;
	}
}
