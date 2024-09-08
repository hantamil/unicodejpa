package com.example.unicodejpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unicode;


    private char character;
    private String description;
    private String name;

    public int getUnicode() {
        return unicode;
    }

    public char getCharacter() {
        return character;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}
