package in.ashokit;

import java.lang.reflect.Field;

public class Test {
	
	public static void main(String args[]) throws Exception {
	
		
		  BillCollector bc= new BillCollector(); //injecting credit card object intobill collector (setter injection).
		  bc.setPayment(new CreditcardPayment());
		  bc.collectPayment(1400);
		  
		  //injecting credit card object into bill collector (constructor injection).
		  BillCollector bc1 = new BillCollector(new CreditcardPayment());
		  bc1.collectPayment(1500);
		 
		
		
		//injecting UpiPayment object into BillCollector using reflection api (field injection).
		Class<?> clz = Class.forName("in.ashokit.BillCollector");
		
		Field field = clz.getDeclaredField("payment");
		field.setAccessible(true);
		
		Object obj= clz.newInstance();
		field.set(obj, new UpiPayment());
		
		BillCollector bc2= (BillCollector) obj;
		bc2.collectPayment(2000.00);
		
		
		
	}
}
