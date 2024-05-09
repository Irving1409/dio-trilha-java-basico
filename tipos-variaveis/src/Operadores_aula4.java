public class Operadores_aula4 {

    public static void main(String[] args) {

    int numero1 = 5;
    int numero2 = 6;

    String resultado = "";
    if(numero1 == numero2){
        resultado = "Verdadeiro";
    }
    else{
        resultado = "Falso";
    }
    System.out.println(resultado);

    String resultado2 = numero1 != numero2 ?"Verdadeiro" : "Falso";
    System.out.println(resultado2);
}
}
