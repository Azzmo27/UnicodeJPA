package com.example.unicode.config;
import com.example.unicode.model.Unicode;
import com.example.unicode.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    UnicodeRepository unicodeRepository;


    @Override
    public void run(String... args) throws Exception {
        saveUnicodeCharacters(Set.of('A', 'B', 'C', '€', '$'));

    }
    private void saveUnicodeCharacters(Set<Character> unicodeCharacters) {
        for (Character ch : unicodeCharacters) {
            Unicode unicode = new Unicode((int) ch, ch, "Description for " + ch, "Name for " + ch);
            unicodeRepository.save(unicode);
        }
    }
}

