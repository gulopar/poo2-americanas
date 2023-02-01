package tech.ada.generics.objetos;

public class Cachorro implements Animal {
    private Double peso;

    public Cachorro() {}

    public Cachorro(Double peso) {
        this.peso = peso;
    }

    public void informarPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public Double obterPeso() {
        return this.peso;
    }
    
}
