package org.datastructures;

class DLink {
	public int iData;
	public DLink next;
	public DLink previous;

	public DLink(int id) {
		iData = id;
	}

	public String toString() {
		return "{" + iData + "} ";
	}
}

class DoublyLinkedList {
	private DLink first;
	private DLink last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int dd) {
		DLink newLink = new DLink(dd);
		if (isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(int dd) {
		DLink newLink = new DLink(dd);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	public DLink deleteFirst() {
		DLink temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public DLink deleteLast() {
		DLink temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public boolean insertAfter(int key, int dd) {
		DLink current = first;
		while (current.iData != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		DLink newLink = new DLink(dd);

		if (current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;

			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}

	public DLink deleteKey(int key) {
		DLink current = first;
		while (current.iData != key) {
			current = current.next;
			if (current == null)
				return null;
		}
		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}

		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}

	public String toString() {
		String str = "List (first-->last): ";
		DLink current = first;
		while (current != null) {
			str += current.toString();
			current = current.next;
		}
		System.out.println("");
		System.out.print("List (last-->first): ");

		current = last;
		while (current != null) {
			str += current.toString();
			current = current.previous;
		}
		return str;
	}
}

public class DLLMainClass {
	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();

		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);

		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);

		System.out.println(theList);

		theList.deleteFirst();
		theList.deleteLast();
		theList.deleteKey(11);

		System.out.println(theList);

		theList.insertAfter(22, 77);
		theList.insertAfter(33, 88);

		System.out.println(theList);
	}
}