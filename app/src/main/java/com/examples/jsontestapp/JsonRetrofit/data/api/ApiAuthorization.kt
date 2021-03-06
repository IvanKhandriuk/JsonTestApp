package com.examples.jsontestapp.JsonRetrofit.data.api

import com.examples.jsontestapp.JsonRetrofit.Util.Constant.Companion.PASS
import com.examples.jsontestapp.JsonRetrofit.model.Authorization.AuthorizationData
import com.examples.jsontestapp.JsonRetrofit.model.Authorization.AuthorizationItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//?login=olga&pass=b2xnYTEyMw=="
//@GET("ev_auth.php")
//suspend fun getAuthorizationCode():AuthorizationItem
interface ApiAuthorization {
    @GET("ev_auth.php")
    open fun setAuthorization(
        @Query("login") login: String,
        @Query("pass") pass: String
    ): Call<AuthorizationData?>?
}
    //suspend fun getAuthorizationCode():AuthorizationItem }