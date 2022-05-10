package com.allcode.mancitysquad

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.allcode.mancitysquad.ListSquadAdapter.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSquadAdapter(val listSquad:ArrayList<Squad>): RecyclerView.Adapter<ListSquadAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName:TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_squad,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,detail,photo) = listSquad[position]



        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text = name

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener { val moveDetail = Intent(mContext,DetailSquad::class.java)
            moveDetail.putExtra(DetailSquad.EXTRA_NAME,name)
            moveDetail.putExtra(DetailSquad.EXTRA_PHOTO,photo)
            moveDetail.putExtra(DetailSquad.EXTRA_DETAIL,detail)
            mContext.startActivity(moveDetail)
        }


    }

    override fun getItemCount(): Int {
        return listSquad.size
    }
}