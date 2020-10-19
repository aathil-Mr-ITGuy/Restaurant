package com.aathil.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val name = arrayOf<String>(
        "Pasta",
        "French Fries",
        "Ice Cream",
        "Bread",
        "Fried Rice",
        "Pancakes",
        "Burger",
        "Pizza",
        "Pumpkin Pie",
        "Chicken Pot Pie",


        )

    val description = arrayOf<String>(
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's and typesetting industry. Lorem Ipsum has been the industry's ",
    )

    val imagesId = arrayOf<Int>(
        R.drawable.pasta,
        R.drawable.frenchfries,
        R.drawable.ice,
        R.drawable.bread,
        R.drawable.firedrice,
        R.drawable.pancake,
        R.drawable.burger,
        R.drawable.pizza,
        R.drawable.pumpkinpie,
        R.drawable.chickenpotpie

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //creating list adapter
        var myListAdapter = MyListAdapter(this,name,description,imagesId)
        gridView.adapter = myListAdapter

        gridView.setOnItemClickListener(){ adapterView, _, position, _ ->
            val intent = Intent(this, detailView:: class.java)
            intent.putExtra("name", name[position]!!)
            intent.putExtra("des", description[position]!!)
            intent.putExtra("image", imagesId[position]!!)
            startActivity(intent)
//            val itemAtPos = adapterView.getItemAtPosition(position)
//            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
//            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
//        listView.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long,  ->
//            val intent = Intent(this, AnimalInfo:: class.java)
//            intent.putExtra("title", title[position]!!)
//            intent.putExtra("des", description!!)
//            intent.putExtra("image", imagesId!!)
//            startActivity(intent)
//
//        }
    }

}