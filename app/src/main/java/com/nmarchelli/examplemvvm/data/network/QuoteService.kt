package com.nmarchelli.examplemvvm.data.network

import com.nmarchelli.examplemvvm.core.RetrofitHelper
import com.nmarchelli.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

//this class is called when app gets the data from internet
class QuoteService @Inject constructor(
    private val api: QuoteApiClient
) {
    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) { //coroutine
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}