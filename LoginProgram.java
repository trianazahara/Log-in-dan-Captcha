import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        // Informasi login
        String username = "user123";
        String password = "rahasia";

        // Generate CAPTCHA
        String captcha = generateCaptcha();

        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();
        System.out.println("CAPTCHA: " + captcha);
        System.out.print("Masukkan CAPTCHA (case insensitive): ");
        String inputCaptcha = scanner.nextLine();

        // Proses autentikasi
        if (inputUsername.equals(username) && inputPassword.equals(password) && inputCaptcha.equalsIgnoreCase(captcha)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Periksa kembali username, password, dan CAPTCHA.");
        }

        scanner.close();
    }

    // Metode untuk menghasilkan CAPTCHA
    private static String generateCaptcha() {
        // Misalnya, kita menggunakan CAPTCHA sederhana yang terdiri dari huruf acak
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();
        int length = 6; // Panjang CAPTCHA

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            captcha.append(characters.charAt(index));
        }

        return captcha.toString();
    }
}
