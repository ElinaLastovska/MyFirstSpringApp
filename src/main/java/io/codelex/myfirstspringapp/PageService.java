package io.codelex.myfirstspringapp;


import io.codelex.myfirstspringapp.Domain.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PageService {
    private final PageRepository pageRepository;

    public PageService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }
    public List<Person> getPerson(){
        return pageRepository.getPerson();
    }


    public void savePersons(Person person){
        pageRepository.savePersons(person);
    }

    public void saveText(String textToSave) {
        pageRepository.saveText(textToSave);
    }


    public String getText(){
        return String.join("; ", pageRepository.getText());
    }
}
