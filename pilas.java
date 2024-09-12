import java.util.Scanner;
public class pilas {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        int op = 0, el = 0, tam = 0;
        boolean inputValido;

        System.out.println("Ingresa el tamaño");
        while (true) {
            if (sc.hasNextInt()) {
                tam = sc.nextInt();
                break;
            } else {
                System.out.println("Elemento no válido, ingresa un número entero");
                sc.next(); // descarta la entrada no válida
            }
        }

        do {
            System.out.println("1. Agregar\n2. Eliminar\n3. Mostrar\n4. Salir");
            while (true) {
                if (sc.hasNextInt()) {
                    op = sc.nextInt();
                    break;
                } else {
                    System.out.println("Opción no válida, ingresa un número entero");
                    sc.next(); // descarta la entrada no válida
                }
            }

            switch (op) {
                case 1 -> {
                    for (int i = 0; i < tam; i++) {
                        System.out.println("Qué elemento deseas agregar");
                        inputValido = false;
                        while (!inputValido) {
                            if (sc.hasNextInt()) {
                                el = sc.nextInt();
                                pila.push(el);
                                inputValido = true;
                            } else {
                                System.out.println("Elemento no válido, ingresa un número entero");
                                sc.next(); // descarta la entrada no válida
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Cuántos elementos deseas eliminar");
                    inputValido = false;
                    while (!inputValido) {
                        if (sc.hasNextInt()) {
                            el = sc.nextInt();
                            inputValido = true;
                        } else {
                            System.out.println("Elemento no válido, ingresa un número entero");
                            sc.next(); // descarta la entrada no válida
                        }
                    }
                    for (int i = 0; i < el; i++) {
                        if (!pila.isEmpty()) {
                            pila.pop();
                        } else {
                            System.out.println("La pila está vacía, no se puede eliminar más elementos.");
                            break;
                        }
                    }
                }
                case 3 -> System.out.println("Pila: " + pila);
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (op != 4);
    }
}
