package com.testskills.binarytree;

public class App {

	public static void main(String[] args) {

		BinarySearchTree<Person> bst = new BinarySearchTree<>();

		bst.insert(new Person(12, "Michael"));
		bst.insert(new Person(5, "Harry"));
		bst.insert(new Person(78, "Kevin"));
		bst.insert(new Person(56, "Nick"));
		bst.insert(new Person(34, "Daniel"));
		bst.insert(new Person(41, "Donald"));

		bst.traversal();

	}
}
