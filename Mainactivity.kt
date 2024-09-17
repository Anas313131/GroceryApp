package com.example.grocery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        var groceryItems:ArrayList<Itemmodel> = ArrayList()

        val v1= Itemmodel("fruit","fresh fruit here",R.drawable.fruit1)
        val v2= Itemmodel("vegetable","Delicious vegetable", R.drawable.vegetable2)
        val v3= Itemmodel("bakery","bread delicious and sweety",R.drawable.bread1)
        val v4= Itemmodel("Milk","shakes and yougurt",R.drawable.milk1)
        val v5= Itemmodel("snaks","pop corn donut",R.drawable.popcorn1)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)


        val adapter = Myadaptor(groceryItems)
        recyclerView.adapter= adapter


    }




}
