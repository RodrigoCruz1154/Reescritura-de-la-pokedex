package com.example.pokedex

import android.app.Dialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pokdex.ListPokemonAdapter
import retrofit2.Retrofit
import android.support.v7.widget.RecyclerView
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val recycler: RecyclerView? = null
    private val retrofit: Retrofit? = null
    private val listPokemonAdapter: ListPokemonAdapter? = null
    private val btnMostrar: Button? = null
    private val offset: Int = 0
    private val ableToLoad: Boolean = false
    private val TAG = "POKEDEX"
    private val EntryDataPkn: Dialog? = null

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }
}
