package com.ibm.techgarage.cnb.pohemami.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ibm.techgarage.cnb.pohemami.backend.beans.RandomName;


public class RandomnamesService implements RandomnamesResource {

    final String[] rnames = {"Conchita Coombe", "Nakesha Nold", "Bee Bowland", "Linnea Lehmkuhl", "Katherina Kukla", "Lupe Lunde", "Brenna Belanger", "Danny Duenes", "Andreas Alcock", "Vicenta Visconti", "Cecilia Cumbee", "Tora Trusty", "Nedra Naab", "Francie Figueras", "Janel Justiniano", "Roxana Retzlaff", "Evia Eisenberg", "Leilani Lenox", "Olevia Ohanlon", "Margarita Minger", "Cecil Casselman", "Sherryl Seamans", "Cortney Choiniere", "Bettyann Bornstein", "Renae Renolds", "Kelle Karney", "Jordon Jeanpierre", "Dahlia Deherrera", "Nenita Neeson", "Michal Maxon", "Randa Ragan", "Catrice Claeys", "Walton Wachowiak", "Pia Presson", "Marty Masse", "Jamey Jeppson", "Linda Letarte", "Shalon Shepley", "Ines Isenhour", "Norene Newton", "Tobias True", "Bunny Bevill", "Fred Figg", "Malisa Mabon", "Lashawna Lagrone", "Reyes Roseborough", "Alesha Andrade", "Rolando Royals", "Rhiannon Rowley", "Frederica Farlow"};

    int size = 1;
    public RandomnamesService() {

    }

    @Override
    public List<RandomName> getRandomNames(Integer size) {
        if (size > 0) {
            this.size = size; 
        }
        List<RandomName> names = new ArrayList<>();
        for (int i = 0; i<this.size; i++) {
            RandomName name = new RandomName();
            name.setName(rnames[new Random().nextInt(rnames.length)]);
            names.add(name);
        }
    return names;
    }

    @Override
    public void createRandomName(Integer size, RandomName data) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public RandomName getRandomName(String randomnameId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateRandomName(String randomnameId, RandomName data) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteRandomName(String randomnameId) {
        // TODO Auto-generated method stub
        
    }
    
}
