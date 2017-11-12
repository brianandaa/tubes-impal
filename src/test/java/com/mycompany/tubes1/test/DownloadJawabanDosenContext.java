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
public class DownloadJawabanDosenContext {
@Dengan("^Dosen berhasil mendownload jawaban$")
public void Dosen_berhasil_mendownload_jawaban() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^Dosen memilih kelas yang diajar untuk di download jawabanya$")
public void Dosen_memilih_kelas_yang_diajar_untuk_di_download_jawabanya() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}


@Dan("^sistem memberi akses untuk download$")
public void sistem_memberi_akses_untuk_download() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Dan("^jawaban ada$")
public void jawaban_ada(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^Dosen dapat mendownload jawaban$")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    String result = "Dosen dapat mendownload jawabant";
    Assert.assertEquals(arg1, result);
}
}
