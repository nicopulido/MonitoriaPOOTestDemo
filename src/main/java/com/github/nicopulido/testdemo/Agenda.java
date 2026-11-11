package com.github.nicopulido.testdemo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Contacto> contactos = new ArrayList<>();

    public void agregar(Contacto c) { contactos.add(c); }
    public List<Contacto> getContactos() { return contactos; }

    public void listar() {
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }
}