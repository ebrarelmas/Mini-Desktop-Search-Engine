/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds_proje2_3;

/**
 *
 * @author Ebrar Yıldız
 */

public class Ebrar_Fatma_MyLinkedList<T> {
    public LLNode<T> head;
    public LLNode<T> tail;

    public Ebrar_Fatma_MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(T data) {
        LLNode<T> newNode = new LLNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
 

    public static class LLNode<T> {
        public T data;
        public LLNode<T> next;

        public LLNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
}