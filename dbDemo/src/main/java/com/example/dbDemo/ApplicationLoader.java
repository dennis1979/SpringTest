package com.example.dbDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Slf4j
@Component
public class ApplicationLoader implements CommandLineRunner {
    @Autowired
    private BookService bookService;

    @Autowired
    private TimeService timeService;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Override
    public void run(String... args) throws Exception {
        try {
            bookService.getBook();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(int i = 0 ; i < 30 ; i++){
            System.out.println(sdf.format(timeService.getTime()));
            Thread.sleep(1000);
        }
    }
}
