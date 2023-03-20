package com.example.lameteodujours.DataCenter

import com.google.gson.annotations.SerializedName

data class ModelBase(
    @SerializedName("weather") val weather:List<Weather>,
    @SerializedName("main") val main:Main,
    @SerializedName("wind") val wind:Wind,
    @SerializedName("sys") val sys:Sys,
    @SerializedName("id") val id:Int,
    @SerializedName("name") val name:String


    )
