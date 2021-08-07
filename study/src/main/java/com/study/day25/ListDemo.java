package com.study.day25;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		Random random = new Random();
		
		 //可以放重複資料
		List<Integer> nums = new LinkedList<>();
		IntConsumer consumer = IntConsumer -> {
			int n = random.nextInt(10);
			nums.add(n);
			
		};
		
		//sol1
		IntStream.rangeClosed(1, 4)
		.forEach(i ->{
			int n = random.nextInt(10);
			nums.add(n);
		});
		
		//sol2
		/*IntStream.rangeClosed(1, 4)
		.forEach(consumer);
		*/
		
		
		
		System.out.println(nums);
		
		//雙向走訪器
		ListIterator<Integer> iterator = nums.listIterator();
		while(iterator.hasNext())
		{
			int idx = iterator.nextIndex();
			int value = iterator.next();
			System.out.printf("%d = %d\n", idx ,  value);
		}
		
		while(iterator.hasPrevious())
		{
			int idx = iterator.previousIndex();
			int value = iterator.previous();
			System.out.printf("%d = %d\n", idx ,  value);
		}
		
		
	}
}
