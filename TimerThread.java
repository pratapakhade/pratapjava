/*Write a thread program to display timer where timer
 *  will get refresh after every 10seconds.( Use Runnable implementation )
 */


package com.java.thread;

import java.text.SimpleDateFormat;
import java.util.*;

public class TimerThread implements Runnable {

	public synchronized void display() {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.print(sdf.format(date));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("present time:");
		while (true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.println("\ntime after 10 second:");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TimerThread tt = new TimerThread();
		Thread t = new Thread(tt);
		t.start();
	}

}
