package com.concurrency.examples.random;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbersTest {

	public static void main(String[] args) {
		ThreadLocalRandom thR =  ThreadLocalRandom.current();
		for(int i=0;i<5;i++) {
			System.out.println("Next int : "+ thR.nextInt());
			System.out.println("Next long : "+ thR.nextLong());
		}
	}
}
