package fila;

public class Fila {

    private  int[]valores;
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila(){
        valores = new int[10];
        primeiro = 0;
        ultimo = 0;
        total=0;
    }

    public void push(int elemento){
        valores[ultimo] = elemento;
        ultimo = (ultimo+1)%valores.length;
        total++;

    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Fila está vazia!");
        }
        int elemento = valores[primeiro];
        primeiro = (primeiro+1)%valores.length;
        total--;
        return elemento;

    }
    public boolean isEmpty(){
        return total ==0;

    }
    public boolean isFull(){
        return total == valores.length;

    }
}
