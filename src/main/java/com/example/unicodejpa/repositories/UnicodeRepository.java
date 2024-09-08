package com.example.unicodejpa.repositories;

import com.example.unicodejpa.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
}
