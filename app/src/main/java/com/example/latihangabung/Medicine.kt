package com.example.latihangabung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Medicine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine)

        val sss: String? = intent.getStringExtra("keyMed")

        var textView = findViewById<TextView?>(R.id.textMed)

        if (sss == "Asma") {
            textView.text = "1. Agonis beta kerja lambat \nObat ini berfungsi untuk menjaga agar jalan napas tetap lapang dan tidak menyempit. Obat ini umumnya digunakan dengan cara dihirup." +
                    "\n\n2. Nitrogliserin \nObat ini berfungsi untuk mencegah dan mengurangi peradangan di dalam saluran napas." +
                    "\n\n3. Pengubah leukotrien \nObat ini berfungsi untuk mengurangi peradangan yang terjadi di saluran pernapasan, sehinga membuat pernapasan lebih nyaman." +
                    "\n\n4. Ipratropium \nObat ini berfungsi untuk merelaksasi saluran pernapasan dengan cukup cepat."
        }

        else if (sss == "Serangan Jantung") {
            textView.text = "1. Aspirin dan clopidogrel \nObat ini berfungsi untuk mencegah penggumpalan darah, sehingga darah tetap dapat mengalir melalui pembuluh darah yang mengalami penyempitan." +
                    "\n\n2. Nitrogliserin \nObat ini berfungsi untuk melebarkan pembuluh darah agar dapat meningkatkan aliran darah ke jantung." +
                    "\n\n3. Enoxaparin \nObat ini berfungsi untuk mencegah penggumpalan darah." +
                    "\n\n4. Streptokinase \nObat ini berfungsi untuk menghancurkan gumpalan darah."
        }

        else if (sss == "Diare") {
            textView.text = "1. Loperamide \nObat ini berfungsi untuk memperlambat gerak usus agar menghasilkan feses dalam bentuk lebih padat saat diare. " +
                    "\n\n2. Bismuth subsalicylate\nObat ini berfungsi untuk  memperkuat dinding lambung dan usus kecil untuk melindungi organ pencernaan dari infeksi bakteri. Obat ini biasa diminum oleh orang dewasa yang mengalami diare beserta mual" +
                    "\n\n3. Attapulgite\nObat ini berfungsi untuk memperlambat kerja usus besar agar dapat menyerap lebih banyak air sehingga tekstur feses jadi lebih padat." +
                    "\n\n4. Oralit \nObat ini berfungsi untuk mengembalikan cairan tubuh yang hilang akibat diare." +
                    "\n\n5. Suplemen probiotik \nProbiotik adalah bakteri baik yang membantu melawan bakteri penyebab diare dan peradangan usus. Selain itu, probiotik juga berfungsi menyeimbangkan jumlah bakteri baik yang hidup alami di usus untuk menjaga kelancaran kerja sistem pencernaan."
        }

        else if (sss == "Pendarahan") {
            textView.text = "1. Asam Traneksamat\nMengurangi atau menghentikan perdarahan pada kondisi menorrhagia, perdarahan pascaoperasi, mimisan, atau cedera, mencegah perdarahan pada pasien hemofilia, dan untuk menangani hereditary angiodema "
        }

        else if (sss == "Kejang") {
            textView.text = "1. Karbamazepin\nObat ini berfungsi untuk membantu menghambat aliran natrium di otak dan di badan, sehingga mengurangi aktivitas listrik yang abnormal antar sel saraf." +
                    "\n\n2. Fenitoin\nObat ini berfungsi untuk membantu mengendalikan kejang parsial serta kejang umum tonik-klonik. Obat ini dapat diberikan dokter secara intravena untuk segera mengontrol kejang aktif yang dialami pasien. " +
                    "\n\n3. Valproat dan asam valproat\nObat ini berfungsi untuk mengatasi kejang parsial, kejang umum tonik-klonik, dan kejang absen." +
                    "\n\n4. Diazepam dan lorazepam\nObat ini berfungsi untuk untuk menghentikan kejang pada pasien, terutama pada yang berada dalam status epileptikus. Obat ini merupakan salah satu obat yang digunakan saat kondisi darurat jika orang mengalami kejang"
        }

        else if (sss == "Keracunan") {
            textView.text = "1. Oralit\nObat ini berfungsi untuk mengembalikan keseimbangan cairan dalam tubuh. " +
                    "\n\n2. Obat antibiotik"
        }

        else if (sss == "Luka bakar") {
            textView.text = "1. Salep bacitracin \nObat ini berfungsi untuk menghentikan, mencegah, dan mengobati infeksi kulit yang disebabkan oleh bakteri." +
                    "\n\n2. Salep silver sulfadiazine\nObat ini berfungsi untuk membantu penyembuhan luka bakar dengan cara menghentikan dan mencegah infeksi menyebar ke kulit di sekitarnya." +
                    "\n\n3. Salep mafenide acetate\nObat ini berfungsi untuk membunuh bakteri dan mengurangi risiko bakteri menyebar ke kulit di sekitarnya atau ke aliran darah. Salep ini juga berguna untuk mengobati infeksi luka bakar parah. "
        }

        else if (sss == "Maag") {
            textView.text = "1. Antasida\nObat ini berfungsi untuk menetralkan asam lambung" +
                    "\n\n2. Bismuth subsalicylate\nObat ini berfungsi untuk mengurangi produksi asam lambung serta meredakan peredangan pada lambung."
        }

        else if (sss == "Sakit gigi") {
            textView.text = "1. Ibuprofen\nObat ini berfungsi untuk menghambat tubuh memproduksi senyawa yang menyebabkan peradangan, sehingga pembengkakan, rasa sakit, atau demam akibat sakit gigi dapat berkurang. " +
                    "\n\n2. Naproxen \nObat ini berfungsi untuk mengurangi produksi senyawa penyebab peradangan."
        }

        else if (sss == "Flu") {
            textView.text = "1. Paracetamol\nObat ini berfungsi untuk meredakan gejala flu seperti demam, sakit kepala, serta badan nyeri atau pegal-pegal. " +
                    "\n\n2. Ibuprofen\nObat ini berfungsi untuk menghambat produksi senyawa kimia tertentu yang menyebabkan peradangan dan nyeri. Kedua, obat ini mengurangi peradangan di tubuh sehingga mempercepat proses penyembuhan." +
                    "\n\n3. Antihistamin \nObat ini berfungsi untuk meredakan hidung meler, tenggorokan gatal, mata berair atau, bersin-bersin." +
                    "\n\n4. Dekongestan \nObat ini berfungsi untuk meredakan pembengkakan pada saluran hidung serta mengurangi produksi lendir agar kita bisa bernapas lebih lega."
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        /*else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }

        else if (sss == "") {
            textView.text = "1. \nObat ini berfungsi untuk " +
                    "\n\n2. \nObat ini berfungsi untuk " +
                    "\n\n3.  \nObat ini berfungsi untuk " +
                    "\n\n4.  \nObat ini berfungsi untuk "
        }*/

    }
}