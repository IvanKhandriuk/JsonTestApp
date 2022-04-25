package com.examples.jsontestapp.JsonRetrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.examples.jsontestapp.JsonRetrofit.data.repository.Repository
import com.examples.jsontestapp.JsonRetrofit.model.Beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()

        }
    }
}