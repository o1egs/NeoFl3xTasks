package ru.shtyrev.patterns.adapter.sd;

import ru.shtyrev.patterns.adapter.SDable;

public class SDImpl implements SDable {
    @Override
    public void connect() {
        System.out.println("sd connected");
    }
}
