/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Alejandro Loutphi
 */
public class CircularList<E> extends LinkedList<E> {

    public CircularList(E[] elts) {
        if (elts.length == 0) {
            this.head = null;
            return;
        }

        this.head = new LinkedListNode<E>(elts, 0);
        this.getLastNode().setNext(this.getHead());
    }

    public CircularList(E elt) {
        super(elt);
        this.getHead().setNext(this.getHead());
    }

    @Override
    public void setHead(LinkedListNode<E> head) {
        LinkedListNode<E> pastHeadNext = this.getHead().getNext();
        this.head = head;
        if (pastHeadNext == null) {
            this.getHead().setNext(this.getHead());
        }
    }

    @Override
    public void setHead(E elt) {
        LinkedListNode<E> next = null;
        if (!this.isEmpty())
            next = this.getHead().getNext();
        this.head = new LinkedListNode<E>(elt, next);

        if (this.getHead().getNext() == null)
            this.getHead().setNext(this.getHead());
    }

    @Override
    public int size() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.getHead().sizeOfCircle(this.getHead());
    }

    @Override
    public LinkedListNode<E> getLastNode() {
        if (this.isEmpty())
            return null;

        return this.getHead().getLastNodeOfCircle(head);
    }

    @Override
    public E getLast() {
        return this.getLastNode().getElt();
    }

    @Override
    public boolean add(E elt) {
        if (this.isEmpty()) {
            this.head = new LinkedListNode<E>(elt, null);
            this.getHead().setNext(this.getHead());
            return true;
        }

        this.getLastNode().setNext(new LinkedListNode<E>(elt, this.getHead()));
        return true;
    }

    @Override
    public int indexOf(Object elt) {
        return this.getHead().indexOfInCircle(elt, 0, this.getHead());
    }

    @Override
    public boolean setAsEnd(int n, E elt) {
        if (n < 0)
            return false;
        return this.getHead().setAsEndOfCircle(n, elt, this.getHead());
    }
}
