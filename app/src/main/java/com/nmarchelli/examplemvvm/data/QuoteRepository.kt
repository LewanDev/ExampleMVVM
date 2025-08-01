package com.nmarchelli.examplemvvm.data

import com.nmarchelli.examplemvvm.data.model.QuoteModel
import com.nmarchelli.examplemvvm.data.model.QuoteProvider
import com.nmarchelli.examplemvvm.data.network.QuoteService
import java.security.PrivateKey
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {
    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}