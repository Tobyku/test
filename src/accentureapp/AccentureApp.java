/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accentureapp;

import java.util.Scanner;

/**
 *
 * @author Tobiasz
 */
public class AccentureApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        
        String napis = in.nextLine();
        //zamienString(napis + "\n");
        
        System.out.println(zamienString(napis + "\n"));
    }
    
    static String zamienString(String first){
        String second = "";
        char znaki[] = new char[first.length()];
        int suma = 0;
        
        znaki = first.toCharArray();
        for(char spacja: znaki){
            if(spacja == 32 || spacja == 10){
                suma += 1;
            }
        }
        //System.out.println(suma);
        int x = suma + 1;
        int start = 0;
        String temp;
        String tab[] = new String[x];
        for (int i = 0; i < znaki.length; i++) {
            if(znaki[i] == 32 || znaki[i] == 10){
                temp = "";
                for (int j = start; j < i ; j++) {
                    
                    temp += Character.toString(znaki[j]);
                }
                //System.out.println(temp);
                if(temp.isEmpty() == false){
                    tab[suma] = temp;
                }
                suma -= 1;
                start = i+1;
            }
        }

        for (int i = 1; i < tab.length; i++) {
            //System.out.print(tab[i] + " ");
            second += tab[i] + " ";
        }
        
        return second;
    }
}
