import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class plikLiczby {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Ile elementów tablicy chcesz wprowadzić: ");
        int number = scanner.nextInt();
        double[] tablica = new double[number];

        String wpis;
        FileWriter fileWriter = new FileWriter("plikLiczby.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);
            for (int i = 0; i < number; i++) {
                System.out.println("Wpisz: " + (i + 1) + " liczbę zmiennoprzecinkową do tablicy");
                tablica[i] = scanner.nextDouble();
                writer.write(String.valueOf(tablica[i]));
                    writer.newLine();
            }
        writer.close();

        System.out.println("Wprowadzone liczby w tablicy to:");
        for (int i = 0; i < number; i++) {
            System.out.println(tablica[i]);
        }
    }
}


