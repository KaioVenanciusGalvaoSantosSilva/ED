package ExemploFila;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class QueueExample3 {

	public static void main(String[] args) {
		Queue <String> waitingQueue = new LinkedList();
		
		waitingQueue.add("A");
		waitingQueue.add("B");
		waitingQueue.add("C");
		waitingQueue.add("D");
		
		System.out.println("===Iterações em java 8 usando o ForEach()=== ");
		waitingQueue.forEach(name -> {
			System.out.println(name);
		});
		
		System.out.println("\n===Iterações em fila usando Iterator()===");
		Iterator<String> waitingQueueIterator = waitingQueue.iterator();
		while(waitingQueueIterator.hasNext()) {
			String name = waitingQueueIterator.next();
			System.out.println(name);
		}
		
		System.out.println("\n===Iteraçoes com fila usando o loop For-Each()===");
		for(String name: waitingQueue) {
			System.out.println(name);
		}
		

	}

}
