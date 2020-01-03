# LoopingBersarang__JV
Bahan Ajar Fundamental Pemrograman Java: Pengulangan (Looping) Bersarang Dengan Contoh Pembuatan Pola Kotak Dan Segitiga.<br><br>
<img src="https://github.com/RizkyKhapidsyah/LoopingBersarang__JV/blob/master/results/001.PNG">
<img src="https://github.com/RizkyKhapidsyah/LoopingBersarang__JV/blob/master/results/002.PNG">
<img src="https://github.com/RizkyKhapidsyah/LoopingBersarang__JV/blob/master/results/003.PNG">
<img src="https://github.com/RizkyKhapidsyah/LoopingBersarang__JV/blob/master/results/004.PNG"><br><br>
- Lihat <a href="https://github.com/RizkyKhapidsyah/LoopingBersarang__JV/blob/master/src/com/rizkykhapidsyah/loopingbersarang/Main.java">Source Code.</a><br><br>

-----

Misalkan kita membuat pola yang hasilnya sebagai berikut :

Logika :
Kita menentukan jumlah baris untuk membuat segitiga misalkan 5.
Pertama kita menuliskan kode sebagai berikut:

      int a = 5;
      for (int b = 1; b <= a; b++){
         System.out.print('*');
         System.out.println();
      }

maka hasilnya akan seperti berikut :

      *
      *
      *
      *
      *

Untuk membuat segitiga, dimana banyak bintang sama dengan barisnya misalkan baris satu = bintang satu, baris dua = bintang 2 dan seterusnya seperti contoh gambar diatas, maka kita tambahkan perulangan lagi dan memasukan <code>System.out.print("*")</code> ke dalamnya seperti berikut:

      public static void main(String[] args) {
             int a = 5;
             for (int b = 1; b <= a; b++){
                 for (int c = 1; c <= b; c++) {
                     System.out.print('*');
                 }
                 System.out.println();
             }
      }

-----

Berikut adalah pola segitiga lain:

      public static void main(String[] args) {
             int a = 5;
             for (int b = 1; b <= a; b++){
                 for (int c = 4; c >= b; c--) {
                     System.out.print(' ');
                 }
                 for (int d = 1; d <= b; d++){
                     System.out.print('*');
                 }
                 System.out.println();
             }
      }

-----

      public static void main(String[] args) {
             int x = 5;
             for (int i = 1; i <= x; i++){
                 for (int j = 4; j >= i; j--) {
                     System.out.print(' ');
                 }
                 for (int k = 1; k <= i; k++){
                     System.out.print('*');
                 }
                 for (int l = 1; l <= i - 1; l++){
                     System.out.print('*');
                 }
                 System.out.println();
             }
      }


-----
Referensi Artikel: <br>
- <a href="https://pesonainformatika.com">Pesona Informatika.</a><br>

<br>Referensi Source Code:<br>
<a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.
