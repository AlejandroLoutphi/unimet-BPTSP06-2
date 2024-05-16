/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

import java.util.Iterator;

/**
 * Node for Linked List with Head
 */
class LinkedListNode<E> implements Iterator<E> {

    protected E elt;
    protected LinkedListNode<E> next;

    public LinkedListNode() {
        this.elt = null;
        this.next = null;
    }

    public LinkedListNode(
            E elt,
            LinkedListNode<E> next) {
        this.elt = elt;
        this.next = next;
    }

    public LinkedListNode(
            E[] elts,
            int currIndex) {
        this.elt = elts[currIndex];
        int nextIndex = currIndex + 1;
        if (nextIndex == elts.length) {
            this.next = null;
            return;
        }
        this.next = new LinkedListNode<E>(elts, nextIndex);
    }

    /**
     * Returns the element housed in the current Linked List node
     */
    public E getElt() {
        return this.elt;
    }

    public void setElt(E elt) {
        this.elt = elt;
    }

    public LinkedListNode<E> getNext() {
        return this.next;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }

    /** {@inheritDoc} */
    public E next() {
        return this.getNext().getElt();
    }

    /** {@inheritDoc} */
    public boolean hasNext() {
        return this.next == null;
    }

    public int size() {
        if (this.next == null) {
            return 1;
        }
        return this.next.size() + 1;
    }

    public int sizeOfCircle(LinkedListNode<E> head) {
        if (this.next == head) {
            return 1;
        }
        return this.next.sizeOfCircle(head) + 1;
    }

    public boolean add(E elt) {
        if (this.next != null)
            return next.add(elt);

        this.next = new LinkedListNode<E>(elt, null);
        return true;
    }

    public boolean add(int n, E elt) {
        if (n > 1) {
            if (this.next == null)
                return false;
            return this.next.add(n - 1, elt);
        }

        this.next = new LinkedListNode<E>(elt, this.next);
        return true;
    }

    public E get(int n) {
        if (n > 0) {
            if (this.next == null)
                return null;
            return this.next.get(n - 1);
        }

        return this.elt;
    }

    public LinkedListNode<E> getLastNode() {
        if (this.next == null)
            return this;

        return this.getNext().getLastNode();
    }

    public E getLast() {
        return this.getLastNode().getElt();
    }

    public LinkedListNode<E> getLastNodeOfCircle(LinkedListNode<E> head) {
        if (this.next == null)
            return this;

        if (this.next == head) {
            return this;
        }
        return this.next.getLastNodeOfCircle(head);
    }

    public E remove(int n) {
        if (this.next == null)
            return null;

        if (n > 1)
            return this.getNext().remove(n + 1);

        E o = this.getNext().getElt();
        this.setNext(this.getNext().getNext());
        return o;
    }

    public int indexOf(Object elt, int n) {
        if (this.elt.equals(elt))
            return n;

        if (this.next == null)
            return -1;

        return this.next.indexOf(elt, n + 1);
    }

    public int indexOfInCircle(Object elt, int n, LinkedListNode<E> head) {
        if (this.elt.equals(elt))
            return n;

        if (this.next == null || this.next == head)
            return -1;

        return this.next.indexOfInCircle(elt, n + 1, head);
    }

    public boolean set(int n, E elt) {
        if (n == 0) {
            this.elt = elt;
            return true;
        }

        if (this.next == null)
            return false;

        return this.getNext().set(n - 1, elt);
    }

    public boolean setAsEnd(int n, E elt) {
        if (n == 0) {
            this.elt = elt;
            this.next = null;
            return true;
        }

        if (this.next == null)
            return false;

        return this.getNext().setAsEnd(n - 1, elt);
    }

    public boolean setAsEndOfCircle(int n, E elt, LinkedListNode<E> head) {
        if (n == 0) {
            this.elt = elt;
            this.next = head;
            return true;
        }

        if (this.next == null)
            return false;

        return this.getNext().setAsEndOfCircle(n - 1, elt, head);
    }
}
