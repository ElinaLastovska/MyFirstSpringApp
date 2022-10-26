package io.codelex.myfirstspringapp;

import io.codelex.myfirstspringapp.Domain.Person;
import org.apache.catalina.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {
    private final PageService pageService;

    public Controller(PageService pageService) {
        this.pageService = pageService;
    }

    @CrossOrigin()
    @GetMapping(value = "/getTime")
    public String getTime() {
        String pattern = "HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }

    @CrossOrigin()
    @GetMapping(value = "/getPersons")
    public List<Person> getPerson(){
        return pageService.getPerson();
    }
    @CrossOrigin()
    @PostMapping("/savePerson")
    public void savePersons(@RequestBody Person person){
        pageService.savePersons(person);
    }

    @CrossOrigin()
    @PostMapping(value = "/saveText")
    public void saveText(@RequestBody String textToSave) {
        pageService.saveText(textToSave);
    }

    @CrossOrigin()
    @GetMapping(value = "/getSavedTexts")
    public String getText(){
    return pageService.getText();
    }


}
