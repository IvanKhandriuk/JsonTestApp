package com.examples.jsontestapp.JsonRetrofit.data.api

import com.examples.jsontestapp.JsonRetrofit.model.Beznal.Beznal
import com.examples.jsontestapp.JsonRetrofit.model.Nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney():Response<Nalichka>

    @GET("https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoney():Response<Beznal>
}