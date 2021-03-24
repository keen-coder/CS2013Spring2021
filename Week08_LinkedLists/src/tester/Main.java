package tester;

import java.util.Random;

import linked_list.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(list + "\n");
		int size = list.size();
//		for (int i = 0 ; i <= size; i++) {
//			Integer deletedValue = list.deleteLast();
//			System.out.println(deletedValue);
//			System.out.println(list + "\n");
//		}
		
		Integer deletedValue = list.delete(2);
		System.out.println(deletedValue);
		System.out.println(list + "\n");
		
		deletedValue = list.delete(2);
		System.out.println(deletedValue);
		System.out.println(list + "\n");
		
		 deletedValue = list.delete(2);
		System.out.println(deletedValue);
		System.out.println(list + "\n");
		
		 deletedValue = list.delete(2);
		System.out.println(deletedValue);
		System.out.println(list + "\n");
		
		 deletedValue = list.delete(2);
		System.out.println(deletedValue);
		System.out.println(list + "\n");
		
		 deletedValue = list.delete(2);
			System.out.println(deletedValue);
			System.out.println(list + "\n");
		
			
			deletedValue = list.delete(0);
			System.out.println(deletedValue);
			System.out.println(list + "\n");
			
			deletedValue = list.delete(-12);
			System.out.println(deletedValue);
			System.out.println(list + "\n");
			
			deletedValue = list.delete(0);
			System.out.println(deletedValue);
			System.out.println(list + "\n");
		
		
		
		
		
		
		
		
		
//		Random r = new Random();
//
//		int value = 10;
//		
//		for (int i = 1 ; i <= 20 ; i++) {
//			int index = r.nextInt(list.size() + 1);
//			System.out.println("insert index: " + index);
//			
//			list.insert(index, value);
//			
//			value += 10;
//			System.out.println(list + "\n");
//		}
//		
//		list.insert(29, 1000);
//		System.out.println(list + "\n");
		
		
		
		
		
	}
}
