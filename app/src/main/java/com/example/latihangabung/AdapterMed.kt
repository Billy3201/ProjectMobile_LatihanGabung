package com.example.latihangabung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterMed(val clickAdapter : (String) -> Unit): RecyclerView.Adapter<AdapterMed.sampleMed>() {

    var listAdpt: MutableList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): sampleMed {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter_med, parent, false)

        return sampleMed(itemView)
    }

    override fun getItemCount(): Int {
        return listAdpt.size
    }

    fun setData(stringList: MutableList<String>) {
        this.listAdpt = stringList

        //notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: sampleMed, position: Int) {
        holder.setText(listAdpt.get(position))
        Log.d("asal", listAdpt.get(position))
    }

    inner class sampleMed : RecyclerView.ViewHolder {

        lateinit var textView: TextView


        constructor(itemView: View) : super(itemView) {
            //bind here

            textView = itemView.findViewById<TextView?>(R.id.textViewMed)

        }

        fun setText(string: String ) {
            textView.text = string
            textView.setOnClickListener { clickAdapter(string) }

        }
    }
}