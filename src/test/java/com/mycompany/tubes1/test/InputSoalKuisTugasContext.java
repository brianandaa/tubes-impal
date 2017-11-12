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
public class InputSoalKuisTugasContext {
@Dengan("^user menginputkan soal kuis tugas$")
public void user_menginputkan_soal_kuis_tugas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^user memilih materi yang akan dibuat soal kuis tugas$")
public void user_memilih_materi_yang_akan_dibuat_soal_kuis_tugas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^user menginputkan soal kuis tugas baru$")
public void user_menginputkan_soal_kuis_tugas_baru() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^user menginputkan jawaban soal kuis tugas$")
public void user_menginputkan_jawaban_soal_kuis_tugas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^sistem menyimpan file soal kuis tugas")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    String result = "sistem menyimpan file soal kuis tugas";
    Assert.assertEquals(arg1, result);
}
}
