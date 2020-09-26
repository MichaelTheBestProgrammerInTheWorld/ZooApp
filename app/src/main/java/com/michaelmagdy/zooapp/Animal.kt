package com.michaelmagdy.zooapp

import java.io.Serializable

class Animal: Serializable {

    var name:String ?= null
    var descr:String ?= null
    var image:Int ?= null

    constructor(name: String?, descr: String?, image: Int?) {
        this.name = name
        this.descr = descr
        this.image = image
    }
}