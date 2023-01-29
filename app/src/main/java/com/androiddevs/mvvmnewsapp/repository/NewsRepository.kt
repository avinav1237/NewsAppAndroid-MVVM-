package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDataBase

class NewsRepository(
    val db : ArticleDataBase
) {
    suspend fun getBreakingNews(countryCode : String, pageNumber : Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}