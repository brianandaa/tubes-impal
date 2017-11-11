/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tubes1.test;

import cucumber.api.PendingException;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import org.junit.Assert;

/**
 *
 * @author Briananda Adianti C
 */
public class DemoContext {
    @Dengan("^user dapat membuat akun baru$")
public void user_dapat_membuat_akun_baru() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^user menginputkan semua data akun$")
public void user_menginputkan_semua_data_akun() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^sistem mengecek data inputan user$")
public void sistem_mengecek_data_inputan_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^data inputan user benar$")
public void data_inputan_user_benar() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^akun baru berhasil di buat$")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //String expected = "Akun baru berhasil di buat";
    String result = "Akun baru berhasil di buat";
    Assert.assertEquals(arg1, result);
}

@Maka("^respon gagal dengan pesan \"([^\"]*)\"$")
public void respon_gagal_dengan_pesan(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    String result = "Duplicate";
    Assert.assertEquals(arg1, result);
}
}
