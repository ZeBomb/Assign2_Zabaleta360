/*
 * Author: Zoe Zabaleta
 * Class ID: 443
 * Assignment 2 CSE360 Spring 2020
 * a simple 10 integer array and methods to manipulate the list.
 */

package cse360assign2;

import java.lang.*;

public class SimpleList {

	private int list[];
	private int count;
	private int listSize;
	
	/**
	 * Initializes a list to a length of 10
	 */
	public SimpleList() {
		int LENGTH = 10;
		this.listSize = LENGTH;
		this.list = new int[LENGTH];
		this.count = 0;
	}
	/**
	 * Adds an integer to the front of the list, increases the list size 
	 * by 50% if the list is at capacity
	 * 
	 * @param pInt The integer to be added to the front of the list
	 * 
	 */
	public void add(int pInt) {
		if (count == listSize) { //Increase Size by 50%
			listSize = (int)listSize / 2 + (int)listSize;
			int replaceList[] = new int[count];
			for(int inc = 0; inc < count; inc ++) {
				replaceList[inc] = list[inc];
			}
			this.list = new int[listSize];
			for(int inc = 0; inc < count; inc ++) {
				list[inc] = replaceList[inc]; 
			}
		}
		if (count == 0) {
			list[0] = pInt;
		}
		else {//move all numbers 1 to the right
			for(int inc = count; inc >= 1; inc--) {
					list [inc] = list[inc-1];
			}
			list[0] = pInt;
		}	
		count++;
		return;
	}
	/**
	 * Searches for and removes the first instance of an integer
	 * does nothing if integer is not found
	 * 
	 * @param pInt
	 */
	public void remove(int pInt) {
		//find the number and index
		int index = -1;
		for(int inc = 0; inc < count; inc++) {
			if(list[inc] == pInt) {
				index = inc;
			}
		}
		if (index >= 0) {
			for(int inc = index; inc < count - 1; inc++) {
				list[inc] = list[inc + 1];
			}
			count --;
		}
		int space = listSize - count;
		int spaceGoal = listSize / 4;
		if ( space >= spaceGoal) {
			listSize = listSize - spaceGoal;
			int replaceList[] = new int[count];
			for(int inc = 0; inc < count; inc ++) {
				replaceList[inc] = list[inc];
			}
			this.list = new int[listSize];
			for(int inc = 0; inc < count; inc ++) {
				list[inc] = replaceList[inc]; 
			}
		}
	}
	/**
	 * Returns the current count of the list
	 * @return integer count in list
	 */
	public int count() {
		return count;
	}
	/**
	 * Prints out the list as a sting with a space in front of each number
	 * 
	 * @return the list as a string
	 */
	public String toString() {
		String str = "";
		for( int i = 0; i < count; i++) {
			str = str + " ";
			str = str + list[i];
		}
		
		return str;
	}
	/**
	 * Searches the list for the first instance of an integer
	 * @param pInt Integer that is being searched for
	 * @return index of the integer or -1 if not found
	 */
	public int search(int pInt) {
		int index = -1;
		for( int inc = 0; inc <= count; inc++) {
			if (list[inc] == pInt) {
				index = inc;
			}
		}
		return index;
	}
	/**
	 * Adds an integer to the end of the list
	 * @param pInt the integer to be added
	 */
	public void append(int pInt) {
		if (count == listSize) { //Increase Size by 50%
			listSize = (int)listSize / 2 + (int)listSize;
			int replaceList[] = new int[count];
			for(int inc = 0; inc < count; inc ++) {
				replaceList[inc] = list[inc];
			}
			this.list = new int[listSize];
			for(int inc = 0; inc < count; inc ++) {
				list[inc] = replaceList[inc]; 
			}
		}
		if (count == 0) {
			list[0] = pInt;
		}
		else {
			list[count] = pInt;
		}
		count++;
		return;
		}
	/**
	 * returns the first element in the list, returns -1 if list is empty
	 * @return integer that is the first element
	 */
	public int first() {
		int first = -1;
		if (count > 0) {
			first = list[0];
		}
		return first;
	}
	/**
	 * Returns the last element on a list, returns -1 if list is empty
	 * @return integer that is the first element
	 */
	public int last() {
		int last = -1;
		if (count > 0) {
			last = list[count - 1];
		}
		return last;
	}
	/**
	 * Returns the current size of the list array
	 * @return size of array as integer
	 */
	public int size() {
		return listSize;
	}
}

