package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class Cart {

    private final List<Integer> items = new ArrayList<>();

    public void add(Integer[] ids) {
        for (Integer id : ids) {
            items.add(id);
        }
    }

    public List<Integer> getAll() {
        return Collections.unmodifiableList(items);
    }
}
