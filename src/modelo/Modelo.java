package modelo;

import vistas.TE;
import vistas.TES;
import vistas.TI;

public class Modelo {

    int Lado1;
    int Lado2;
    int Lado3;
    int marcador;
    TE t1=new TE();
    TI t2=new TI();
    TES t3=new TES();

    

    public int getLado1() {
        return Lado1;
    }

    public void setLado1(int Lado1) {
        this.Lado1 = Lado1;
    }

    public int getLado2() {
        return Lado2;
    }

    public void setLado2(int Lado2) {
        this.Lado2 = Lado2;
    }

    public int getLado3() {
        return Lado3;
    }

    public void setLado3(int Lado3) {
        this.Lado3 = Lado3;
    }

    public int comparar() {
        if (this.Lado1 == this.Lado2 && this.Lado1 == this.Lado3
                && this.Lado2 == this.Lado3 && this.Lado2 == this.Lado3
                && this.Lado3 == this.Lado1 && this.Lado3 == this.Lado2) {
            //Triangulo equilatero
            this.marcador=1;
            t1.setTitle("Equilatero");
            t1.setLocationRelativeTo(null);
            t1.setEnabled(true);
            t1.setVisible(true);
            
        } else if (this.Lado1 == this.Lado2 && this.Lado1 != this.Lado3 && this.Lado2 !=this.Lado3
                || this.Lado2 == this.Lado3 && this.Lado2 != this.Lado1 && this.Lado3 !=this.Lado1
                || this.Lado3 == this.Lado1 && this.Lado3 != this.Lado2 && this.Lado1 !=this.Lado2) {
            //Triangulo isosceles
            this.marcador=2;
            t2.setTitle("Isosceles");
            t2.setLocationRelativeTo(null);
            t2.setEnabled(true);
            t2.setVisible(true);

        } else if (this.Lado1 != this.Lado2 && this.Lado1 != this.Lado3
                && this.Lado2 != this.Lado3 && this.Lado2 != this.Lado1
                && this.Lado3 != this.Lado1 && this.Lado3 != this.Lado2) {
            //Triangulo escaleno
            this.marcador=3;
            t3.setTitle("Escaleno");
            t3.setLocationRelativeTo(null);
            t3.setEnabled(true);
            t3.setVisible(true);

        }
        return this.marcador;
    }
}
