package ru.shtyrev.patterns.adapter;

import ru.shtyrev.patterns.adapter.sd.SDImpl;
import ru.shtyrev.patterns.adapter.usb.SDAdapter;
import ru.shtyrev.patterns.adapter.usb.USBImpl;

public class Computer {
    public void read(USBable USBable) {
        USBable.connect();
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        USBImpl usb = new USBImpl();
        computer1.read(usb);

        Computer computer2 = new Computer();
        SDImpl sd = new SDImpl();
        SDAdapter sdAdapter = new SDAdapter(sd);
        computer2.read(sdAdapter);
    }
}
