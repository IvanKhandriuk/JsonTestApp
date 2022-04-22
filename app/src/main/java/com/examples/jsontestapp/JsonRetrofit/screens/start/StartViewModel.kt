package com.examples.jsontestapp.JsonRetrofit.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.examples.jsontestapp.JsonRetrofit.data.repository.Repository
import com.examples.jsontestapp.JsonRetrofit.model.Nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {

    var repo=Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {

        }
    }
}