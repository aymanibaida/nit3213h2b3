package com.example.mynit32132b3.UI.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynit32132b3.R

class myrecycleviewadapter(private var dataSet: List<String>) :
    RecyclerView.Adapter<MyViewHolder>() {



    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.myviewholder, viewGroup, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size

    fun setDataset(newDataSet: List<String>) {
        dataSet=newDataSet
        notifyDataSetChanged()
    }
}
