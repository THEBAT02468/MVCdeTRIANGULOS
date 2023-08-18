package main;

import Controlador.Controlador;
import modelo.Modelo;
import vistas.Inicio;

public class Main {
    public static void main(String[] args) {
        Modelo model=new Modelo();
        Inicio view=new Inicio();
        Controlador controller=new Controlador(view, model);
        controller.Iniciar();
        view.setVisible(true);
    }
}
