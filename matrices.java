import java.util.Scanner;
public class matrices {
    
   
    public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);
        int opcion;        
        do {
            System.out.println("Menu de Opciones:");
            System.out.println("ingrese la matriz deseada:1.Matriz\n 2.Matriz\n 3.Matriz\n 4.salir\n");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Matriz 1");
                    System.out.print("ingresa un numero: ");
                    int mat = scanner.nextInt();
                    char[][] matriz = new char[mat][mat];
                    for (int i = 0; i < mat; i++){
                        for (int j = 0; j < mat; j++){
                            if (i == 0 || i == mat - 1 || j == 0 || j == mat - 1){
                                matriz[i][j] = '*';
                            }else{
                                matriz[i][j] = ' ';                               
                            }
                        }
                    }
                    for (int i = 0; i < mat; i++){
                        for (int j = 0; j < mat; j++){
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Matriz 2");
                    System.out.print("ingresa un numero: ");
                    int mas = scanner.nextInt();
                    char[][] matri = new char[mas][mas];
                    for (int i = 0; i < mas; i++){
                        for (int j = 0; j < mas; j++){
                            if (i>=j){
                                matri[i][j] = '*';
                            }else{
                                matri[i][j] = ' ';
                            }
                        }
                    }
                    for (int i = 0; i < mas; i++){
                        for (int j = 0; j < mas; j++){
                            System.out.print(matri[i][j] + " ");                            
                        }
                        System.out.println();
                    }                   
                    break;
                case 3:
                    System.out.println("Matriz 3");
                    System.out.print("ingresa un numero: ");
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
                    break;
                case 4:
                   System.out.println("a seleccionado salir");
                    break;                
            }
        } while (opcion != 4);

        scanner.close();
    }
}