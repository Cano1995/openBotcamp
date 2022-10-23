public class Main {
    public static void main(String[] args) {
        //creamos el objeto mypersona
        Persona mypersona=new Persona();
        //asignamos datos a las variables
        mypersona.setNombre("Cristhian Cano Bogado");
        mypersona.setEdad(27);
        mypersona.setTelefono("(+595983) 337 567");
        //obtenemos lo ingresado y lo volcamos a nuevas variables
        String nombre= mypersona.getNombre();
        int edad= mypersona.getEdad();
        String telefono= mypersona.getTelefono();
        //mostramos por consola
        System.out.println("nombre      = "+nombre+"\n"+
                            "edad       = "+edad+"\n"+
                            "telefono   = "+telefono);
        //o bien
        System.out.println("Otra forma de imprimir directamente los get, si es que no son almacenados en una variable");
        System.out.println("nombre      = "+mypersona.getNombre()+"\n"+
                "edad       = "+mypersona.getEdad()+"\n"+
                "telefono   = "+mypersona.getTelefono());
    }

}


    class Persona{
        private int edad;
        private String nombre;
        private String telefono;

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

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    };