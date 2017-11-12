/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tubes1.test;

import cucumber.api.PendingException;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Dan;
import cucumber.api.java.id.Ketika;
import org.junit.Assert;

/**
 *
 * @author Dunia Imajinasiku
 */
public class SetDeadlineContext {
@Dengan("^user mengatur deadline kuis tugas$")
public void user_mengatur_deadline_kuis_tugas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^user memilih kuis tugas yang akan diatur deadlinenya$")
public void user_memilih_kuis_tugas_yang_akan_diatur_deadlinenya() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^user mengatur deadline pengerjaan kuis tugas$")
public void user_mengatur_deadline_pengerjaan_kuis_tugas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^sistem menyimpan deadline$")
public void sistem_menyimpan_deadline() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^sistem akan melakukan hitung mundur sesuai deadline")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    String result = "sistem akan melakukan hitung mundur sesuai deadline";
    Assert.assertEquals(arg1, result);
}
}
