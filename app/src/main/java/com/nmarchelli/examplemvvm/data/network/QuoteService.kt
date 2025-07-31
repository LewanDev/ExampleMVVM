package com.nmarchelli.examplemvvm.data.network

import com.nmarchelli.examplemvvm.core.RetrofitHelper
import com.nmarchelli.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

//this class is called when app gets the data from internet
class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) { //coroutine
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}