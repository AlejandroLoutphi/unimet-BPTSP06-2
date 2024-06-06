/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Alejandro Loutphi
 */
public class DoubleCircularList<E> extends DoubleLinkedList<E> {

    public DoubleCircularList(E[] elts) {
        if (elts.length == 0) {
            this.head = null;
            return;
        }

        this.head = new DoubleLinkedListNode<E>(elts, null, 0);
        DoubleLinkedListNode<E> lastNode = (DoubleLinkedListNode<E>) this.getLastNode();
        lastNode.setNext(this.getHead());
        this.getHead().setPrev(lastNode);
    }

    public DoubleCircularList(E elt) {
        super(elt);
        this.getHead().setNext(this.getHead());
        this.getHead().setPrev(this.getHead());
    }

    @Override
    public void setHead(DoubleLinkedListNode<E> head) {
        DoubleLinkedListNode<E> pastHeadNext = this.getHead().getNext();
        this.head = head;
        if (pastHeadNext == null) {
            this.getHead().setNext(this.getHead());
            this.getHead().setPrev(this.getHead());
        }
    }

    @Override
    public void setHead(E elt) {
        DoubleLinkedListNode<E> next = null;
        if (!this.isEmpty())
            next = this.getHead().getNext();
        this.head = new DoubleLinkedListNode<E>(elt, (DoubleLinkedListNode<E>) this.getLastNode(), next);

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
    public DoubleLinkedListNode<E> getLastNode() {
        if (this.isEmpty())
            return null;

        if (this.getHead().getPrev() == null)
            return (DoubleLinkedListNode<E>) this.getHead().getLastNodeOfCircle(head);

        return this.getHead().getPrev();
    }

    @Override
    public E getLast() {
        return this.getLastNode().getElt();
    }

    @Override
    public boolean add(E elt) {
        if (this.isEmpty()) {
            this.head = new DoubleLinkedListNode<E>(elt, null, null);
            this.getHead().setNext(this.getHead());
            return true;
        }

        DoubleLinkedListNode<E> lastNode = (DoubleLinkedListNode<E>) this.getLastNode();
        lastNode.setNext(new DoubleLinkedListNode<E>(elt, lastNode, this.getHead()));
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
