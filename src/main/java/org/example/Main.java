package org.example;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");
        Matrix matrix1 = new Matrix<>(5,2);
        //matrix1.MatrixFilling();
        matrix1.MatrixRandom();
        matrix1.Show();
        System.out.println("Maximum value: " + matrix1.Maximum());
        System.out.println("Minimum value: " + matrix1.Minimum());
        System.out.println("Average value: " + matrix1.AVG());


        Matrix matrix2 = new Matrix<>(5,2);
        //matrix2.MatrixFilling();
        matrix2.MatrixRandom();
        matrix2.Show();
        matrix1.Summa(matrix2);
        matrix1.Show();
        matrix2.Residual(matrix1);
        matrix2.Show();
    }
}