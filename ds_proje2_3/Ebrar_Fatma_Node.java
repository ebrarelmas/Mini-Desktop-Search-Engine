/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds_proje2_3;

/**
 *
 * @author Ebrar Yıldız
 */
public class Ebrar_Fatma_Node<T> {

    String word;
    int count;
    Ebrar_Fatma_Node left;
    Ebrar_Fatma_Node right;

    Ebrar_Fatma_Node(String word) {
        this.word = word;
        this.count = 1;
        left = right = null;
    }
}