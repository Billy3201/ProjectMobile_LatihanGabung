package com.example.latihangabung

import android.content.Context
import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class Adapter(val adapterOnClick : (String) -> Unit): RecyclerView.Adapter<Adapter.SampleVH>() {

    var adapterList: MutableList<String> = ArrayList()
    var imageList: MutableList<Int> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleVH {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.sample_adapter, parent, false)

        return SampleVH(itemView)
    }

    override fun getItemCount(): Int {
        return adapterList.size
        return imageList.size
    }

    fun setData(promoList: MutableList<String>) {
        this.adapterList = promoList

        //notifyDataSetChanged()
    }

    fun setData2(promoList2: MutableList<Int>) {
        this.imageList = promoList2
        //notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: SampleVH, position: Int) {
        holder.setText(adapterList.get(position))
        holder.imageView.setImageResource(imageList.get(position))
        Log.d("asal", adapterList.get(position))
    }

    inner class SampleVH : RecyclerView.ViewHolder {

        lateinit var textView: TextView
        lateinit var imageView: ImageView


        constructor(itemView: View) : super(itemView) {
            //bind here

            textView = itemView.findViewById<TextView?>(R.id.text_view)
            textView.text = "hallo"

            imageView = itemView.findViewById<ImageView>(R.id.image_view)
            imageView.setImageResource(R.drawable.ic_launcher_background)

        }

        fun setText(string: String ) {
            textView.text = string
            textView.setOnClickListener { adapterOnClick(string) }

        }
    }
}





