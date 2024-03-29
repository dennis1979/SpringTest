package com.example.dbDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Service
public class BookService {
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    @Retryable(include = {NoResultException.class}, maxAttempts = 3, backoff = @Backoff(value = 2000))
    public Book getBook(){
        int count  = atomicInteger.incrementAndGet();
        log.info("count = " + count);
        if (count < 5){
            throw new NoResultException();
        } else{
            return new Book();
        }
    }

    @Recover
    public Book recover(NoResultException e){
        log.info("get NoResultException & return null");
        return null;
    }

}
