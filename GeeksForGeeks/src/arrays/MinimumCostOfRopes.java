package arrays;

import java.util.PriorityQueue;

/*There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost. Given N size array arr[] contains the lengths of the ropes.*/ 

public class MinimumCostOfRopes {
	public static long minCost(long[] arr, int n) 
    {
		long cost = 0;
		PriorityQueue<Long> ss = new PriorityQueue<>();
		for(Long l : arr ) {
			ss.add(l);
		}
		if(n == 0 || n == 1)
 			return 0;
 		while(n!=1) {
 			System.out.println(ss);
 			long a = ss.poll();
 			long b = ss.poll();
 			cost = cost + a + b;
 			long sum = a + b;
 			ss.add(sum);
 			n--;
 		}
 		return cost;
		
    }
}
