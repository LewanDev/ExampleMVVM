package com.nmarchelli.examplemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://novartes.com.ar/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}