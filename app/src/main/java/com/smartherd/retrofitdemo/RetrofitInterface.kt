package com.smartherd.retrofitdemo

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {
    @get:GET("/posts")
    val post: Call<List<PostModel?>?>?
    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com"
    }
}