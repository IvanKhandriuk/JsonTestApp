package com.examples.jsontestapp

import retrofit2.Retrofit
import retrofit2.http.GET

/*interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<List<Repo?>?>?
}*/


var retrofit = Retrofit.Builder()
    .baseUrl("https://api.github.com/")
    .build()

//var service = retrofit.create(GitHubService::class.java)