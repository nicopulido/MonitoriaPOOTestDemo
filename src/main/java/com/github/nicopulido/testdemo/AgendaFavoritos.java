package com.github.nicopulido.testdemo;

import java.util.HashSet;
import java.util.Set;

public class AgendaFavoritos {
    private final Set<String> favoritos = new HashSet<>();

    public void marcar(String nombre) { favoritos.add(nombre); }
    public boolean esFavorito(String nombre) { return favoritos.contains(nombre); }
}