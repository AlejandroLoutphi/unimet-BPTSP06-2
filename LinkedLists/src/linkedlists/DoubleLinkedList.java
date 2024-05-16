/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Alejandro Loutphi
 */
public class DoubleLinkedList<E> extends LinkedList<E> {

    public DoubleLinkedList() {
        super();
    }

    public DoubleLinkedList(E[] elts) {
        if (elts.length == 0) {
            this.head = null;
            return;
        }

        this.head = new DoubleLinkedListNode<E>(elts, null, 0);
    }

    public DoubleLinkedList(E elt) {
        this.head = new DoubleLinkedListNode<E>(elt, null, null);
    }

    @Override
    public DoubleLinkedListNode<E> getHead() {
        return (DoubleLinkedListNode<E>) head;
    }

    public void setHead(DoubleLinkedListNode<E> head) {
        this.head = head;
    }

    @Override
    public void setHead(E elt) {
        DoubleLinkedListNode<E> next = null;
        if (!this.isEmpty())
            next = this.getHead().getNext();
        this.head = new DoubleLinkedListNode<E>(elt, null, next);
    }

    @Override
    public boolean add(E elt) {
        if (this.isEmpty()) {
            this.head = new DoubleLinkedListNode<E>(elt, null, null);
            return true;
        }

        return this.getHead().add(elt);
    }

}
