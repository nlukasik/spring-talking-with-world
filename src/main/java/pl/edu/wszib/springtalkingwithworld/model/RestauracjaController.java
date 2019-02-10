package pl.edu.wszib.springtalkingwithworld.model;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/restauracja")
public class RestauracjaController {

    Klient klient = new Klient();

    @GetMapping("/koszt")
    public ResponseEntity koszt (@RequestParam ("imie") String imie,
                                 @RequestParam(value= "osoba towarzyszaca", required = false) String osobaTowarzyszaca,
                                 @RequestParam(value = "dziecko", required = false) String dziecko,
                                 @RequestParam(value = "zwierze", required = false) String zwierze) {

        if (osobaTowarzyszaca != null){
            klient.osobaTowarzyszaca = true;
        }
        if (dziecko != null){
            klient.dziecko= true;
        }
        if (zwierze != null){
            klient.zwierze= true;
        }
        return ResponseEntity.ok(Restauracja.koszt(klient));
    }


}
