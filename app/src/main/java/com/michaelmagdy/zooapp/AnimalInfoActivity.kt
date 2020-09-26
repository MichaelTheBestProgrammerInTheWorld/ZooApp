package com.michaelmagdy.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.synthetic.main.animal_ticket.*

class AnimalInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal_ticket)

        if (intent.hasExtra("animal")){

            val animal = intent.getSerializableExtra("animal") as Animal

            animal_name_txt.text = animal.name
            animal_desc_txt.text = animal.descr
            animal_image_view.setImageResource(animal.image!!)
        }
    }
}
