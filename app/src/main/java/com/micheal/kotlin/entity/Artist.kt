package com.micheal.kotlin.entity

class Artist(id:Long,name:String,url:String,mbid:String) {
    var mId :Long=id
    var mName:String=name
    var mUrl:String=url
    var mBid:String=mbid



    override fun toString(): String {
        return super.toString()
    }

    fun test(){
        var notNullArtist:Artist?=null

        notNullArtist?.print()

    }

    fun print(){

    }


}