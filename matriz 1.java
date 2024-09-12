import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);  
         
           System.out.print("ingresa un numero: ");
        int mat = scanner.nextInt();
        
        char[][] matriz = new char[mat][mat];
        
        for (int i = 0; i < mat; i++) {
            for (int j = 0; j < mat; j++) {
               if (i == 0 || i == mat - 1 || j == 0 || j == mat - 1) {
                    matriz[i][j] = 'X';
                    } else {
                    matriz[i][j] = ' ';
                      }
            }
        }
             for (int i = 0; i < mat; i++) {
            for (int j = 0; j < mat; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
