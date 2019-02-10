package pl.edu.wszib.springtalkingwithworld;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping ("/user")



public class UserController {

    List<String> lista = new ArrayList<>();


    @GetMapping("/istnieje/{imie}/{nazwisko}")
    public ResponseEntity get(@PathVariable String imie, @PathVariable String nazwisko) {
        String osoba = imie + " " + nazwisko;
        if (lista.contains(osoba)) {
            ResponseEntity entity = new ResponseEntity(osoba, HttpStatus.OK);
            return entity;
        } else {
            ResponseEntity entity = new ResponseEntity(osoba, HttpStatus.NO_CONTENT);
            return entity;
        }
    }

    @PostMapping("/zapisz/{imie}/{nazwisko}")
    public ResponseEntity post(@PathVariable String imie,
                               @PathVariable String nazwisko) {
        String osoba = imie + " " + nazwisko;

        if (lista.contains(osoba)) {
            ResponseEntity entity = new ResponseEntity(HttpStatus.NOT_FOUND);
            return entity;
        } else {
            ResponseEntity entity = new ResponseEntity(HttpStatus.OK);
            return entity;

        }
    }

}

