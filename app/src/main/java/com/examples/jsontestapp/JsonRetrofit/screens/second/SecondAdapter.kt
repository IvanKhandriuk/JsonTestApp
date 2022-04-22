package com.examples.jsontestapp.JsonRetrofit.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.examples.jsontestapp.JsonRetrofit.model.Beznal.BeznalItem
import com.examples.jsontestapp.JsonRetrofit.model.Nal.NalichkaItem
import com.examples.jsontestapp.R
import kotlinx.android.synthetic.main.item_parametrs_layout.view.*

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond= emptyList<BeznalItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewTyper: Int): SecondViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_parametrs_layout,parent,false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int){
        holder.itemView.item_name.text=listSecond[position].ccy
        holder.itemView.item_buy.text=listSecond[position].buy
        holder.itemView.item_sale.text=listSecond[position].sale

    }

    override fun getItemCount(): Int{
        return listSecond.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<BeznalItem>){
        listSecond=list
        notifyDataSetChanged()
    }

}