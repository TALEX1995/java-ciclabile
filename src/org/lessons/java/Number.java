package org.lessons.java;

public class Number {

	private int[] numbers;
	private int currentIndex;
	
	public Number(int[] arrayNumber) {
		
		setNumbers(arrayNumber);
		this.currentIndex = 0;
		
	}
	
	public Number() {}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public int getElementoSuccessivo() {	
		int index = currentIndex;
		
		if(currentIndex < numbers.length - 1) {
			currentIndex++;
		} else {
			currentIndex = 0;
		}
		
		return numbers[index];
	}
	
	
	public boolean hasAncoraElementi() {
		return currentIndex != 0;
	}
	
	public void addElemento(int newNumber) {
		int[] newNumbers = new int[numbers.length + 1];
		
		for(int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[i];
		}
		
		newNumbers[numbers.length] = newNumber;
		
		numbers = newNumbers;
	}
	
}
