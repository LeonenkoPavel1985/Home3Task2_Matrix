package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Matrix <T> {
    int rows;
    int columns;
    Object[] [] array;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public void MatrixFilling() throws IOException {
        Scanner scanner = new Scanner(System.in);
        array = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Fill in the matrix:");
                array[i][j] = scanner.next();
            }
        }
    }

    public void MatrixRandom() {
        array = new Double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int rand = (int) (Math.random() * 10);
                array[i][j] = Double.valueOf(rand);
            }
        }
    }

    public void Show() {
        System.out.println("Matrix:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    public Double Maximum() {
        Double max = (Double)array[0][0];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++)
                if ((Double)array[i][j] > max) max = (Double)array[i][j];
        }
        return max;
    }

    public Double Minimum() {
        Double min = (Double)array[0][0];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++)
                if ((Double)array[i][j] < min) min = (Double)array[i][j];
        }
        return min;
    }

    public Double AVG() {
        Double sum=0.0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                sum += (Double) array[i][j];
        }
        return sum / (rows * columns);
    }

    public Matrix<T> Summa(Matrix<T> mat) {
        if (this.rows == mat.rows && this.columns == mat.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++)
                    this.array[i][j] = (Double)this.array[i][j] +(Double)mat.array[i][j];
            }
        }
        return this;
    }

    public Matrix<T> Residual(Matrix<T> mat) {
        if (this.rows == mat.rows && this.columns == mat.columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++)
                    this.array[i][j] = (Double)this.array[i][j] - (Double)mat.array[i][j];
            }
        }
        return this;
    }
}
