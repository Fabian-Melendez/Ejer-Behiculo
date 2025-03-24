import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        List<Cliente> cl1 = new ArrayList<>();
        List<Vehiculo> v1 = new ArrayList<>();

        while (true) {
            System.out.println("""
                    -------MENÚ-------
                    Seleccione una opcion:
                    
                    1. Registrar cliente
                    2. Registrar auto
                    3. Registrar camioneta
                    4. Registrar alquiler
                    5. Mostrar vehiculos disponibles
                    6. Registrar devolución de un vehiculo
                    7. Salir
                    """);
            int op = tc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Ingrese nombre del cliente: ");
                    String nom = tc.next();
                    System.out.print("Ingrese documento del cliente: ");
                    String cc = tc.next();
                    System.out.print("Ingrese número de licencia: ");
                    String nlic = tc.next();
                    cl1.add(new Cliente(nom, cc,nlic));
                    System.out.println("Cliente registrado.");
                }
                case 2 -> {
                    System.out.print("Ingrese marca: ");
                    String mar = tc.next();
                    System.out.print("Ingrese modelo: ");
                    String mod = tc.next();
                    System.out.print("Ingrese año: ");
                    int año = tc.nextInt();
                    System.out.print("Ingrese precio por día: ");
                    int pre = tc.nextInt();
                    System.out.print("Ingrese número de puertas: ");
                    int nPts = tc.nextInt();
                    v1.add(new Auto(mar, mod, año, pre, true, nPts));
                    System.out.println("Auto registrado.");
                }
                case 3 -> {
                    System.out.print("Ingrese marca: ");
                    String mar = tc.next();
                    System.out.print("Ingrese modelo: ");
                    String mod = tc.next();
                    System.out.print("Ingrese año: ");
                    int año = tc.nextInt();
                    System.out.print("Ingrese precio por día: ");
                    int pre = tc.nextInt();
                    System.out.print("Ingrese capacidad de carga en kg: ");
                    double kg = tc.nextDouble();
                    v1.add(new Camioneta(mar, mod, año, pre, true, kg));
                    System.out.println("Camioneta registrada.");
                }
                case 4 -> {
                    System.out.print("Ingrese nombre del cliente: ");
                    String nCl = tc.next();
                    Cliente c1 = cl1.stream().filter(c -> c.getNom().equalsIgnoreCase(nCl)).findFirst().orElse(null);
                    if (c1 == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }
                    System.out.print("Ingrese modelo del vehículo a alquilar: ");
                    String mod = tc.next();
                    Vehiculo ve1 = v1.stream().filter(v -> v.getMod().equalsIgnoreCase(mod) && v.isDis()).findFirst().orElse(null);
                    System.out.print("Ingrese cantidad de días de alquiler: ");
                    int dias = tc.nextInt();
                    double cTotal = dias * ve1.getPre();
                    if (dias > 7) {
                        cTotal *= 0.9;
                    }
                    ve1.setDis(false);
                    System.out.println("Alquiler registrado. Costo total: " + cTotal);
                }
                case 5 -> {
                    System.out.println("Vehículos disponibles:");
                    v1.stream().filter(Vehiculo::isDis).forEach(System.out::println);
                }
                case 6 -> {
                    System.out.print("Ingrese modelo del vehículo a devolver: ");
                    String mod = tc.next();
                    Vehiculo ve1 = v1.stream().filter(v -> v.getMod().equalsIgnoreCase(mod) && !v.isDis()).findFirst().orElse(null);
                    if (ve1 == null) {
                        System.out.println("Vehículo no encontrado o ya está disponible.");
                        break;
                    }
                    ve1.setDis(true);
                    System.out.println("Vehículo devuelto correctamente.");
                }
                case 7 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
