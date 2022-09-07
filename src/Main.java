
public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arrNeg = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        String[][] arrNeg2 = {{"1", "2a", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arrPos = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        int res;
        res=arrayTest(arrPos);
        System.out.println("Сумма чисел в массиве - "+res);
        res =arrayTest(arrNeg);
        System.out.println("Сумма чисел в массиве - "+res);
        res =arrayTest(arrNeg2);
        System.out.println("Сумма чисел в массиве - "+res);
    }

    private static int arrayTest(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        //if(arrNew.length!=4 | arrNew[0].length!=4 | arrNew[1].length!=4 | arrNew[2].length!=4 | arrNew[3].length!=4) throw new MyArraySizeException("Массив другого размера!");
        int a = 0;
        if (arr.length != 4 | arr[0].length != 4) throw new MyArraySizeException("Массив другого размера!");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    a += Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Нечисловое значение в ячейке - ",i,j);
                }
            }
        }
        return a;
    }
}