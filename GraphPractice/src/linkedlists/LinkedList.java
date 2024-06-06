/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 * Linked List with Head
 * 
 * @author Alejandro Loutphi
 */
public class LinkedList<E> {

    protected LinkedListNode<E> head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(E[] elts) {
        if (elts.length == 0) {
            this.head = null;
            return;
        }

        this.head = new LinkedListNode<E>(elts, 0);
    }

    public LinkedList(E elt) {
        this.head = new LinkedListNode<E>(elt, null);
    }

    /**
     * Returns the first Linked List node in the list
     */
    public LinkedListNode<E> getHead() {
        return this.head;
    }

    public void setHead(LinkedListNode<E> head) {
        this.head = head;
    }

    public void setHead(E elt) {
        LinkedListNode<E> next = null;
        if (!this.isEmpty())
            next = this.getHead().getNext();
        this.head = new LinkedListNode<E>(elt, next);
    }

    public boolean isEmpty() {
        return this.getHead() == null;
    }

    public int size() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.getHead().size();
    }

    public E get(int n) {
        if (this.isEmpty() || n < 0)
            return null;

        return this.getHead().get(n);
    }

    public LinkedListNode<E> getLastNode() {
        if (this.isEmpty())
            return null;

        return this.getHead().getLastNode();
    }

    public E getLast() {
        return this.getLastNode().getElt();
    }

    public boolean add(E elt) {
        if (this.isEmpty()) {
            this.head = new LinkedListNode<E>(elt, null);
            return true;
        }

        return this.getHead().add(elt);
    }

    public boolean add(int n, E elt) {
        if (n < 0)
            return false;

        if (n == 0) {
            this.setHead(elt);
            return true;
        }

        if (this.isEmpty())
            return false;

        return this.getHead().add(n, elt);
    }

    public E remove(int n) {
        if (n != 0)
            return this.getHead().remove(n);

        E o = this.getHead().getElt();
        this.setHead(this.getHead().getNext());
        return o;
    }

    public int indexOf(Object elt) {
        return this.getHead().indexOf(elt, 0);
    }

    public boolean set(int n, E elt) {
        if (n < 0)
            return false;
        return this.getHead().set(n, elt);
    }

    public boolean setAsEnd(int n, E elt) {
        if (n < 0)
            return false;
        return this.getHead().setAsEnd(n, elt);
    }
}
