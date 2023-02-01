package tech.ada.interfaces.funcional;

public class Usuario implements Autenticavel{

    @Override
    public boolean autenticar() {
        return Math.random() * 100 > 5;
    }


}
