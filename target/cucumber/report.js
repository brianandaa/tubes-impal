$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/mycompany/tubes1/test/DemoTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Sign Up",
  "description": "      Sign Up",
  "id": "sign-up",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "User belum memiliki akun yang terdaftar dalam sistem",
  "description": "",
  "id": "sign-up;user-belum-memiliki-akun-yang-terdaftar-dalam-sistem",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user dapat membuat akun baru",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "user menginputkan semua data akun",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "sistem mengecek data inputan user",
  "keyword": "Dan "
});
formatter.step({
  "line": 11,
  "name": "data inputan user benar",
  "keyword": "Dan "
});
formatter.step({
  "line": 12,
  "name": "respon \"Akun baru berhasil di buat\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.user_dapat_membuat_akun_baru()"
});
formatter.result({
  "duration": 188289134,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.user_menginputkan_semua_data_akun()"
});
formatter.result({
  "duration": 47696,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.sistem_mengecek_data_inputan_user()"
});
formatter.result({
  "duration": 47092,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.data_inputan_user_benar()"
});
formatter.result({
  "duration": 42262,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "User belum memiliki akun yang terdaftar dalam sistem",
  "description": "",
  "id": "sign-up;user-belum-memiliki-akun-yang-terdaftar-dalam-sistem",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 14,
      "name": "@Duplikat"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user dapat membuat akun baru",
  "keyword": "Dengan "
});
formatter.step({
  "line": 17,
  "name": "user menginputkan semua data akun",
  "keyword": "Ketika "
});
formatter.step({
  "line": 18,
  "name": "sistem mengecek data inputan user",
  "keyword": "Dan "
});
formatter.step({
  "line": 19,
  "name": "data inputan user benar",
  "keyword": "Dan "
});
formatter.step({
  "line": 20,
  "name": "respon gagal dengan pesan \"Duplicate\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.user_dapat_membuat_akun_baru()"
});
formatter.result({
  "duration": 283157,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.user_menginputkan_semua_data_akun()"
});
formatter.result({
  "duration": 38036,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.sistem_mengecek_data_inputan_user()"
});
formatter.result({
  "duration": 39847,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.data_inputan_user_benar()"
});
formatter.result({
  "duration": 36828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Duplicate",
      "offset": 27
    }
  ],
  "location": "DemoContext.respon_gagal_dengan_pesan(String)"
});
formatter.result({
  "duration": 4636167,
  "status": "passed"
});
formatter.uri("com/mycompany/tubes1/test/SignIn.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Sign In",
  "description": "",
  "id": "sign-in",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 5,
  "name": "User tidak dapat mengakses perangkat lunak",
  "description": "\n  Given user dapat mengakses perangkat lunak\n\n    When user menginputkan NIM\n    Or user menginputkan NIP\n    And user menginputkan Password\n    And sistem mengecek data inputan user\n    And data inputan user benar \n    Then user berhasil masuk",
  "id": "sign-in;user-tidak-dapat-mengakses-perangkat-lunak",
  "type": "scenario",
  "keyword": "Skenario"
});
});