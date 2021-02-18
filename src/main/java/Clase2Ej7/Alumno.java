package Clase2Ej7;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private int lega;
    private float notas[];

    public Alumno() {
        nombre = "";
        apellido = "";
    }

    public Alumno(String nom, String ape, int l, float n1, float n2) {
        nombre = nom;
        apellido = ape;
        lega = l;
        notas[0] = n1;
        notas[1] = n2;
    } //sobrecarga
    
    public void Setnom(String nom) {
        nombre = nom;
    }

    public void Setape(String ape) {
        apellido = ape;
    }

    public void Setlega(int l) {
        lega = l;
    }

    public void Setnotas(float n[], int tam) {
        notas = new float[tam];
        int j;
        for (j = 0; j < tam; j++) {
            notas[j] = n[j];
        }
    }

    public String Getnom() {
        return nombre;
    }

    public String Getape() {
        return apellido;
    }

    public int Getlega() {
        return lega;
    }

    public float Getnotas() {
        return notas[0];
    }

    public void emitir() {
        int i, k;
        float suma = 0, prom = 0;

        System.out.println("Nombre= " + nombre + "\nApellido= " + apellido + "\nLegajo= " + lega + "\n");
        for (i = 0; i < notas.length; i++) {
            System.out.println("Nota" + i + "= " + notas[i]);
        }

        suma = 0;
        for (k = 0; k < notas.length; k++) {
            suma = notas[k] + suma;
        }
        prom = suma / (float) notas.length;
        System.out.println("Promedio del alumno " + nombre + "= " + prom + "\n");
        suma = 0;
    }
}
