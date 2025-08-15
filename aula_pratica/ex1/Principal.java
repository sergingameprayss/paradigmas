package aula_pratica;

import java.util.Scanner;

public class Principal {

   

    private static int media (Estudante[] estudantes) {
        int soma = 0;
        for (Estudante estudante : estudantes) {
            soma += estudante.getNotaFinal();
        }

        return soma / estudantes.length;
    }

    public static void main(String[] args) {
        int estudanteFinal = 0;
        int estudanteReprovado = 0;
        Scanner scanner = new Scanner(System.in);

        
        Estudante[] estudantes = new Estudante[5];

        for (int i = 0; i < 5; i++) {
            estudantes[i] = new Estudante();
            estudantes[i].armazenar(scanner.next(), scanner.nextInt());
            
            
            if (estudantes[i].getNotaFinal() >= 70) {
                estudantes[i].imprimir();
            } else if (estudantes[i].getNotaFinal() < 70 && estudantes[i].getNotaFinal() >= 40) {
                estudanteFinal++;
            } else {
                estudanteReprovado++;
            }
        }
        
        System.out.println("media da turma: " + media(estudantes));
        System.out.println("estudantes de Exame: " + estudanteFinal);
        System.out.println("estudantes Reprovados: " + estudanteReprovado);

        scanner.close();
    }
}
