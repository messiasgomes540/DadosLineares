package fila;

public class MainFila {

    public static void main(String[]args){

        Fila fila = new Fila();

        fila.push(1);
        fila.push(2);
        fila.push(3);

        while (!fila.isEmpty()){
            int x = fila.pop();
            System.out.println("retirei o elemento " + x);
        }


    }
}
