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
 * @author ingancio
 */
public class SignOutContext {
    @Dengan("^user dapat keluar dari sistem$")
public void user_dapat_keluar_dari_sistem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Ketika("^user memilih menu sign out$")
public void user_memilih_menu_sign_out() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}

@Maka("^sistem mengakhiri akses user ke sistem \"([^\"]*)\"$")
public void sistem_mengakhiri_akses_user_ke_sistem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expected = false;
    boolean result = false;
    Assert.assertEquals(expected, result);
}
}
