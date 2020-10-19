package com.aathil.restaurant

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(private val context: Activity, val title: Array<String>, val description: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.items, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.items, null, true)

        val titleText = rowView.findViewById(R.id.foodName) as TextView
        val imageView = rowView.findViewById(R.id.foodImage) as ImageView
       // val subtitleText = rowView.findViewById(R.id.description) as TextView

        titleText.text = title[position]
        imageView.setImageResource(imgid[position])
       // subtitleText.text = description[position]

        imageView.layoutParams.height = 300;
        imageView.layoutParams.width= 300;
        imageView.requestLayout();


        return rowView
    }
}