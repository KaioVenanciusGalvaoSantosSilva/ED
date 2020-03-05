package ExemploFila;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample4 {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		
		//Adicionar os elementos {0,1,2,3,4} na fila
		for (int i = 0; i < 5; i++) {
			fila.add(i);
		}
		
		//Mostra o conteudo da fila:
		System.out.println("Elementos da fila: "+ fila);
		
		//Remover o cabeça da fila
		int elemento_removido = fila.remove();
		System.out.println("Elemento Removido :" +elemento_removido);
		
		System.out.println(fila);
		
		//Visualizar o cabeça da fila
		int head = fila.peek();
		System.out.println("Cabeça da fila: "+ head);
		
		//Todo os demais metodos da Interface Collection,
		//tais como size e contains podem ser usados com esta implementação
		int tamanho = fila.size();
		System.out.println("Tamanho da Fila: "+ tamanho);
		
		System.out.println("PEEK :" + fila.peek());

		System.out.println("ELEMENTO :" + fila.element());
		
		
	}
	

}
