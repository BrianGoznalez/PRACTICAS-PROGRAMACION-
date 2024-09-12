import java.util.Scanner;
public class pilas {
    
   
    public static void main(String[] args) {
        
        Scanner sc= new Scanner( System.in);
        
        Stack pila=new Stack();
        int op,el,tam;
        
        System.out.println("ingresa el tamaño");
        tam=sc.nextInt();
        do{
            
            System.out.println( "1.agregar\n2.eliminar\n3.mostrar");
            op=sc.nextInt();
            
            
            switch (op){
                
                case 1 -> {
                    for (int i=0; i<tam;i++){
                        System.out.println("que elemento a agregar");
                        el=sc.nextInt();
                        pila.push(el);
                      
                    }
                }
                case 2 -> {
                    System.out.println("que posicion de elementos  vas a eliminar");
                    el=sc.nextInt();
                    for(int i=0;i<el;i++){
                        pila.pop();
                    }
                }
                    
                case 3 -> System.out.println("pila: " +pila);
                case 4 -> op=4;
            }}while(op!=4);
       
                           
             
            }
        }