/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz3;
import java.util.Scanner;
/**
 *
 * @author salgado's
 */
public class Matriz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamano de la matriz: ");
        int n = scanner.nextInt();
                    if (n % 2 == 0){
                        System.out.println("introduce un numero impar");                       
                    }
                    for (int i = 0; i < n; i++){
                        for (int j = 0; j < n; j++){
                            if (i <= n / 2){
                                if (j >= i && j < n - i){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                            } else {
                                if (j >= n - i - 1 && j <= i){
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println(); 
                    }
    }
}
