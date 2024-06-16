package dataStructure;

public class Stack {

    private Node top;
    private int height;

    // Classe interna Node
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Construtor para Stack
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // Método para obter o valor do topo da pilha
    public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

    // Método para obter a altura da pilha
    public void getHeight() {
        System.out.println("Altura: " + height);
    }

    // Método para imprimir a pilha
    public void print() {
        System.out.println("######################");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("######################");
    }

    // Método para empilhar um valor
    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    // Método para desempilhar um valor
    public Node pop() {
        if (height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

    // Método principal para testar a implementação da pilha
    public static void main(String[] args) {
        Stack myStack = new Stack(2);

        myStack.push(1);
        myStack.getTop();
        myStack.getHeight();
        myStack.print();


    }
}
