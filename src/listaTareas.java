import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaTareas {

    public static void main(String[] args) {
        List <String> listaTareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Elige una de las siguientes opciones; ");
            System.out.println("Opción 1: Añadir una tarea");
            System.out.println("Opción 2: Añadir la tarea en una posicion concreta");
            System.out.println("Opción 3: Eliminar una tarea segun la posicion de la misma");
            System.out.println("Opción 4: Mostrar todas las tareas");
            System.out.println("Opción 0: Salir");
            opcion= sc.nextInt();
            opcion= Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre de la tarea");
                    String tareanueva = sc.nextLine();
                    listaTareas.add(tareanueva);
                    break;

                case 2:
                    System.out.println("Introduce el nombre de la tarea ");
                    String tareaposicionada = sc.nextLine();
                    System.out.println("Introduce la posición donde se encontrará");
                    int posiciontarea = sc.nextInt();

                    if (posiciontarea >= 0 && posiciontarea<=listaTareas.size()){

                    }else {
                        System.out.println("Fuera de rango");
                    }
                    break;
                case 3:
                    System.out.print("Posición a eliminar: ");
                    int posElim = Integer.parseInt(sc.nextLine());

                    if (posElim >= 0 && posElim < listaTareas.size()) {
                        listaTareas.remove(posElim);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Error: Posición no válida.");
                    }
                    break;

                case 4:
                    if (listaTareas.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        for (int i = 0; i < listaTareas.size(); i++) {
                            System.out.println(i + ". " + listaTareas.get(i));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida.");

            }
        }while (opcion != 0);
    }
}
