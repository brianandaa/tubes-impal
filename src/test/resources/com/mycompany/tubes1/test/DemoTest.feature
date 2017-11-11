# language: id

Fitur: Sign Up
        Sign Up

        @Normal
        Skenario: User belum memiliki akun yang terdaftar dalam sistem
                  Dengan user dapat membuat akun baru
                  Ketika user menginputkan semua data akun
                  Dan sistem mengecek data inputan user
                  Dan data inputan user benar
                  Maka respon "Akun baru berhasil di buat"

        @Duplikat
        Skenario: User belum memiliki akun yang terdaftar dalam sistem
                  Dengan user dapat membuat akun baru
                  Ketika user menginputkan semua data akun
                  Dan sistem mengecek data inputan user
                  Dan data inputan user benar
                  Maka respon gagal dengan pesan "Duplicate"
