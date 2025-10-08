package com.example.mynit32132b3.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseItem(
    @Json(name = "id") val idnumb:Int,
    @Json(name = "name") val name:String,
    @Json(name = "data") val data: Map<String,String>?
)
