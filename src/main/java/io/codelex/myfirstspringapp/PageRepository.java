package io.codelex.myfirstspringapp;


import io.codelex.myfirstspringapp.Domain.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PageRepository {
    private final List<Person> personList = new ArrayList<>();
    private final List<String> textsList = new ArrayList<>();

    public List<Person> getPerson(){
    return personList;
}


    public void savePersons(Person person){
        personList.add(person);
    }

    public void saveText(String textToSave) {
        textsList.add(textToSave);
    }

public List<String> getText(){
    return textsList;
}
}
