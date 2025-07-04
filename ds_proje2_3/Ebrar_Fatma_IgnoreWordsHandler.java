/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds_proje2_3;

/**
 *
 * @author Ebrar Yıldız
 */
import ds_proje2_3.Ebrar_Fatma_MyLinkedList.LLNode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ebrar_Fatma_IgnoreWordsHandler<T> {

    public Ebrar_Fatma_MyLinkedList<T> ignoreList;
    public LLNode<T> head;

    public Ebrar_Fatma_IgnoreWordsHandler() {
        ignoreList = new Ebrar_Fatma_MyLinkedList<T>();
    }

    public static Ebrar_Fatma_MyLinkedList<String> readLinesFromFile(File file) {
        Ebrar_Fatma_MyLinkedList<String> lines = new Ebrar_Fatma_MyLinkedList<>();

        try ( BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public boolean contains(T word) {
        LLNode<T> current = ignoreList.head;
        while (current != null) {
            if (current.data.equals(word)) {
                return true; // Kelimeyi bulduk, true döndür
            }
            current = current.next;
        }
        return false; // Kelimeyi bulamadık, false döndür
    }

    public void addToIgnoreList(Ebrar_Fatma_MyLinkedList<String> words) {
        LLNode<String> current = words.head;
        while (current != null) {
            ignoreList.add((T) current.data);
            current = current.next;
        }
    }
}
