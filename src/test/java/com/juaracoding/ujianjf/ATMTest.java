package com.juaracoding.ujianjf;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    private ATM atm;
    // Menginisialisasi objek ATM dengan saldo awal yaitu 1000
    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000);
    }

    @Test
    public void testLihatSaldo() {
        // Point testing 1: Menguji apakah metode lihatSaldo() mengembalikan saldo yang benar
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1000.0, "Saldo awal harus 1000");
    }

    @Test
    public void testSetorUang() {
        // Point testing 2: Menguji apakah metode setorUang() berfungsi dengan benar ketika jumlah yang disetorkan valid
        atm.setorUang(900);
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1900.0, "Saldo setelah setor 900 harus 1900");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif() {
        // Point testing 3: Menguji apakah metode setorUang() melempar pengecualian ketika jumlah yang disetorkan negatif
        atm.setorUang(-300);
    }

    @Test
    public void testTarikUang() {
        // Point testing 4: Menguji apakah metode tarikUang() berfungsi dengan benar ketika jumlah yang ditarik valid
        atm.tarikUang(300);
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 700.0, "Saldo setelah ditarik 300 harus tersisa 700");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() {
        // Point testing 5: Menguji apakah metode tarikUang() melempar pengecualian ketika jumlah yang ditarik melebihi saldo saat ini
        atm.tarikUang(1200);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() {
        // Point testing 6: Menguji apakah metode tarikUang() melempar pengecualian ketika jumlah yang ditarik negatif
        atm.tarikUang(-400);
    }

}

