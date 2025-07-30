package com.nmarchelli.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nmarchelli.examplemvvm.model.QuoteModel
import com.nmarchelli.examplemvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val liveDataQuoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        liveDataQuoteModel.postValue(currentQuote)
    }
}