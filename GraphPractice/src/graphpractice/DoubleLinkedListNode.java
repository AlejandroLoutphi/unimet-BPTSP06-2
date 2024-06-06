/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphpractice;

/**
 *
 * @author Alejandro Loutphi
 */
public class DoubleLinkedListNode<E> extends LinkedListNode<E> {

    protected DoubleLinkedListNode<E> prev;
    protected DoubleLinkedListNode<E> next;

    public DoubleLinkedListNode(
            E elt,
            DoubleLinkedListNode<E> prev,
            DoubleLinkedListNode<E> next) {
        super(elt, next);
        this.prev = prev;
    }

    public DoubleLinkedListNode(
            E[] elts,
            DoubleLinkedListNode<E> prev,
            int currIndex) {
        this.elt = elts[currIndex];
        this.prev = prev;
        int nextIndex = currIndex + 1;
        if (nextIndex == elts.length) {
            this.next = null;
            return;
        }

        this.next = new DoubleLinkedListNode<E>(elts, this, nextIndex);
    }

    public DoubleLinkedListNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedListNode<E> prev) {
        this.prev = prev;
    }

    public DoubleLinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode<E> next) {
        this.next = next;
    }

    @Override
    public boolean add(E elt) {
        if (this.next != null)
            return next.add(elt);

        this.next = new DoubleLinkedListNode<E>(elt, this, null);
        return true;
    }

    @Override
    public boolean add(int n, E elt) {
        if (n > 1) {
            if (this.next == null)
                return false;
            return this.next.add(n - 1, elt);
        }

        this.next = new DoubleLinkedListNode<E>(elt, this, this.next);
        this.getNext().getNext().setPrev(this.getNext());
        return true;
    }

    @Override
    public E remove(int n) {
        if (this.next == null)
            return null;

        if (n > 1)
            return this.getNext().remove(n + 1);

        E o = this.getNext().getElt();
        this.setNext(this.getNext().getNext());
        this.getNext().setPrev(this);
        return o;
    }

}


