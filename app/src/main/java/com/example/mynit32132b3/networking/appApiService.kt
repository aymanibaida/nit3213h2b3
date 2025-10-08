package com.example.mynit32132b3.networking

import com.example.mynit32132b3.models.ResponseItem
import retrofit2.http.GET

interface appApiService {

    @GET("objects")
    suspend fun getAllObjects() : List<ResponseItem>



}