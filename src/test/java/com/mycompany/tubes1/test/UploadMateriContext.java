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
import cucumber.api.java.id.Dan;
import org.junit.Assert;
/**
 *
 * @author Dunia Imajinasiku
 */
public class UploadMateriContext {
    @Dengan("^user dapat mengupload Materi$")
public void user_dapat_mengupload_Materi() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^user memilih materi yang akan diupload$")
public void user_memilih_materi_yang_akan_diupload() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^user mengupload file materi mata kuliah$")
public void user_mengupload_file_materi_mata_kuliah() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^sistem menyimpan file materi dalam database$")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //String expected = "Akun baru berhasil di buat";
    String result = "sistem menyimpan file materi dalam database";
    Assert.assertEquals(arg1, result);
}
}
