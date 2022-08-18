public class Exercicio3 {
    public static void main(String[] args) {
        // EXERCICIO EM SALA DE AULA 3
        //IMPRIMA TODOS OS NUMEROS MULTIPLOS DE 3, ENTRE 1 A 100
        
        int multiplo = 0;

        for(int i = 1; i <=100; i++){
            if(multiplo > 100){
                break;
            }else{
                multiplo = i * 3;
                System.out.println(multiplo);
            }
        }

        // outro exemplo 
        System.out.println("\n");
        for(int i = 0; i <=100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
