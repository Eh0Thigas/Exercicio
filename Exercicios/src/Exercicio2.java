public class Exercicio2 {
    public static void main(String[] args) {
        
        // EXERCICIO EM SALA DE AULA 2
        // IMPRIMA A SOMA DE 1 ATÉ 1000
        // Inicializando variavies 
        int i = 0;
        int NumeroAnterior = 0;
        int soma = 0;
        
        while(i <=1000){
            NumeroAnterior = soma; // numeroanterior recebe soma
            soma = i + NumeroAnterior;

            System.out.println(NumeroAnterior + " + " + i + " = " + soma);
            i++;
        }
    }
}
