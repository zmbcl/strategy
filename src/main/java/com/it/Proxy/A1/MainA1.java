package com.it.Proxy.A1;

public class MainA1 {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "com.it.Proxy.A1.Printer");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}
