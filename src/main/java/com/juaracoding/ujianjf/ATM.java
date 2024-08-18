package com.juaracoding.ujianjf;

public class ATM {
    private double saldo;

    // konstruktor yang menerima parameter untuk menginisiasi saldo awal
    public ATM(double saldoAwal) {
        if (saldoAwal < 0) {
            throw new IllegalArgumentException("saldo awal tidak bisa negaatif.");
        }
        this.saldo = saldoAwal;
        }

        // Metode untuk melihat saldo saat ini
        public double lihatSaldo() {
        return saldo;
        }

        // Metode untuk menyetor uang
        public void setorUang(double jumlah) {
            if (jumlah <= 0) {
                throw new IllegalArgumentException("Jumlah setoran harus lebih besar dari 0.");
            }
            saldo += jumlah;
        }

        // Metode untuk menarik uang
        public void tarikUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah penarikan harus lebih besar dari 0.");
        }
        if (jumlah > saldo) {
            throw new IllegalArgumentException("Jumlah penarikan melebihi saldo saat ini");
        }
        saldo -= jumlah;
        }

       }
