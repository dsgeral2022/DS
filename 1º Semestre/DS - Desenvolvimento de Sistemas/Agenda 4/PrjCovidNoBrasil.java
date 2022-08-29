/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prjcovidnobrasil;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author lucas_000
 */
public class PrjCovidNoBrasil {

    public static void regioesCovid(int casosPorRegiao[], String regiao[], int totalDeCasos) {
        String msg = "";
        Double[] porcentagemPorRegiao = new Double[5];
        DecimalFormat df = new DecimalFormat("###.##");

        for (int i = 0; i < 5; i++) {
            porcentagemPorRegiao[i] = (casosPorRegiao[i] / Double.valueOf(totalDeCasos)) * 100;

            msg += "Regiao " + regiao[i] + "\n"
                    + "Casos: " + casosPorRegiao[i] + "\n"
                    + "Porcentagem da regiao em relacao ao total: " + df.format(porcentagemPorRegiao[i]) + "\n"
                    + "__________________________ \n";
        }
        msg += "Total de Casos no Brasil: " + totalDeCasos;
        JOptionPane.showMessageDialog(null, msg, "Casos de Covid por Regiao", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casosPorRegiao[] = new int[5];
        String[] regiao = new String[5];
        int totalDeCasos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Regiao: ");
            regiao[i] = scanner.next();

            System.out.println("Quantidade de Casos: ");
            if (scanner.hasNextInt()) {
                casosPorRegiao[i] = scanner.nextInt();
            }
            totalDeCasos += casosPorRegiao[i];
        }
        regioesCovid(casosPorRegiao, regiao, totalDeCasos);

    }
}
