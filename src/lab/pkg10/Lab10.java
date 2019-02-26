package lab.pkg10;

public class Lab10 {

    public static void main(String[] args) {
        System.out.println("Обработка встроенных типов исключений с выводом их описания");
        Exceptions.Arif_ExC();
        Exceptions.Array_ExC();
        System.out.println("\nОбработка нескольких разнотипных исключений в одном блоке");
        Exceptions.VariousException(1);
        Exceptions.VariousException(2);
        Exceptions.VariousException(3);
        System.out.println("\nГенерирование исключения собственного подкласса");
        Exceptions.MyException();
    }
}
