package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
@RequestMapping("/parameterTest")
public class RequestParamController {

    @GetMapping
    public ResponseEntity get (@RequestParam ("liczby") int [] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).count());
    }

}
