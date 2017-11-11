/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tubes1.test;

import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dan;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import org.junit.Assert;

/**
 *
 * @author Briananda Adianti C
 */
public class SignInContext {
    @Dengan("^user dapat mengakses perangkat lunak$")
public void user_dapat_mengakses_perangkat_lunak() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^user menginputkan NIM$")
public void user_menginputkan_NIM() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^user menginputkan NIP$")
public void user_menginputkan_NIP() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^user menginputkan Password$")
public void user_menginputkan_Password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^sistem mengecek data inputsn user$")
public void sistem_mengecek_data_inputan_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //String expected = "Akun baru berhasil di buat";
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^data inputan user benar$")
public void respon_gagal_dengan_pesan(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^user berhasil masuk \"([^\"]*)\"$")
public void user_berhasil_masuk() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}
}
