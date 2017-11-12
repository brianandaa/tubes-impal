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
public class LupaPasswordContext {
    @Dengan("^user dapat mengetahui password akunnya$")
public void user_dapat_mengetahui_password_akunnya() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^user menginputkan data pada form$")
public void user_menginputkan_data_pada_form() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^sistem mengecek data inputan user$")
public void sistem_mengecek_data_inputan_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^data inputan user benar$")
public void data_inputan_user_benar() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^sistem akan mengirimkan data password ke email \"([^\"]*)\"$")
public void sistem_akan_mengirimkan_data_password_ke_email() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}
}
