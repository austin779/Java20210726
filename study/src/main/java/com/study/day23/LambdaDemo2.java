package com.study.day23;

import java.util.function.IntFunction;

public class LambdaDemo2 {
	/*public interface Function<>
	{
		
	}*/
	public interface IntFunction<R> {
		R apply(int value);
	 }
	 
	 public interface ToIntFunction<T> {
		int applyAsInt(T value);
	 }

}
