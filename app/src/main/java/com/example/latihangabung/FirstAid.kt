package com.example.latihangabung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        val ss: String? = intent.getStringExtra("key")

        var textView = findViewById<TextView?>(R.id.textFirstAid)


        if (ss == "Serangan Jantung") {
            textView.text = "1. Jangan Panik \n2. Hubungi tenaga medis \n3. Tenangkan pasien \n4. Dudukkan pasien \n5. Longgarkan pakaian \n6. Berikan obat \n7. Lakukan CPR bila tidak sadarkan diri"
        }

        else if (ss == "Sesak nafas") {
            textView.text = "1. Jauhkan dari keramaian \n2. Hubungi tenaga medis \n3. Benarkan posisi duduk penderita \n4. Jangan biarkan penderita tiduran \n5. Longgarkan pakaian \n6. Berikan air hangat \n7. Berikan obat pereda sesak nafas \n8. Pijat jempol penderita"
        }

        else if (ss == "Luka bakar") {
            textView.text = "1. Berikan air sejuk pada area terbakar \n2. Gunakan kompres jika tidak ada air mengalir \n3. Tutup luka bakar dengan perban steril \n4. Oleskan luka dengan petroleum jelly \n5. Hubungi tenaga medis"
        }

        else if (ss == "Angin duduk") {
            textView.text = "1. Ajak penderita untuk istirahat \n2. Lakukan CPR pada pasien \n3. Cek denyut pasien \n4. Gunakan alat kejut jantung"
        }

        else if (ss == "Gula darah rendah") {
            textView.text = "1. Berikan minuman manis \n2. Berikan tablet glukosa \n3. Konsumsi makanan berkarbohidrat \n4. Bawa ke rumah sakit"
        }

        else if (ss == "Asma") {
            textView.text = "1. Duduk dengan posisi yang nyaman \n2. Mulai bernafas perlahan secara stabil \n3. Semprotkan obat inhaler setiap 30-60 detik \n4. Hubungi tenaga medis jika semakin parah"
        }

        else if (ss == "Epilepsi") {
            textView.text = "1. Hitung waktu kejang dari awal hingga akhir\n2.Longgarkan pakaian penderita\n3.Singkirkan benda -benda berbahaya\n4.Baringkan penderita dalam posisi miring\n5.Buka mulut penderita untuk memperlancar jalur pernapasan\n6.Tetap Berkomunikasi dengan penderita "
        }

        else if (ss == "Muntaber") {
            textView.text = "1. Konsumsi cairan yang banyak\n2.Minum larutan Oralit\n3.Makan makanan yang mengandung Karbohidrat\n4.Istirahat yang cukup.5.Periksa ke dokter"
        }

        else if (ss == "Serangan panik") {
            textView.text = "1. Bawa penderita ke tempat tenang\n2.Berikan obat penenang, bila tersedia\n3.Bantu penderita mengatur pernapasannya \n4.Bantu penderita untuk rileks"
        }

        else if (ss == "Maag") {
            textView.text = "1. Longgarkan pakaian\n2.Usahakan untuk berdiri tegak\n3.Mengunyah permen karet bila tersedia \n4.Minum obat asam lambung . "
        }

        else if (ss == "Otot kram") {
            textView.text = "1. Tetap bersikap tenang\n2.Meluruskan bagian tubuh yang kram\n3.Stretching otot\n4.Mengompres dengan handuk dingin\n5.Mandi dengan air hangat"
        }

        else if (ss == "Cantengan") {
            textView.text = "1. Minum obat Pereda nyeri\n2.Rendam dengan air hangat\n3.Rendam dengan sari cuka apel\n4.Oleskan krim antibiotic\n5.Balut kuku dengan perban bersih"
        }

        else if (ss == "Sakit gigi") {
            textView.text = "1. Kumur dengan menggunakan air garam\n2.Kompres menggunakan es batu\n3.Konsumsi obat pereda nyeri\n4.Bantu penderita untuk rileks"
        }

        else if (ss == "Sakit kepala") {
            textView.text = "1. Minum air putih hangat\n2.Kompres pelipis menggunakan es batu\n3.Minum segelas kopi / teh jahe\n4.Memijat pelipis dengan minyak\n5.Konsumsi makanan pedas"
        }

        else if (ss == "Demam") {
            textView.text = "1. Minum air putih secukupnya\n2.Kompres kepala dengan air hangat\n3.Konsumsi makanan hangat\n4.Istirahat dengan cukup\n5.Jangan tutup tubuh dengan selimut"
        }

        else if (ss == "Gigitan serangga") {
            textView.text = "1. Segera cabut bekas sengatan yang tertinggal\n2.Cuci dengan air bersih dan sabun\n3.Kompres dengan air es\n4.Hindari menggaruk daerah yang tergigit\n5.Gunakan obat pada daerah terinfeksi"
        }

        else if (ss == "Vertigo") {
            textView.text = "1. Gerakan kepala 45 derajat ke arah sumber vertigo\n2.Berbaring dengan posisi bahu diatas bantal dan julurkan leher kebawah\n3.Posisi kepala harus lebih rendah dari bahu\n4.Ulangi gerakan bila masih terasa pusing"
        }

        else if (ss == "Flu") {
            textView.text = "1. Minum air putih yang cukup\n2.Berkumur dengan air garam\n3.Penuhi kebutuhan gizi\n4.Konsumsi obat flu\n5.Istirahat yang cukup"
        }

        else if (ss == "Hipotermia") {
            textView.text = "1. Pindah dari tempat yang dingin  \n2.Lepaskan semua pakaian yang basah\n3.Berikan lapisan pakaian yang kering dan hangat\n4.Berikan minuman hangat\n5.Berikan kompres hangat\n6.Bawa ke rumah sakit terdekat"
        }

        else if (ss == "Hipoksia") {
            textView.text = "1. Memperbaiki aliran oksigen\n2.Meningkatkan tekanan parsial oksigen\n3.Melakukan hiperventilasi (bernapas secara cepat)\n4.Minum obat yang tersedia"
        }

        else if (ss == "Luka sobek") {
            textView.text = "1. Segera hentikan pendarahan\n2.Tentukan plester di titik yang tepat\n3.Jaga kebersihan luka dan bagian tubuh sekitarnya\n4.Hubungi tenaga medis, bila semakin parah"
        }

        else if (ss == "Pingsan") {
            textView.text = "1. Berikan ruang yang cukup\n2.Hubungi tenaga medis\n3.Cek denyut jantung pasienn4.Posisikan kaki 30 cm lebih tinggi dari dada pasien\n5.Longgarkan pakaian yang menghalang pernafasan\n6.Berikan minum manis saat sadar"
        }

        else if (ss == "Keracunan") {
            textView.text = "1. Mengontrol mual dan muntah\n2.Minum air yang cukupn3.Minum obat yang disarankan\n4.Hubungi tenaga medis."
        }

        else if (ss == "Overdosis") {
            textView.text = "1. Segera hubungi tenaga medis\n2.Baringkan penderita di sisi tubuhnya\n3.Pastikan jalur pernafasan tidak terhalang\n4.Berikan CPR bila nafas penderita hilang"
        }

        else if (ss == "Rabies") {
            textView.text = "1. Cuci tangan dengan sabun dan air mengalir\n2.Hentikan pendarahan terlebih dahulu\n3.Balut luka dengan kasa steril\n4.Letakkan bagian luka pada daerah lebih tinggi\n5.Periksakan luka ke tenaga medis"
        }

        else if (ss == "Wasir") {
            textView.text = "1. Hindari duduk terlalu lama \n2.Kompres es batu pada daerah rectum \n3.Makan makanan yang mengandung serat \n4.Berendam pada air hangat \n5.Minum obat yang diperlukan"
        }
    }









    //Toast.makeText(this, ss, Toast.LENGTH_SHORT).show()
    }
