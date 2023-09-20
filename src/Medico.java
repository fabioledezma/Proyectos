public class Medico extends Persona{
    private String titulacion;
    private int experiencia;

    public Medico(String titulacion, int experiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Doy asistencia en el partido de Futbol");
    }

    @Override
    public void entrenamiento(){
        System.out.println("Doy asistencia en el entrenamiento.");
    }

    public void atencionMedica(){
        System.out.println("Asistir a los lesionados.");
    }

}

