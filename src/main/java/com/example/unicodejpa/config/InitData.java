package com.example.unicodejpa.config;

import com.example.unicodejpa.model.Unicode;
import com.example.unicodejpa.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository ur;

    @Override
    public void run(String... args) throws Exception{
        Set<Character> charSet = new HashSet<>();
        Unicode unicode = new Unicode();

        for(int i=1;i <= Character.MAX_VALUE;i++ ){ // <= Character.MAX_VALUE chatgpt hjælp
            char c = (char)i;
            if(charSet.add(c)) {
                unicode.setCharacter(c);
                ur.save(unicode);
            }
        }

    }
}
