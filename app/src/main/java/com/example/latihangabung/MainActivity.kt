package com.example.latihangabung

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set adapter to be
        var sampleAdapter = Adapter{ String -> doClick(String) }
        sampleAdapter.setData(generateString())
        sampleAdapter.setData2(generateString2())

        /*
            Endless scroll view declaration block
         */
        var recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        //Put the adapter inside recycler view like usual recycler view
        recyclerView.adapter = sampleAdapter

    }

    //Generate default data for the adapter
    fun generateString():MutableList<String> {
        var stringList = ArrayList<String>()

        stringList.add("Halo, \nSelamat datang di FirstAid!")
        stringList.add("Pertolongan Pertama")
        stringList.add("Obat-obatan")
        stringList.add("Cari Rumah Sakit")
        return stringList
    }

    fun generateString2():MutableList<Int> {
        var stringList2 = ArrayList<Int>()

        stringList2.add(R.drawable.doctor)
        stringList2.add(R.drawable.emergencycall)
        stringList2.add(R.drawable.bandage)
        stringList2.add(R.drawable.ambulance)

        return stringList2
    }

    fun doClick( nama : String ) {

        if (nama == ("Pertolongan Pertama")) {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        else if (nama == ("Obat-obatan")) {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        else if (nama == ("Cari Rumah Sakit")) {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }

}
