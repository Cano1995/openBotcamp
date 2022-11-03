public class Main {
    public static void main(String[] args) {
        Cliente cliente =new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.setNombre("Cristhian");
        cliente.setEdad(15);
        cliente.setTelefono(983337567);
        cliente.setCredito(2500000);
        trabajador.setSalario(3000000);
        System.out.println("Nombre: "+cliente.getNombre()+"\n"+
                            "Edad: "+cliente.getEdad()+"\n"+
                            "Telefono: "+cliente.getTelefono()+"\n"+
                            "Tiene una linea de credito de "+cliente.getCredito()+"\n"+
                            "Su salario es de "+trabajador.getSalario());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends  Persona{
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}