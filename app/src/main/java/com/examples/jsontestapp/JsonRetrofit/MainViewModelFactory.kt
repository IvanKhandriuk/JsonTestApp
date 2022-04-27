package com.examples.jsontestapp.JsonRetrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.examples.jsontestapp.JsonRetrofit.data.repository.RepositoryAuthorization

class MainViewModelFactory(
    private val repositoryAuthorization: RepositoryAuthorization
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repositoryAuthorization) as T
    }
}