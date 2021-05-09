package module06;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos = new String[]{"Aluno 1", "Aluno 2", "Aluno 3"};
        String[] datas = new String[]{"Data 1", "Data 2", "Data 3", "Data 4", "Data 5"};
        String[][] diarioDeClasse = new String[datas.length][alunos.length];

        for (int i = 0; i < datas.length; i++) {
            System.out.println(datas[i]);
            for (int j = 0; j < alunos.length; j++) {
                System.out.print(alunos[j] + ": ");
                diarioDeClasse[i][j] = scanner.nextLine();
            }
        }
        System.out.print("        ");

        for (int i = 0; i < datas.length; i++) {
            System.out.print("  " + datas[i] + "  ");
        }
        System.out.println("");

        for (int i = 0; i < alunos.length; i++) {
            System.out.print(alunos[i] + ": ");
            for (int j = 0; j < datas.length; j++) {
                System.out.print(" " + diarioDeClasse[j][i] + " ");
            }
            System.out.println("");
        }
    }
}

