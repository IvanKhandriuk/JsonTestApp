package com.examples.jsontestapp.JsonRetrofit.data.repository

import com.examples.jsontestapp.JsonRetrofit.data.api.RetrofitInstance
import com.examples.jsontestapp.JsonRetrofit.model.Beznal.BeznalItem
import com.examples.jsontestapp.JsonRetrofit.model.Nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<NalichkaItem>{
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal(): Response<BeznalItem>{
        return RetrofitInstance.api.getBeznalMoney()
    }
}