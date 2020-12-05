package com.example.latihangabung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var adptSample = AdapterMed{ String -> doClick(String) }
        adptSample.setData(strGen())

        /*
            Endless scroll view declaration block
         */
        var recyclerView = findViewById<RecyclerView>(R.id.recycler_view_med)

        recyclerView.layoutManager = LinearLayoutManager(this)
        //Put the adapter inside recycler view like usual recycler view
        recyclerView.adapter = adptSample

    }

    //Generate default data for the adapter
    fun strGen():MutableList<String> {
        var strList = ArrayList<String>()

        /*for(i in 1..25)
            strList.add("Sample $i")  */

        strList.add("Asma")
        strList.add("Serangan Jantung")
        strList.add("Diare")
        strList.add("Pendarahan")
        strList.add("Kejang")
        strList.add("Keracunan")
        strList.add("Luka Bakar")
        strList.add("Maag")
        strList.add("Sakit Gigi")
        strList.add("Flu")
        //strList.add("Luka Bakar")

        return strList
    }


    fun doClick( nama : String ) {

        if (nama == ("Asma")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Asma")
            startActivity(intent)
        }

        else if (nama == ("Serangan Jantung")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Serangan Jantung")
            startActivity(intent)
        }

        else if (nama == ("Diare")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Diare")
            startActivity(intent)
        }

        else if (nama == ("Pendarahan")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Pendarahan")
            startActivity(intent)
        }

        else if (nama == ("Kejang")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Kejang")
            startActivity(intent)
        }

        else if (nama == ("Keracunan")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Keracunan")
            startActivity(intent)
        }

        else if (nama == ("Sakit Gigi")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Alergi")
            startActivity(intent)
        }

        else if (nama == ("Maag")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Kejang")
            startActivity(intent)
        }

        else if (nama == ("Luka Bakar")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Keracunan")
            startActivity(intent)
        }

        else if (nama == ("Flu")) {
            val intent = Intent(this, Medicine::class.java)
            intent.putExtra("keyMed", "Alergi")
            startActivity(intent)
        }
    }

}
