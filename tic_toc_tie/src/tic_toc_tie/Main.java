/**
 * 
 */
package tic_toc_tie;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author sahil
 *
 */
public class Main {
	public static void main(String[] args) {
//		TicTocTie ticTocTie = new TicTocTie();
//		System.out.print(ticTocTie.start());
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.submit( () -> {
			System.out.println("Task 1 is starting");
		});
		
		executorService.submit(() -> {
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				
			}
			
			System.out.println("new Task");
		});
		
		executorService.shutdown();
		
		try {
			boolean isTerminated = executorService.awaitTermination(5, TimeUnit.SECONDS);
			System.out.println("isAwaitTermination: " + isTerminated);
		}catch(Exception e) {
			
		}
		
//		executorService.submit(() -> {
//			System.out.println("Task 2 is starting");
//		});
		
		System.out.println("Main Thread");
	}

}
