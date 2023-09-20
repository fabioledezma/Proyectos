
public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void entrevista(){
        System.out.println("Estoy en una entrevista de futbolista...");
    }

    public void viajar(){
        System.out.println("Viajando futbolista...");
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Estoy jugando un partido de futbol.");
    }

    @Override
    public void entrenamiento(){
        System.out.println("Soy un futbulista entrenando para jugar...");
    }

}
