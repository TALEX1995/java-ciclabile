package org.lessons.java;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {2, 10, 42, 52, 43, 36, 623};
		
		Number number = new Number(numbers);
		
		number.addElemento(4);
		
		for(int i = 0; i < number.getNumbers().length; i++ ) {
			System.out.println(number.getElementoSuccessivo());
			System.out.println(number.hasAncoraElementi() ? "Ci sono altri elementi nell'array" : "Non ci sono altri elementi nell'array");
		}
		
	}

}
