package school.sorokin.javacore.Basics;

import java.util.Arrays;

public class repeatMassiveTwo {
    public static void main(String[] args) {

        int[][]numbers = new int[3][3];
        int sum = 1;

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                numbers[i][j]+=sum;
                sum++;
                System.out.println(numbers[i][j]+"\t");
            } System.out.println();
        }
        int[][] sums = {{23,12,45},{345,678,123},{1234,4123,5000}};
        for(int i = 0; i < sums.length; i++){
            int max = sums[i][0];
            for(int j = 0; j < sums[i].length; j++){
                if(sums[i][j]>max){
                    max = sums[i][j];
                }
            }System.out.println("Максимальное значение "+(i+1)+" строчки: "+max);
        }
    }
}

class differents {
    public static void main(String[] args) {

        int[][] numbers = {{100,200,300},{400,500,600}};
        int[] rowOne = numbers[0];
        int[] rowTwo = numbers[1];
        System.out.println(Arrays.toString(rowOne));
        System.out.println(Arrays.toString(rowTwo));

        int[][] matrix = {{111,222,333},{333,222,111}};
        System.out.println(Arrays.deepToString(matrix));
        int[] mat = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = mat;
        System.out.println(Arrays.deepToString(matrix));

        int[][] massive = {{100,200,300},{400,500,600}};
        for(int i = massive.length -1; i >= 0; i--){
            for(int j = massive[i].length -1; j >= 0; j--){
                System.out.print(massive[i][j]+"\t");
            }System.out.println();
        }
    }
}


class zubrik {
    public static void main(String[] args) {

        int[][] zubrik = {{10,20,30},{40,50},{60}};
        for(int i = 0; i < zubrik.length; i++) {
            System.out.println("Row: " + (i + 1));
            for (int j = 0; j < zubrik[i].length; j++) {
                System.out.println(zubrik[i][j]+"\t");
            }System.out.println();

            for(int[] zubr : zubrik){
                for(int zu : zubr){
                    System.out.println(zu+"\t");
                }System.out.println();
            }
        }

        int[][] studentMarks = new int[3][];
        studentMarks[0]= new int[]{3,3,4,4};
        studentMarks[1]= new int[]{2,3,2,3,3};
        studentMarks[2]= new int[]{5,5,5,3,4,5};

        for(int i = 0; i < studentMarks.length; i++){
            System.out.println("Student "+(i+1));
            for(int j = 0; j < studentMarks[i].length; j++){
                System.out.print(studentMarks[i][j]+"\t");
            }System.out.println();
        }
    }
}