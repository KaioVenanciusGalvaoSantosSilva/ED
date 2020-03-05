package ExemploFila;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample2 {

	public static void main(String[] args) {
		Queue<String> wantingQueue = new LinkedList();
		wantingQueue.add("Ana");
		wantingQueue.add("Maria");
		wantingQueue.add("Ester");
		wantingQueue.add("Debora");
		
		System.out.println("A fila esta vazia : " + wantingQueue.isEmpty());
		
		System.out.println("Tamanho da fila : " + wantingQueue.size());
		
		String nome = "Ester";
		if(wantingQueue.contains(nome)) {
			System.out.println("Fila contem : " + nome);
		}
		else {
			System.out.println("Fila não contem : " + nome);
		}

	}

}
