package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConsecutivoFactura taquilla1 = ConsecutivoFactura.getInstance();
        ConsecutivoFactura taquilla2 = ConsecutivoFactura.getInstance();

        //Error al llamar consecutivoFactura con new por el acceso privado al constructor
        //ConsecutivoFactura taquilla3 = new ConsecutivoFactura();

        //las dos taquillas apuntan al mismi objeto
        System.out.println(taquilla1 == taquilla2);

        //ambas taquillas comparten el mismo consecutivo
        System.out.println(taquilla1.siguiente());
        System.out.println(taquilla2.siguiente());
        System.out.println(taquilla1.siguiente());

        Compra c1 = new Compra.Builder().cliente("Santiago").funcion("Avatar 3").listaAsientos("A5").fecha(LocalDate.now()).build();
        Compra c2 = new Compra.Builder().cliente("Laura").funcion("Superman").listaAsientos("B5, B6").fecha(LocalDate.now()).promocion("Miercoles 2x1").puntosRedimidos(500).build();

        System.out.println(c1);
        System.out.println(c2);
    }


}

