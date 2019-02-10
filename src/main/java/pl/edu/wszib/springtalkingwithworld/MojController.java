package pl.edu.wszib.springtalkingwithworld;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.activation.MimeType;

@Controller
@RequestMapping("/moj")
public class MojController {

    //localhost/moj
    @GetMapping
    public ResponseEntity get () {
        ResponseEntity entity = new ResponseEntity("Hello world", HttpStatus.OK);
        return entity ;

    }
/*

    //localhost/moj/json
    @GetMapping (value = "/json", method =RequestMethod.GET, produces = "application/json")
    public ResponseEntity getJson () {
        String json = " blablala";
        ResponseEntity entity = new ResponseEntity(json, HttpStatus.OK);
        return entity ;

    }

*/


}


