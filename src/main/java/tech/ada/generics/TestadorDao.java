package tech.ada.generics;

import tech.ada.generics.dao.AnimalDao;
import tech.ada.generics.dao.BolaDao;
import tech.ada.generics.dao.CanetaDao;
import tech.ada.generics.dao.DeleteAll;
import tech.ada.generics.objetos.Animal;
import tech.ada.generics.objetos.Bola;
import tech.ada.generics.objetos.Cachorro;
import tech.ada.generics.objetos.Caneta;

import java.util.UUID;

public class TestadorDao {

    public static void main(String[] args) {

        AnimalDao animalDao = new AnimalDao();
        BolaDao bolaDao = new BolaDao(new DeleteAll());
        CanetaDao canetaDao = new CanetaDao();
        
        animalDao.create(new Cachorro());
        bolaDao.create(new Bola());
        canetaDao.create(new Caneta());
        
        
        // não precisa realizar o casting
        Animal animal = animalDao.findById(UUID.randomUUID().toString());
        Bola bola = bolaDao.findById(1000L);
        Caneta caneta = canetaDao.findById(1);


    }
    
    
}
