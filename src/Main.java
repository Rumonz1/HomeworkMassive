public class Main {
    public static void main(String[] args) {
        //Задача 1//
        //1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //2
        double [] numbers2 = {1.57, 7.654, 9.986};
        //3
        int [] numbers3 = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //ЗАДАЧА 2//
        //1
        int num = numbers.length - 1;
        for (int i = 0; i < 3; i++) {
            if (i==num){
                System.out.print(numbers[i]+"");
            }else{
                System.out.print(numbers[i]+",");}
        }
        //2
        System.out.println();
        int num2 = numbers2.length - 1;
        for (int x = 0; x < 3; x++) {
            if (x==num2) {
                System.out.print(numbers2[x] + "");
            }else {
                System.out.print(numbers2[x] + ",");}
        }
        //3
        System.out.println();
        int num3 = numbers3.length - 1;
        for (int z = 0; z < 10; z++) {
            if (z==num3) {
                System.out.print(numbers3[z] + "");
            }else{
                System.out.print(numbers3[z]+",");
            }

        }
        //ЗАДАЧА 3
        //1
        System.out.println();
        System.out.println("В обратном порядке!");
        int minusNumbers = numbers.length - 1;
        for (int ii = minusNumbers; ii >= 0; ii--) {
            if (ii>0) {
                System.out.print(numbers[ii] + ",");
            }else{
                System.out.print(numbers[ii]+"");
            }

        }
        //2
        System.out.println();
        int minusNumber2 = numbers2.length-1;
        for (int xx=minusNumber2; xx>=0;xx--){
            if(xx>0) {
                System.out.print(numbers2[xx] + ",");
            }else{
                System.out.print(numbers2[xx]);
            }
        }
        //3
        System.out.println();
        int minusNumber3 = numbers3.length -1;
        for (int zz=minusNumber3;zz>=0;zz--) {
            if (zz > 0) {
                System.out.print(numbers3[zz] + ",");
            } else {
                System.out.print(numbers3[zz]);
            }
        }
        //ЗАДАЧА 4
        System.out.println();
        System.out.println("ЗАДАЧА 4 ВЫПОЛНЕНА В ОТДЕЛЬНОЙ ВЕТКЕ");

    }
}