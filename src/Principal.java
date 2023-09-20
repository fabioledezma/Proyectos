/*
    Este es un programa para simular un equipo de futbol que tengan:
    (futbolistas, entrenador y medico). Teniendo en cuenta lo siguiente:
    - Una super clase Persona, que tiene los siguientes datos: nombre, apellido y edad.
    - La sub clase Futbolista que tiene: dorsal, posicion.
    - la sub clase Entrenador tiene estrategia a utilizar.
    - la sub clase Doctor tiene la titulacion y experiencia.

Se implementan lo siguiente en el MENU del programa:
    - Viaje de equipo - entrenamiento - partido de futbol -
    - Planificar entrenamiento - Entrevista - curar lesion.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista1 = new Futbolista(10, "Delantero", "Leonel", "Messi", 33);
    static Persona futbolista2 = new Futbolista(7, "Delantero", "Cristiano", "Ronaldo", 33);
    static Persona entrenador = new Entrenador("Ofensivo", "Pep", "Guardiola", 55);
    static Persona medico = new Medico("Fisioterapeuta", 15, "Rafael", "Russe", 51);
    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        menu();

    }
    public static void menu(){
        int opcion;
        do {
            System.out.println("*** MENU ***");
            System.out.println("1. Viaje de equipo.");
            System.out.println("2. Entranamiento.");
            System.out.println("3. Partido de Futbol.");
            System.out.println("4. Planificar entrenamiento.");
            System.out.println("5. Entrevista.");
            System.out.println("6. Curar lesion.");
            System.out.println("7. Salir.");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();


            switch(opcion){
                case 1: System.out.println("");
                    viajarEquipo();//Viaje de equipo.
                    break;
                case 2: System.out.println("");
                    entranarEquipo(); //Entrenamiento.
                    break;
                case 3: System.out.println("");
                    partidoFutbol();//Partido de futbol.
                    break;
                case 4: System.out.println("");
                    planificarEntrenamiento();//Planificar entrenamiento.
                    break;
                case 5: System.out.println("");
                    //Entrevista.
                    break;
                case 6: atencionMedica(); //Atencion medica.
                    break;
                case 7: break;
                default: System.out.println("Error de opcion de menu.");
                    break;
            }
            System.out.println("");

        } while (opcion != 7);
    }

    public static void viajarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
            equipo.viajar();
        }
    }
    public static void entranarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" ->");
            equipo.entrenamiento();
        }
    }
    public static void partidoFutbol(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+ " "+equipo.getApellido()+" ->");
            equipo.partidoFutbol();
        }
    }
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" ->");
        ((Entrenador)entrenador).planificarEntrenamiento();

    }

    public static void darEntrevista(){
        System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+"->");
        ((Futbolista)futbolista1).entrevista();
        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" ->");
        ((Futbolista)futbolista2).entrevista();

    }

    public static void atencionMedica(){
        System.out.print(medico.getNombre()+" "+medico.getApellido()+" ->");
        medico.getApellido();
        ((Medico)medico).atencionMedica();

    }
}