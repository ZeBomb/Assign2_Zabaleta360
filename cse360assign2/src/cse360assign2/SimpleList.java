/*
 * Author: Zoe Zabaleta
 * Class ID: 443
 * Assignment 1 CSE360 Spring 2020
 * a simple 10 integer array and methods to manipulate the list.
 */

package Assign1;

import java.lang.*;

public class SimpleList {

	private int list[];
	private int count;
	
	
	public SimpleList () {
		int LENGTH = 10;
		this.list = new int[LENGTH];
		this.count = 0;
	}
	public void add(int pInt) {
		if (count == 0) {
			list[0] = pInt;
		}
		else {//move all numbers 1 to the right
			for(int inc = count; inc >= 1; inc--) {
				if(inc != 10) {
					list [inc] = list[inc-1];
				}
			}
			list[0] = pInt;
		}
		if (count < 10) { // Increment count
			count++;
		}
	}
	public void remove(int pInt) {
		//find the number and index
		int index = -1;
		for(int inc = 0; inc <= 9; inc++) {
			if(list[inc] == pInt) {
				index = inc;
			}
		}
		if (index >= 0) {
			for(int inc = index; inc < 9; inc++) {
				list[inc] = list[inc + 1];
			}
			count --;
		}
	}
	public int count() {
		return count;
	}
	public String toString() {
		String str = "";
		for( int i = 0; i < count; i++) {
			str = str + " ";
			str = str + list[i];
		}
		
		return str;
	}
	public int search(int pInt) {
		int index = -1;
		for( int inc = 0; inc <= count; inc++) {
			if (list[inc] == pInt) {
				index = inc;
			}
		}
		return index;
	}
	
}

