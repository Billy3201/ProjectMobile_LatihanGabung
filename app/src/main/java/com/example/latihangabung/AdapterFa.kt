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

class AdapterFa(val onClickAdapter : (String) -> Unit): RecyclerView.Adapter<AdapterFa.SampleFA>() {

    var listAdapter: MutableList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleFA {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter_fa, parent, false)

        return SampleFA(itemView)
    }

    override fun getItemCount(): Int {
        return listAdapter.size
    }

    fun setData(stringList: MutableList<String>) {
        this.listAdapter = stringList

        //notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: SampleFA, position: Int) {
        holder.setText(listAdapter.get(position))
        Log.d("asal", listAdapter.get(position))
    }

    inner class SampleFA : RecyclerView.ViewHolder {

        lateinit var textView: TextView


        constructor(itemView: View) : super(itemView) {
            //bind here

            textView = itemView.findViewById<TextView?>(R.id.textViewFa)
            textView.text = "hallo"

        }

        fun setText(string: String ) {
            textView.text = string
            textView.setOnClickListener { onClickAdapter(string) }

        }
    }
}