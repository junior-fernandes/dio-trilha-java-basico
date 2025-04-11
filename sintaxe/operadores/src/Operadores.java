public class Operadores {

    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //VALOR POSITIVO E NEGATIVO
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        //REPETIÇÃO
        numero = numero + 1;
        numero++;
        numero--;

        boolean variavel = true;
        System.out.println(!variavel);
        variavel = !variavel;

        int a = 5;
        int b = 6;
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);



    }

}
