package com.nmarchelli.examplemvvm.data

import com.nmarchelli.examplemvvm.data.model.QuoteModel
import com.nmarchelli.examplemvvm.data.model.QuoteProvider
import com.nmarchelli.examplemvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}