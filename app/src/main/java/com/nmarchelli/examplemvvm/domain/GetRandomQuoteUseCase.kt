package com.nmarchelli.examplemvvm.domain

import com.nmarchelli.examplemvvm.data.model.QuoteModel
import com.nmarchelli.examplemvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val quoteProvider: QuoteProvider
) {
    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quotes
        if (quotes.isNotEmpty()) {
            val randomNum = (quotes.indices).random()
            return quotes[randomNum]
        }
        return null
    }
}