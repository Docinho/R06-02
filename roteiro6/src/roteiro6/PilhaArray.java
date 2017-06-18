package roteiro6;

import java.util.Scanner;

class PilhaArray {
	int[] vetor;
	int topo;
	
	
	public PilhaArray(int tamanho) {
		this.vetor = new int[tamanho];
		this.topo = -1;
		
	}
	
	public static void main(String[] args) {
		Scanner tamanhoDaPilha = new Scanner(System.in);
		int size = tamanhoDaPilha.nextInt();
		
		PilhaArray p = new PilhaArray(size);
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			String[] comandos = sc.nextLine().split(" ");
			
			if(comandos[0].equals("end")) {
				break;
			}
			
			if(comandos[0].equals("push")) {
				p.push(Integer.parseInt(comandos[1]));
			}
			
			if(comandos[0].equals("pop")) {
				p.pop();
			}
			
			if(comandos[0].equals("peek")) {
				p.peek();
			}
			
			if(comandos[0].equals("print")) {
				p.print();
			}
		}
	}

	public void print() {
		String auxiliar = "";
		for(int i = 0; i <= topo; i++) {
			auxiliar+= vetor[i] + " ";
		}
		
		auxiliar = auxiliar.substring(0, auxiliar.length()-1);
		System.out.println(auxiliar);
		
	}

	public void peek() {
		System.out.println(vetor[topo]);
		
	}

	public void pop() {
		if(isEmpty()) {
			System.out.println("empty");
			return;
		}
		topo--;
		
	}

	public void push(int elemento) {
		if(isFull()) {
			System.out.println("full");
			return;
		}
		
		topo++;
		vetor[topo] = elemento;
	}
	
	public boolean isEmpty() {
		if (topo == -1) {
			return true;
		}
		
		return false;
	}
	
	public boolean isFull() {
		if(topo == vetor.length-1) {
			return true;
		}
		return false;
	}

}