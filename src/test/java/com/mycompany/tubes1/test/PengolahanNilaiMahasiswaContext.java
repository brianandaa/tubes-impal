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
 * @author Juan Antonio
 */
public class PengolahanNilaiMahasiswaContext {
@Dengan("^Mahasiswa dapat melihat nilai kuis tugas$")
public void Mahasiswa_dapat_melihat_nilai_kuis_tugas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^Mahasiswa memilih kuis tugas yang akan dilihat nilainya $")
public void Mahasiswa_memilih_kuis_tugas_yang_akan_dilihat_nilainya () throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}


@Dan("^sistem memberi akses untuk melihat nilai$")
public void sistem_memberi_akses_untuk_melihat_nilai() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^nilai ada$")
public void nilai_ada(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^sistem akan menyimpan dalam database$")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    String result = "sistem akan menyimpan dalam database";
    Assert.assertEquals(arg1, result);
}
}
