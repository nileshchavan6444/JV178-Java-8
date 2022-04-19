package Java8Practice;

import java.util.Date;
import java.util.function.Supplier;

interface MySupplier {
	String get();
}

class SupplierImpl implements MySupplier {

	@Override
	public String get() {

		String otp = "";
		for (int i = 0; i < 6; i++) {
			otp = otp + (int) (Math.random() * 10);
		}
		return otp;
	}

}

public class SupplierDemo {

	public static void main(String[] args) {

		//MySupplier obj = new SupplierImpl();
		//System.out.println(obj.get());
		
		Supplier<String> obj = ()-> {

			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		
		String otp = obj.get();
		System.out.println(otp);
	

		Supplier<Date> d = ()->  new Date();
		Date date = d.get();
		
		System.out.println("current Date = " +  date);
		
		
	}
}
