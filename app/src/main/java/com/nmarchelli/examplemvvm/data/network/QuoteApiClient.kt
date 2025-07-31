package com.nmarchelli.examplemvvm.data.network

import com.nmarchelli.examplemvvm.data.model.QuoteModel
import retrofit2.http.GET
import retrofit2.Response

interface QuoteApiClient {
    @GET("api/quotes.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}