public class Vetor {

    /* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 8)  Vetor só com 0
* Data: 23/04/23
*/
    public static void main(String[] args) {
        // Cria um vetor de tamanho 50
        int[] vetor = new int[50];

        // Preenche o vetor com o valor zero
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }

        // Imprime o vetor preenchido
        System.out.println("Vetor preenchido com zeros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}