package com.example.quickstart.services.impl;

import com.example.quickstart.services.GreenPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
