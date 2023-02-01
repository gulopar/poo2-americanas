package tech.ada.generics.dao;

public interface Dao<T, K> {

    T create(T objectDao);

    T findById(K id);

    void update(T objectDao);

    boolean delete(K id);

}
