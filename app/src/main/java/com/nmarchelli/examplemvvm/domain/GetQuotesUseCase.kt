package com.nmarchelli.examplemvvm.domain

import com.nmarchelli.examplemvvm.data.QuoteRepository
import com.nmarchelli.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    //this fun returns the useCase
    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}