public class switch_Case {
    public static void main(String[] args){
        var estacion="PRIMAVERA";
        switch (estacion) {
            case "VERANO":
                System.out.println("Esta en la estacion "+estacion);
                break;
            case "OTOÑO":
                System.out.println("Esta en la estacion "+estacion);
                break;
            case "INVIERNO":
                System.out.println("Esta en la estacion "+estacion);
                break;
            case "PRIMAVERA":
                System.out.println("Esta en la estacion "+estacion);
                break;
            default:
                System.out.println(estacion+" No es reconocida como una estacion");
                break;
        }
        }

    }

