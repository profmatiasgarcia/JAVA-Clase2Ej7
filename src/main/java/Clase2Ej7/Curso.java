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
public class Curso {

    private String nomcur;
    private String nomdoc;
    private int lega;
    Alumno alum[] = new Alumno[4];

    public Curso() {
        nomcur = "";
        nomdoc = "";
    }

    public void Setncur(String ncur) {
        nomcur = ncur;
    }

    public void Setndoc(String ndoc) {
        nomdoc = ndoc;
    }

    public void Setlega(int l) {
        lega = l;
    }

    public void Setalum(Alumno a[]) {
        int i;
        for (i = 0; i < a.length; i++) {
            alum[i] = a[i];
        }
    }

    public String Getncur() {
        return nomcur;
    }

    public String Getndoc() {
        return nomdoc;
    }

    public int Getlega() {
        return lega;
    }

    public Alumno Getalum() {
        return alum[0];
    }

    public Curso(String ncur, String ndoc, int l, Alumno a[]) {
        int i;
        nomcur = ncur;
        nomdoc = ndoc;
        lega = l;
        for (i = 0; i < a.length; i++) {
            alum[i] = a[i];
        }
    }

    public void emitir() {
        int i;
        System.out.println("Curso= " + nomcur + "\nDocente= " + nomdoc + "\nLegajo= " + lega + "\n");

        for (i = 0; i < 4; i++) {
            alum[i].emitir();
        }
    }
}
