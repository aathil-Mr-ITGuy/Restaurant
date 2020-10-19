package com.aathil.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_view.*

class detailView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_detail_view)
        val bundle: Bundle? = intent.extras
        val name = bundle?.getString("name")
        val des = bundle?.getString("des")
        val image = bundle?.getInt("image")

        if (image != null) {
            itemImage.setImageResource(image)
        }
        itemName.text = name
        itemDetails.text = des

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = name
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)






    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}