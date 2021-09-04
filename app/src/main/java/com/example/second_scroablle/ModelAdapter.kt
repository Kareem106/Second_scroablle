package com.example.second_scroablle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ModelAdapter(private val Modellist:List<model>) : RecyclerView.Adapter<ModelAdapter.ModelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
    val interview=LayoutInflater.from(parent.context).inflate(R.layout.card_model,parent,false)

        return ModelViewHolder(interview)
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
val currentitem=Modellist[position]
      holder.imageview.setImageResource(currentitem.item_image)
        holder.textview.text=currentitem.item_text.toString()
    }

    override fun getItemCount() = Modellist.size

    class ModelViewHolder(Item_View:View) :RecyclerView.ViewHolder(Item_View){
 val imageview :ImageView=Item_View.findViewById(R.id.image_view)
        val  textview:TextView=Item_View.findViewById(R.id.text_view)

        }
    }
