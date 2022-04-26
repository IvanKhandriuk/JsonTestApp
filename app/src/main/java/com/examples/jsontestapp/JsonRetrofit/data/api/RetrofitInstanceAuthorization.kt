package com.examples.jsontestapp.JsonRetrofit.data.api

import com.examples.jsontestapp.JsonRetrofit.Util.Constant.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstanceAuthorization {
        private val retrofitEnergy by lazy{
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val API:ApiAuthorization by lazy{
            retrofitEnergy.create(ApiAuthorization::class.java)
        }
}