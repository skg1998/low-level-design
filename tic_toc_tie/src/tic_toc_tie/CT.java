package tic_toc_tie;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
		executorService.schedule(() -> {System.out.println("Runnable 1");}, 2, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 2");}, 3, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 3");}, 4, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 4");}, 5, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 5");}, 6, TimeUnit.SECONDS);
		executorService.schedule(() -> {System.out.println("Runnable 6");}, 7, TimeUnit.SECONDS);
		Future<String> futureObj = executorService.schedule(() -> {return "Hello";}, 1, TimeUnit.SECONDS);
		try {
			System.out.println(futureObj.get());
		}catch(Exception e) {
			
		}
		
		System.out.println("Main Thread");
	}

}
