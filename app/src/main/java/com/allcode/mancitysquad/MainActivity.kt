package com.allcode.mancitysquad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSquad: RecyclerView
    private  var list:ArrayList<Squad> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar?.title = "Manchester City Squad"

        rvSquad = findViewById(R.id.rv_squad)
        rvSquad.setHasFixedSize(true)

        list.addAll(SquadData.listData)
        showRecyclerList()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode:Int){
        when(selectedMode){
            R.id.action_about->{
                val about = Intent(this@MainActivity,About::class.java)
                startActivity(about)

            }
        }
    }

    private fun showRecyclerList() {
        rvSquad.layoutManager = LinearLayoutManager(this)
        val listSquadAdapter = ListSquadAdapter(list)
        rvSquad.adapter = listSquadAdapter
    }

}