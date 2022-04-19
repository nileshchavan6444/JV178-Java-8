package Java8Practice;

import java.util.function.Function;
//
//interface MyFunctionInterf
//{
//	Integer apply(String str);
//}
//
//class MyFunctionDemo implements MyFunctionInterf
//{
//
//	@Override
//	public Integer apply(String str) {
//		return str.length();
//	}
//	
//}

public class FunctionInterface {
	public static void main(String[] args) {
		
	//	MyFunctionInterf i = new  MyFunctionDemo();
		//System.out.println(i.apply("test"));
		
		Function<String, Integer> obj = str-> str.length();
		System.out.println(obj.apply("Java"));
		
		Function<Integer, Integer> square = no -> no * no;
		System.out.println(square.apply(5));
		
		
	
	}

}
