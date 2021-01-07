/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdf;

/**
 *
 * @author raulp
 */
public class MiNumero {

    private double numero;

    public MiNumero(double n) {
        numero = n;
    }

    public double doble() {
        return (2 * numero);
    }

    public double triple() {
        return (3 * numero);
    }

    public double cuadruple() {
        return (4 * numero);
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double n) {
        numero = n;
    }

    public static void main(String[] args) {
        MiNumero numero = new MiNumero(7);
        System.out.println("El doble, triple y cuadruplé del siguiente numero: " + numero.getNumero());
        System.out.println("El doble: " + numero.doble());
        System.out.println("El triple: " + numero.triple());
        System.out.println("El cuadruple: " + numero.cuadruple());
    }

}
