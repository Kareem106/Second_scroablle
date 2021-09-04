package com.example.second_scroablle

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyle:RecyclerView=findViewById(R.id.scrollview)
        val list = getdata()
       recyle.adapter =ModelAdapter(list)
        recyle.layoutManager = LinearLayoutManager(this)
       recyle.setHasFixedSize(true)
    }
    private fun getdata():List<model>{
        val list=ArrayList<model>()
        list.add(model("jason",R.drawable.jason))
        list.add(model("freedy",R.drawable.freddie_kruger))
        list.add(model("annabelle",R.drawable.annabelle))
        list.add(model("TheNun",R.drawable.thenun))
        list.add(model("Samara",R.drawable.samara))
        list.add(model("ghostFace",R.drawable.ghostface))
        list.add(model("Alien",R.drawable.alien))
        list.add(model("chucky",R.drawable.chucky))
        list.add(model("creeper",R.drawable.creeper))
        list.add(model("Dracula",R.drawable.dracula))
        list.add(model("LeatherFace",R.drawable.leatherface))
        list.add(model("PinHead",R.drawable.pinhead))
        list.add(model("michael",R.drawable.michael))
return list
    }
}