public class MyArrayDataException extends Exception {
    public MyArrayDataException(String error, int i, int j){
        super(error);
        System.out.println("["+i+"]"+"["+j+"]");
    }

    public MyArrayDataException(int i, int j) {
        System.out.println("["+i+"]"+"["+j+"]");
    }
}
