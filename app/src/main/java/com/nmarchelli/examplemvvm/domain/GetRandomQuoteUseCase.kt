package com.nmarchelli.examplemvvm.domain

import com.nmarchelli.examplemvvm.data.model.QuoteModel
import com.nmarchelli.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes
        if (quotes.isNotEmpty()) {
            val randomNum = (quotes.indices).random()
            return quotes[randomNum]
        }
        return null
    }
}