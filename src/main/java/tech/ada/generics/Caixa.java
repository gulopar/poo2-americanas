package tech.ada.generics;

public class Caixa<T> {

    private T objeto;

    public void colocarNaCaixa(T objeto) {
        System.out.println("Colocando " + objeto.getClass().getSimpleName() + " na Caixa");
        this.objeto = objeto;
    }

    public T pegarObjetoDaCaixa() {
        return this.objeto;
    }

}
