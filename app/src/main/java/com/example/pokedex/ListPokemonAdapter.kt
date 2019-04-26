package com.example.pokdex

import android.content.Context
import android.support.annotation.NonNull
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import android.support.v7.widget.RecyclerView.ViewHolder
import com.example.pokdex.models.Pokemon
import com.example.pokedex.R


class ListPokemonAdapter : RecyclerView.Adapter<ListPokemonAdapter.ViewHolder>(), View.OnClickListener{

    private var dataset: ArrayList<Pokemon>? = null
    private val context: Context? = null
    private val listener: View.OnClickListener? = null


    fun ListPokemonAdapter(context: Context){
        dataset = ArrayList()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup, false)

        view.setOnClickListener(this)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset?.size!!
    }

    fun adicionarListaPokemon(listPokemon: ArrayList<Pokemon>) {
        dataset?.addAll(listPokemon)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(viewHolderDatos: ListPokemonAdapter.ViewHolder, i: Int) {
        val p = dataset?.get(i)
        viewHolderDatos.nombreTextView.setText(p?.name) //nombre
        viewHolderDatos.idPokemon.text = Integer.toString(p?.number!!) //id
        //get imagen
        Glide.with(context).load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+p.name+".png").centerCrop().crossFade().diskCacheStrategy(DiskCacheStrategy.ALL).into(viewHolderDatos.fotoImageView);

    }

    override fun onClick(v: View?) {
        listener?.onClick(v)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val fotoImageView: ImageView
        val nombreTextView: TextView
        val idPokemon: TextView

        init {

            fotoImageView = itemView.findViewById(R.id.FotoID)
            nombreTextView = itemView.findViewById(R.id.DatoID)
            idPokemon = itemView.findViewById(R.id.PkmID)
        }
    }


}