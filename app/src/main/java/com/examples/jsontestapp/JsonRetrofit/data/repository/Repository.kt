package com.examples.jsontestapp.JsonRetrofit.data.repository

import com.examples.jsontestapp.JsonRetrofit.data.api.RetrofitInstance
import com.examples.jsontestapp.JsonRetrofit.model.Beznal.Beznal
import com.examples.jsontestapp.JsonRetrofit.model.Nal.Nalichka
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoney()
    }
}