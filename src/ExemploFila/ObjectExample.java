package ExemploFila;

import java.util.LinkedList;
import java.util.Queue;

public class ObjectExample {

	public static void main(String[] args) {
		Queue<Object> waitingQueue = new LinkedList<>();

		waitingQueue.add("Matheus");
		waitingQueue.add("Marcos");
		waitingQueue.add("Lucas");
		waitingQueue.add("Joao");
		waitingQueue.add("Paulo");

		System.out.println("Fila " + waitingQueue);

		Object name = waitingQueue.remove();
		System.out.println("Removido da Fila : " + name + " Nova Fila : " + waitingQueue);

	}
}
