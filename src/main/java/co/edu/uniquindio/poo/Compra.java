package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private final String cliente;
    private final String funcion;
    private final List<String> listaAsientos;
    private final String combo;
    private final String promocion;
    private final int puntosRedimidos;
    private final LocalDate fecha;
    private final String cortesia;

    private Compra(Builder builder) {
        this.cliente = builder.cliente;
        this.funcion = builder.funcion;
        this.listaAsientos = builder.listaAsientos;
        this.combo = builder.combo;
        this.promocion = builder.promocion;
        this.puntosRedimidos = builder.puntosRedimidos;
        this.fecha = builder.fecha;
        this.cortesia = builder.cortesia;
    }

    public static class Builder {
        private String cliente;
        private String funcion;
        private List<String> listaAsientos = new ArrayList<>();
        private String combo;
        private String promocion;
        private int puntosRedimidos = 0;
        private LocalDate fecha;
        private String cortesia;

        //Metodos fluidos return this y build
        public Builder cliente(String cliente) {
            this.cliente = cliente;
            return this;
        }
        public Builder funcion(String funcion) {
            this.funcion = funcion;
            return this;
        }
        public Builder listaAsientos(String asiento) {
            this.listaAsientos.add(asiento);
            return this;
        }
        public Builder combo(String combo) {
            this.combo = combo;
            return this;
        }
        public Builder promocion(String promocion) {
            this.promocion = promocion;
            return this;
        }
        public Builder puntosRedimidos(int puntosRedimidos) {
            this.puntosRedimidos = puntosRedimidos;
            return this;
        }
        public Builder fecha(LocalDate fecha) {
            this.fecha = fecha;
            return this;
        }
        public Builder cortesia(String cortesia) {
            this.cortesia = cortesia;
            return this;
        }

        //Validaciones
        public Compra build() {
            if (cliente == null) {
                throw new IllegalArgumentException("la compra debe tener un cliente");
            }
            if (funcion == null) {
                throw new IllegalArgumentException("la compra debe tener una funcion");
            }
            if (listaAsientos == null) {
                throw new IllegalArgumentException("la compra debe tener al menos un asiento");
            }
            if (fecha == null) {
                throw new IllegalArgumentException("la compra debe tener una fecha");
            }
            return new Compra(this);
        }
    }

    @Override
    public String toString() {
        return "Compra{" +
                "cliente='" + cliente + '\'' +
                ", funcion='" + funcion + '\'' +
                ", listaAsientos=" + listaAsientos +
                ", combo='" + combo + '\'' +
                ", promocion='" + promocion + '\'' +
                ", puntosRedimidos=" + puntosRedimidos +
                ", fecha=" + fecha +
                ", cortesia='" + cortesia + '\'' +
                '}';
    }
}
