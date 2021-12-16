package com.example.restoran_satici


import android.annotation.SuppressLint
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(val listData: List<urunler>, val clickListener: ClickListener): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    var templistData: ArrayList<urunler> = ArrayList()
    var templistData2: ArrayList<urunler> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.MyViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.urun_card,parent,false)
        templistData.addAll(listData)
        templistData2.add(urunler(1,"asd","tomorrow","2.5 km","25","5 left"))
        templistData2.add(urunler(2,"ramasdazan","tomorrow","2.5 km","25","5 left"))
        templistData2.add(urunler(3,"asd","tomorrow","2.5 km","25","5 left"))
        templistData2.add(urunler(4,"asd","tomorrow","2.5 km","25","5 left"))
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){


        var siparistarih_tv:TextView

        var cardview: CardView
        var urun_fiyat_tv: TextView
        var urun_kalan_tv: TextView



        init {

            siparistarih_tv=view.findViewById(R.id.restsiparistarih)

            urun_fiyat_tv=view.findViewById(R.id.cardurun_fiyat)
            urun_kalan_tv=view.findViewById(R.id.card_kalan)
            cardview=view.findViewById(R.id.restorancard_satir)

        }


    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.siparistarih_tv.text = listData.get(position).teslim_tarihi

        holder.urun_fiyat_tv.text = listData.get(position).urun_fiyat
        holder.urun_kalan_tv.text = listData.get(position).kalansayisi
        holder.itemView.setOnClickListener{
            clickListener.onItemClick(listData.get(position))
        }


    }
    interface ClickListener {
        fun onItemClick(dataModel: urunler)


    }


}