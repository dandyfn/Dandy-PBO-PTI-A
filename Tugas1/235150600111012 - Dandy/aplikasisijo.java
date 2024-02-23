

import java.util.Scanner;

public class aplikasisijo {
  
    static String[][] pengguna = {{"dandy", "kacang goreng"}, {"alfarisi", "samba balado"}, 
    {"natanegara", "bakso urat"}}; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean prosespengenalan = false;

        System.out.println("=== Proses pengenalan ===");

        while (!prosespengenalan) {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            
            prosespengenalan = pengenalan(username, password);

            if (prosespengenalan) {
                System.out.println("Login berhasil, selamat " + username + "!");
            } else {
                System.out.println("Password atau nama kamu salah. Coba lagi ya");
            }
        }

        input.close();
    }

    static boolean pengenalan(String username, String password) {
        for (String[] user : pengguna) {
            if (user[0].equals(username) && user[1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}


