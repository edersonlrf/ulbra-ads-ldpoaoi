/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcecoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ederson.fernandes
 */
public class TesteExcecoes4 {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Quantos anos voce tem ?");
            String inputLine = in.readLine();
            int idade = Integer.parseInt(inputLine);
            idade++;
            System.out.println("No proximo ano voce tera: " + idade);
        } catch (IOException exception) {
            System.out.println("Erro de I/O: " + exception);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            System.exit(1);
        }
    }

}
