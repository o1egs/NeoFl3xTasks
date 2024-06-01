package ru.shtyrev.patterns.adapter.usb;

import ru.shtyrev.patterns.adapter.USBable;

public class USBImpl implements USBable {
    @Override
    public void connect() {
        System.out.println("usb connected");
    }
}
