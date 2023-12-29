package com.example.quickstart.services.impl;

import com.example.quickstart.services.BluePrinter;
import com.example.quickstart.services.ColourPrinter;
import com.example.quickstart.services.GreenPrinter;
import com.example.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;

    private BluePrinter bluePrinter;

    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }


    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
