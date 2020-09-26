package com.michaelmagdy.zooapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.animal_ticket.view.*

class AnimalsAdapter:BaseAdapter {

    var listOfAnimals = ArrayList<Animal>()

    constructor(listOfAnimals:ArrayList<Animal>):super(){

        this.listOfAnimals = listOfAnimals
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val animal = listOfAnimals[position]
        var myView = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.animal_ticket, null)
        myView.animal_name_txt.text = animal.name
        myView.animal_desc_txt.text = animal.descr
        myView.animal_image_view.setImageResource(animal.image!!)
        return myView
    }

    override fun getItem(position: Int): Any {

        return listOfAnimals[position]
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getCount(): Int {

        return listOfAnimals.size
    }


}