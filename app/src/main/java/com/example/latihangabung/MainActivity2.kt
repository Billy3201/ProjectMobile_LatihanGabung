package com.example.latihangabung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var adapterSample = AdapterFa{ String -> doClick(String) }
        adapterSample.setData(stringGenerate())

        /*
            Endless scroll view declaration block
         */
        var recyclerView = findViewById<RecyclerView>(R.id.recycler_view_fa)

        recyclerView.layoutManager = LinearLayoutManager(this)
        //Put the adapter inside recycler view like usual recycler view
        recyclerView.adapter = adapterSample


    }

    //Generate default data for the adapter
    fun stringGenerate():MutableList<String> {
        var stringList = ArrayList<String>()

        /*for(i in 1..25)
            stringList.add("Sample $i")  */

        stringList.add("Serangan Jantung")
        stringList.add("Sesak nafas")
        stringList.add("Luka bakar")
        stringList.add("Angin duduk")
        stringList.add("Gula darah rendah")
        stringList.add("Asma")
        stringList.add("Epilepsi")
        stringList.add("Muntaber")
        stringList.add("Serangan panik")
        stringList.add("Maag")
        stringList.add("Otot kram")
        stringList.add("Cantengan")
        stringList.add("Sakit gigi")
        stringList.add("Sakit kepala")
        stringList.add("Demam")
        stringList.add("Gigitan serangga")
        stringList.add("Vertigo")
        stringList.add("Flu")
        stringList.add("Hipotermia")
        stringList.add("Hipoksia")
        stringList.add("Luka sobek")
        stringList.add("Pingsan")
        stringList.add("Keracunan")
        stringList.add("Overdosis")
        stringList.add("Rabies")
        stringList.add("Wasir")

        return stringList
    }


    fun doClick( nama : String ) {

        if (nama == ("Serangan Jantung")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Serangan Jantung")
            startActivity(intent)
        }

        else if (nama == ("Sesak nafas")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Sesak nafas")
            startActivity(intent)
        }

        else if (nama == ("Luka bakar")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Luka bakar")
            startActivity(intent)
        }

        else if (nama == ("Angin duduk")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Angin duduk")
            startActivity(intent)
        }

        else if (nama == ("Gula darah rendah")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Gula darah rendah")
            startActivity(intent)
        }

        else if (nama == ("Asma")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Asma")
            startActivity(intent)
        }

        else if (nama == ("Epilepsi")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Epilepsi")
            startActivity(intent)
        }

        else if (nama == ("Muntaber")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Muntaber")
            startActivity(intent)
        }

        else if (nama == ("Serangan panik")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Serangan panik")
            startActivity(intent)
        }

        else if (nama == ("Maag")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Maag")
            startActivity(intent)
        }

        else if (nama == ("Otot kram")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Otot kram")
            startActivity(intent)
        }

        else if (nama == ("Cantengan")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Cantengan")
            startActivity(intent)
        }

        else if (nama == ("Sakit gigi")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Sakit gigi")
            startActivity(intent)
        }

        else if (nama == ("Sakit kepala")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Sakit kepala")
            startActivity(intent)
        }

        else if (nama == ("Demam")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Demam")
            startActivity(intent)
        }

        else if (nama == ("Gigitan serangga")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Gigitan serangga")
            startActivity(intent)
        }

        else if (nama == ("Vertigo")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Vertigo")
            startActivity(intent)
        }

        else if (nama == ("Flu")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Flu")
            startActivity(intent)
        }

        else if (nama == ("Hipotermia")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Hipotermia")
            startActivity(intent)
        }

        else if (nama == ("Hipoksia")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Hipoksia")
            startActivity(intent)
        }

        else if (nama == ("Luka sobek")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Luka sobek")
            startActivity(intent)
        }

        else if (nama == ("Pingsan")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Pingsan")
            startActivity(intent)
        }

        else if (nama == ("Keracunan")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Keracunan")
            startActivity(intent)
        }

        else if (nama == ("Overdosis")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Overdosis")
            startActivity(intent)
        }

        else if (nama == ("Rabies")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Rabies")
            startActivity(intent)
        }

        else if (nama == ("Wasir")) {
            val intent = Intent(this, FirstAid::class.java)
            intent.putExtra("key", "Wasir")
            startActivity(intent)
        }
    }

}