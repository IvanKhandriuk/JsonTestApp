package com.examples.jsontestapp.JsonRetrofit.data.api

import com.examples.jsontestapp.JsonRetrofit.model.Authorization.AuthorizationData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TestApi {
    @GET("ev_auth.php")
    open fun setAuthorization(
        @Query("login") login: String,
        @Query("pass") pass: String
    ): Call<AuthorizationData?>?
}