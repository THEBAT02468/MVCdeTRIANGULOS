package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vistas.Inicio;



public class Controlador implements ActionListener{
    private Inicio view;
    private Modelo model;
    

    public Controlador(Inicio view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnOperar.addActionListener(this);
    }
    
    public void Iniciar(){
        view.setTitle("Triangulos");
        view.setLocationRelativeTo(null);
    }
    
    //Accion que hace al presionar el boton
    public void actionPerformed(ActionEvent e){
        model.setLado1(Integer.parseInt(JOptionPane.showInputDialog("Digite un lado:")));
        model.setLado2(Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo lado:")));
        model.setLado3(Integer.parseInt(JOptionPane.showInputDialog("Digite un tercer lado:")));
        
        model.comparar();
        

    }
    
}
