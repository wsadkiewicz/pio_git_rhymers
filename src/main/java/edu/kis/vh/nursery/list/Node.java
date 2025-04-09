package edu.kis.vh.nursery.list;
/**
 * Klasa reprezentująca pojedynczy węzeł w dwukierunkowej liście.
 * Przechowuje wartość liczbową oraz poprzedni i następny węzeł.
 */
public class Node {

    private final int value;
    private Node prev;
    private Node next;

    /**
     * Tworzy nowy węzeł z określoną wartością.
     * @param i wartość przechowywana w węźle
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Zwraca wartość przechowywaną w węźle.
     * @return wartość przechowywana w węźle
     */
    public int getValue() {
        return value;
    }

    /**
     * Zwraca poprzedni węzeł.
     * @return poprzedni węzeł
     */
    public Node getPrev() {
        return prev;
    }


    /**
     * Ustawia poprzedni węzeł.
     * @param prev poprzedni węzeł
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Zwraca następny węzeł.
     * @return następny węzeł
     */
    public Node getNext() {
        return next;
    }

    /**
     * Ustawia następny węzeł.
     * @param next następny węzeł
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
