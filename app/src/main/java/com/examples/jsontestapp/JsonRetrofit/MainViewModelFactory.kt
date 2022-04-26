package com.examples.jsontestapp.JsonRetrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.examples.jsontestapp.JsonRetrofit.data.repository.RepositoryEnergy

class MainViewModelFactory(
    private val repositoryEnergy: RepositoryEnergy
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repositoryEnergy) as T
    }
}