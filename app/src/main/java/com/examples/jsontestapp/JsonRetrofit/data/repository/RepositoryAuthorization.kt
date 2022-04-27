package com.examples.jsontestapp.JsonRetrofit.data.repository

import com.examples.jsontestapp.JsonRetrofit.data.api.RetrofitInstanceAuthorization
import com.examples.jsontestapp.JsonRetrofit.model.Authorization.AuthorizationItem
import retrofit2.Response

class RepositoryAuthorization {
    suspend fun getAuthorizationCode(): AuthorizationItem {
        return RetrofitInstanceAuthorization.API.setAuthorization()
    }
}