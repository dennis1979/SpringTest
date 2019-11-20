package com.example.dbDemo;

import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;
import java.util.Date;

@Service
public class TimeService {

    @Cacheable(cacheNames = "getTime")
    public Date getTime() {
        return new Date();
    }

    @Cacheable("currentTimeMillis")
    public Long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
