package com.examples.jsontestapp.JsonRetrofit.data.api

import android.os.Build
import com.examples.jsontestapp.JsonRetrofit.model.Authorization.AuthorizationItem
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import java.util.*


/*@GET("ev_auth.php")
suspend fun getAuthorizationCode():AuthorizationItem*/

interface ApiAuthorization {
    val encodedString: String
        get() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Base64.getEncoder().encodeToString("olga123".toByteArray())
        } else {
            TODO("VERSION.SDK_INT < O")
        }

    @GET("ev_auth.php")
    suspend fun getAuthorizationCode():AuthorizationItem
}