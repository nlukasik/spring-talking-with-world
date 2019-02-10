package pl.edu.wszib.springtalkingwithworld.model;

import org.springframework.context.annotation.Bean;

public class Restauracja {

   @Bean
    public static double koszt(Klient klient) {


        double wynik = 25;
        if (klient.osobaTowarzyszaca) {
            wynik += 15;
        }
        if (klient.dziecko) {
            wynik += 15;
        }
        if (klient.zwierze) {
            wynik += 15;
        }

        return wynik;
    }
}