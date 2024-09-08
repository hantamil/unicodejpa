package com.example.unicodejpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i){
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }
    //browser prints unicode=97 char=a with endpoint localhost:8080/unicode/97


    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c){
        int i = (int)c;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/print-letters/{i}/{c}")
    public String printLetters(@PathVariable int i, @PathVariable char c){
        StringBuilder sb = new StringBuilder();
        char letterOfChoice = c;

        for(int ii=0;ii < i;ii++){
            sb.append(letterOfChoice);
            letterOfChoice++;
        }
        return sb.toString();
    }
}
