package com.allcode.mancitysquad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailSquad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_squad)
        val actionbar = supportActionBar
        actionbar?.title = "Detail Squad"
        actionbar?.setDisplayHomeAsUpEnabled(true)

        val tvSetName:TextView = findViewById(R.id.tv_item_name)
        val tvSetDetail:TextView = findViewById(R.id.tv_set_detail)
        val imgSetPhoto:ImageView = findViewById(R.id.img_item_photo)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetDetail.text = tDetail

    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL= "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
     }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}