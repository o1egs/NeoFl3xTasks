package ru.shtyrev.patterns.adapter.usb;

import ru.shtyrev.patterns.adapter.SDable;
import ru.shtyrev.patterns.adapter.USBable;

public class SDAdapter implements USBable {
    private final SDable SDable;

    public SDAdapter(SDable SDable) {
        this.SDable = SDable;
    }

    @Override
    public void connect() {
        SDable.connect();
    }
}
