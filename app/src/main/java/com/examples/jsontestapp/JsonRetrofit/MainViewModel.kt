package com.examples.jsontestapp.JsonRetrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.examples.jsontestapp.JsonRetrofit.data.repository.RepositoryEnergy
import com.examples.jsontestapp.JsonRetrofit.model.Authorization.AuthorizationItem
import kotlinx.coroutines.launch


class MainViewModel(private val repositoryEnergy: RepositoryEnergy): ViewModel() {

    val myResponse: MutableLiveData<AuthorizationItem> = MutableLiveData()

    fun getAuthorizationItem(){
        viewModelScope.launch {
            val response =repositoryEnergy.getAuthorizationCode()
            myResponse.value= response
        }
    }
}