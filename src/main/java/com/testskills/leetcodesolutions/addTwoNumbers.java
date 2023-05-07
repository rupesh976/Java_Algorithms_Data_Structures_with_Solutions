package com.testskills.leetcodesolutions;

/*

Author: [Rupesh Wagh]

You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

//  Definition for singly-linked list.
class ListNodes {
	int val;
	ListNodes next;

	ListNodes(int x) {
		val = x;
	}
}

public class addTwoNumbers {
	public ListNodes addTwoNumbers(ListNodes l1, ListNodes l2) {
		int carry = 0;
		ListNodes head = new ListNodes(0);
		ListNodes p = head;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			p.next = new ListNodes(carry % 10);
			p = p.next;
			carry /= 10;
		}
		if (carry == 1) {
			p.next = new ListNodes(carry);
		}
		return head.next;
	}
}