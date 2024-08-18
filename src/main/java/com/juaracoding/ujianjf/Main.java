package com.juaracoding.ujianjf;

public class Main {
    public static void main(String[] args) {
        // Membuat objek ATM dengan saldo awal 100.000
        ATM atm = new ATM(1000.000);

        // Melihat saldo
        System.out.println("Saldo saat ini: " + atm.lihatSaldo());

        // Setor uang
        atm.setorUang(500.000);
        System.out.println("Saldo setelah setor: " + atm.lihatSaldo());

        // Tarik uang
        atm.tarikUang(300.000);
        System.out.println("Saldo setelah tarik: " + atm.lihatSaldo());

        // Coba tarik uang melebihi saldo
        try {
            atm.tarikUang(2000.000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Coba setor uang dengan jumlah negatif
        try {
            atm.setorUang(-1000.000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}