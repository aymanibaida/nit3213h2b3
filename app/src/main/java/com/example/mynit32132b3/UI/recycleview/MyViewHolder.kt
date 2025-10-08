package com.example.mynit32132b3.UI.recycleview

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynit32132b3.R

class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val textView=view.findViewById<TextView>(R.id.VHtextView)
    val button=view.findViewById<Button>(R.id.VHbutton)

fun bind(text:String){
    textView.text=text
}
}