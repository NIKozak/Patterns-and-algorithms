package objects;

import java.awt.*;
import adapter.PrinterAdapter;
import java.util.ArrayList;
import java.util.List;
//Клиент который хочет печатать сразу много текста
//Работает с адаптером а не с принтером напрямую


public class Client {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);



    }
}