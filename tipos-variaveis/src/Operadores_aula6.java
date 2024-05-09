public class Operadores_aula6 {

    public static void main(String[] args) {
        boolean condi1 = true;

        boolean condi2 = false;

        if(condi1 && condi2){
            System.out.println("As condições são verdadeiras!");
        }

        else if (condi1 || condi2){
            System.out.println("Uma das condições é verdadeira!");
        }
        else{
            System.out.println("As condições não são verdadeiras!");
        }
    }
    
}
