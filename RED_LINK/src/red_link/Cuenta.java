package red_link;

import java.util.Scanner;

public class Cuenta {

    private String clave;
    private String usuario;
    private int saldo;

    public Cuenta() {

    }

    public Cuenta(String clave, String usuario, int saldo) {
        this.clave = clave;
        this.usuario = usuario;
        this.saldo = saldo;
        Ingresar();
    }

    private String Leer() {
        String n;
        System.out.print("Introduzca su clave ");
        Scanner sc = new Scanner(System.in);
        return n = sc.nextLine();
    }
   
    public void Ingresar() {
        int intentos = 0;
        String x = "";
        int n;
        do {
            intentos += 1;
            System.out.println(intentos + "° Intento");
            x = Leer();

        } while (intentos < 3 && !(x.equals(clave)));

        if (!(x.equals(clave))) {
            System.out.println("Cuenta Bloqueada");
        } else {
            System.out.println("Bienvenido " + usuario + "\nQue desea hacer?\n1-Transferencia \n2-Retiro \n3-Consulta");
            do {
                Scanner sc1 = new Scanner(System.in);
                n = sc1.nextInt();
            } while (!(n >= 0 && n <= 3));
            switch (n) {
                case 1:
                    break;
                case 2:
                    retiro();
                    break;
                case 3:
                    System.out.println("Su saldo es de : $" + getSaldo());
                    break;
            }

        }
    }

    private int getSaldo() {
        return saldo;
    }

    private void setSaldo(int saldo) {
        this.saldo -= saldo;
    }

    public void agregarPlata(double monto) {

    }

    public void retirarPlata(double monto) {
        int r;
        System.out.print("Cuanto desea retirar?");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        Retiro retiro = new Retiro(this, r);
        retiro.retirar();

        setSaldo(r);
        System.out.println("Su saldo es de : $" + getSaldo());
    }

    private void retiro() {
//        int r;
//        System.out.print("Cuanto desea retirar?");
//        Scanner sc = new Scanner(System.in);
//        r = sc.nextInt();
//        
//        Retiro retiro = new Retiro(this, r);
//        retiro.retirar();
//        
//        setSaldo(r);
//        System.out.println("Su saldo es de : $" + getSaldo());
    }

    private void transferencia() {

    }

}
