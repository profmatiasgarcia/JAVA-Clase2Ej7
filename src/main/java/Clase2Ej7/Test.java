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
import java.util.Scanner;

public class Test {

    public static void main(String[] argc) {
        Alumno alum[] = new Alumno[4];
        Alumno aux[] = new Alumno[4];
        float notas[];
        int i, j, t, lega;
        String nom, ape, nomc, nomd;
        Curso cur = new Curso();

        for (i = 0; i < 4; i++) {
            alum[i] = new Alumno();//nuevo alumno	

            System.out.println("Ingrese el nombre del alumno:");
            Scanner input_1 = new Scanner(System.in); //sentencia para tomar lectura de teclado
            nom = input_1.nextLine();//en nom guardo lo ingresado x pantalla
            alum[i].Setnom(nom); //guardo el valor en alum

            System.out.println("Ingrese el apellido del alumno:");
            ape = input_1.nextLine();//en ape guardo lo ingresado x pantalla
            alum[i].Setape(ape); //guardo el valor en alum

            System.out.println("Ingrese el legajo del alumno:");
            lega = input_1.nextInt();//en lega guardo lo ingresado x pantalla
            alum[i].Setlega(lega); //guardo el valor en alum

            System.out.println("Cuantas notas desea ingresar?:");
            t = input_1.nextInt();//en t guardo lo ingresado x pantalla
            notas = new float[t];//creo un vector de notas de tama�o t

            for (j = 0; j < t; j++) {
                System.out.println("Ingrese la nota " + j);
                notas[j] = input_1.nextFloat();//en el vector de notas guardo lo que ingrese x pantalla
            }

            alum[i].Setnotas(notas, t);//seteo las notas ingresadas				
        }

        for (i = 0; i < 4; i++) {
            for (j = 4 - 1; j > 0; j--) {
                if (alum[j].Getlega() < alum[j - 1].Getlega()) {//comparo el ultimo cn el primero
                    aux[j] = alum[j];//en la posicion j de aux gaurdo posicion j de alum
                    alum[j] = alum[j - 1];//en la posicon j de alum guardo la posicion j-1 de alum
                    alum[j - 1] = aux[j];//en la posicion j-1 de alum guardo aux[j]
                }
            }
        }

        System.out.println("Ingrese el nombre del Curso:");
        Scanner input_1 = new Scanner(System.in); //sentencia para tomar lectura de teclado
        nomc = input_1.nextLine();//en nomc guardo lo que ingreso x pantalla
        cur.Setncur(nomc); //guardo el valor en cur

        System.out.println("Ingrese el nombre del Docente a cargo de ese curso:");
        nomd = input_1.nextLine();//en nomd guardo lo que ingreso x pantalla
        cur.Setndoc(nomd); //guardo el valor en cur

        System.out.println("Ingrese el legajo del Docente:");
        lega = input_1.nextInt();//en lega guardo lo que ingreso x pantalla
        cur.Setlega(lega); //guardo el valor en cur

        cur.Setalum(alum);//seteo los alumnos
        cur.emitir();//emito cur
    }
}
