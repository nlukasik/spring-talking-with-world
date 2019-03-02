package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/Header")
public class HeaderController {
@ResponseStatus (HttpStatus.BAD_REQUEST)
    private static class Exception1 extends RuntimeException{
    }
    @ResponseStatus (HttpStatus.OK)
    private static class Exception2 extends RuntimeException {
    }
    @ResponseStatus (HttpStatus.NOT_FOUND)
    private static class Exception3 extends RuntimeException {
    }

    @GetMapping
    public String test(){
        int a = new Random().nextInt(3);
    if (a == 1 ) {
        throw new Exception1();
    } else if (a == 2 ) {
        throw new Exception2();
    } else {
        throw new Exception3();
    }

    }

    @ExceptionHandler(Exception1.class)
    public String exception() {
        return "images";
    }
    @ExceptionHandler(Exception2.class)
    public String exception1() {
        return "images1";
    }
    @ExceptionHandler(Exception3.class)
    public String exception2() {
        return "images2";
    }

}
