package br.com.byte_bank_v5.test;

public class TestingPrimitiveArray {

	public static void main(String[] args) {
		
		int[] ages = new int[5];
		
		ages[0] = 19;
		ages[1] = 29;
		ages[2] = 39;
		ages[3] = 69;
		ages[4] = 59;
		
		System.out.println(ages[4]);
		
		System.out.println(ages.length);
		
		for(int index = 0; index < ages.length;index++) {
			ages[index] += index;
		}
		
		for(int index = 0; index < ages.length;index++) {
			System.out.println(ages[index]);
		}
	}
}
