public class AboutMe {
    public static void main(String[] argv) throws Exception {
        String nome = argv[0];
        String sobrenome = argv[1];

        int idade = Integer.valueOf(argv[2]);
        double altura = Double.valueOf(argv[3]);

        System.out.println("Olá, meu nome é: " + nome + " " + sobrenome);
        System.out.println("Minha idade é: " + idade + " anos");
        System.out.println("Minha altura é : " + altura + "cm");
    }
}
