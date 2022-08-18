public class Exercicio2 {
    public static void main(String[] args) {
        
        // EXERCICIO EM SALA DE AULA 2
        // IMPRIMA A SOMA DE 1 ATÉ 1000
        // Inicializando variavies 
        int i = 0;
        int NumeroAnterior = 0;
        int soma = 0;
        
        while(i <=1000){
            NumeroAnterior = soma; 
            soma = i + NumeroAnterior;

            System.out.println(NumeroAnterior + " + " + i + " = " + soma);
            i++;
        }

        /*
         * numeroanterior recebe soma entao como os dois estão em 0 
         * numeroanterior recebe 0 
         * depois soma recebe i + numero anterior (soma = 0 + 0)
         * e printa na tala a soma
         * depois i acrecenta 1 
         * e repete porem numeroanterior recebe 0 
         * soma recebe  1 + 0, logo soma = 1 
         * novamente repetindo e o i é incrementado mais 1
         * mas agr numero anterior recebe 1 (pois soma = 1 na repetição anterior)
         * e soma fica 2 + 1 (i + numeroAnterior)
         * e assim por diante 
         * 
         * 
         * 
         * OBS: inicializar as variaveis fora do laço de repetição se nao
         * todas as vezes que repitir as variaveis irao voltar a zero
         */
    }
}
