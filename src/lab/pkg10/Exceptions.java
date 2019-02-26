package lab.pkg10;
public class Exceptions {

    public static void Arif_ExC() {
        int d, а;
        try {
            d = 0;
            а = 69 / d;
        } catch (ArithmeticException е) {
            System.out.println("    Дeлeниe на нуль.");
            System.out.println("    Описание исключения: " + е);
        }
    }

    public static void Array_ExC() {
        int[] d = new int[69];
        try {
            d[70] = 1;
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("    Запрос элемента за пределами массива.");
            System.out.println("    Описание исключения: " + е);
        }
    }

    public static void VariousException(int a) {
        int exceptionType = a;
        try {
            switch (exceptionType) {
                case 1:
                    throw new ArithmeticException();
                case 2:
                    throw new NullPointerException();
                case 3:
                    throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("    Сгенерировано исключение: " + e);
        }
    }
    
    public static void MyException() {
        try {
            throw new MyEx();
        }catch (MyEx e) {
            System.out.println("    Сгенерировано исключение: " + e);
        }
    }
}
