package com.example.kniga

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VpAdapter(val context: Context, val list:ArrayList<guide>): RecyclerView.Adapter<VpAdapter.MyVh>() {
    class MyVh(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title:TextView=itemView.findViewById(R.id.title1)
        val descr:TextView=itemView.findViewById(R.id.sometext)
        val image:ImageView=itemView.findViewById(R.id.img1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVh {
        val root=LayoutInflater.from(context).inflate(R.layout.vp_adapter,parent,false)
        return MyVh(root)
    }

    override fun onBindViewHolder(holder: MyVh, position: Int) {
        holder.title.text=list[position].title
        holder.descr.text=list[position].descr
        holder.image.setImageResource(list[position].image)

    }

    override fun getItemCount(): Int {
        return list.size
    }
}