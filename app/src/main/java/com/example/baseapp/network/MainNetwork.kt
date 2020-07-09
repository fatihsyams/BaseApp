package com.example.baseapp.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface MainNetwork {
//    @POST("api/login")
//    fun doLogin(@Body loginBody: LoginRequest): Call<LoginResponse>



    companion object {
        private val BASE_URL = "https://reqres.in/"

        fun create(): MainNetwork {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(MainNetwork::class.java)
        }
    }
}