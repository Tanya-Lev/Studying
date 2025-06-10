package org.example.l1;

import java.util.Scanner;

/**
 * 31.03.2025
 * developer: Juriy Svetlichniy
 * to my favorite girl: Tatiana Lev 💕
**/
public class Main {

    static double megabytes;
    static double kilobytes;
    static double gigabytes;

    public enum ByteScale {
        GB(1073741824),
        MB(1048576),
        KB(1024),
        B(1);

        private final double size;

        ByteScale(double size) {
            this.size = size;
        }

        public double getSize() {
            return size;
        }
    }


    public static void main(String[] args) throws Exception {

        int inputNumber;



        double inputBytes;
        String line;

        System.out.print("Enter the dataType: ");


        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();

        String cleanLine = line.toUpperCase().strip();
        ByteScale datatype = null;


        try {
            datatype = ByteScale.valueOf(cleanLine);
        }catch (IllegalArgumentException e){
            System.out.println("NOT ENUM SUKA!!!");
            return;
        }

        System.out.printf("Enter the number of %s: ",cleanLine);
        inputNumber = scanner.nextInt();

        inputBytes = switch (datatype){
            case ByteScale.GB -> inputNumber * ByteScale.GB.getSize();
            case ByteScale.MB -> inputNumber * ByteScale.MB.getSize();
            case ByteScale.KB -> inputNumber * ByteScale.KB.getSize();
            case ByteScale.B -> inputNumber;
            default -> throw new Exception("BAD NUMBER NAHUI!!!!!");
        };

        kilobytes = inputBytes / ByteScale.KB.getSize();
        gigabytes = inputBytes / ByteScale.GB.getSize();
        megabytes = inputBytes / ByteScale.MB.getSize();

        System.out.printf("Gigabytes: %f\nMegabytes: %f\nKilobytes: %f\nBytes: %f\n",gigabytes, megabytes, kilobytes, inputBytes);

    }


}