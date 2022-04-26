package com.examples.jsontestapp.JsonRetrofit.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.examples.jsontestapp.JsonRetrofit.model.Authorization.AuthorizationItem
import com.examples.jsontestapp.JsonRetrofit.model.Nal.NalichkaItem
import com.examples.jsontestapp.R
import kotlinx.android.synthetic.main.item_parametrs_layout.view.*

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>(){

    var listStart= emptyList<NalichkaItem>()
    var listEnergy= emptyList<AuthorizationItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent:ViewGroup, viewTyper: Int): StartViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_parametrs_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int){
        holder.itemView.item_name.text=listStart[position].ccy
        holder.itemView.item_buy.text=listStart[position].buy
        holder.itemView.item_sale.text=listStart[position].sale
    }

    override fun getItemCount(): Int{
        return listStart.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list:List<NalichkaItem>){
        listStart=list
        notifyDataSetChanged()
    }

}