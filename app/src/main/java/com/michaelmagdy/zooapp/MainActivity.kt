package com.michaelmagdy.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listOfAnimals = ArrayList<Animal>()
    var adapter:AnimalsAdapter ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //load animals
        listOfAnimals.add(Animal("Baboon",
            "Baboons are primates comprising the genus Papio, one of the 23 genera of Old World monkeys",
            R.drawable.baboon))
        listOfAnimals.add(Animal("Bulldog",
            "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed",
            R.drawable.bulldog))
        listOfAnimals.add(Animal("Panda",
            "The giant panda, also known as the panda bear or simply the panda, is a bear native to south central China",
            R.drawable.panda))
        listOfAnimals.add(Animal("Swallow Bird",
            "The swallows, martins, and saw-wings, or Hirundinidae, are a family of passerine birds found around the world on all continents",
            R.drawable.swallow_bird))
        listOfAnimals.add(Animal("White Tiger",
            "The white tiger or bleached tiger is a pigmentation variant of the Bengal tiger",
            R.drawable.white_tiger))
        listOfAnimals.add(Animal("Zebra",
            "Zebras are African equines with distinctive black-and-white striped coats",
            R.drawable.zebra))

        adapter = AnimalsAdapter(listOfAnimals)
        animals_list_view.adapter = adapter
    }
}
