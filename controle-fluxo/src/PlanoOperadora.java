public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5 GB Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }    
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }

        /*if (plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if (plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        }else if (plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5 GB de Youtube");
        }*/
    }
}
