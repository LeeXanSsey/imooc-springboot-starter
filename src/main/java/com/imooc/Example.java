package com.imooc;

public class Example {

	String str = new String("good");

	char[] array = {'a', 'b', 'c'};

	public static void main(String[] args) {

		Example example = new Example();
		example.change(example.str, example.array);
		System.out.println(example.str + " and ");
		System.out.println(example.array);
	}

	public void change(String str, char[] array) {

		str = "test  ok";
		array[0] = 'g';
	}
}
