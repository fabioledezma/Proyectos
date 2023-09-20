public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void planificarEntrenamiento(){
        System.out.println("Estoy dirigiento el entrenamiento...");
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Estoy dirigiento en el partido de Futbol.");
    }

    @Override
    public void entrenamiento(){
        System.out.println("Soy el entrenador que entrana.");
    }
}
