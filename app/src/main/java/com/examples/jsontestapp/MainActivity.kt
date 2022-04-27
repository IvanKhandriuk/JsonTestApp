package com.examples.jsontestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.examples.jsontestapp.JsonRetrofit.MainViewModel
import com.examples.jsontestapp.JsonRetrofit.MainViewModelFactory
import com.examples.jsontestapp.JsonRetrofit.data.repository.RepositoryAuthorization

class MainActivity : AppCompatActivity() {



    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repositoryAuthorization = RepositoryAuthorization()
        val viewModelFactory=MainViewModelFactory(repositoryAuthorization)
        viewModel=ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        viewModel.getAuthorizationItem()
        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("Response Code", response.code.toString())
            Log.d("Response Result", response.result.toString())
        })
    }
}
