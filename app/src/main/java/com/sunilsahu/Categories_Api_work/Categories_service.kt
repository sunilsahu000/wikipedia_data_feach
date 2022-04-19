package com.sunilsahu.Categories_Api_work

import com.sunilsahu.categories_data_class.Categories_main_data
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL="https://commons.wikimedia.org/w/"

//https://commons.wikimedia.org/w/api.php?action=query&list=allcategories&acprefix=List+of&formatversion=2&format=json

//https://commons.wikimedia.org/w/api.php?action=query&list=allcategories&acprefix=List%20of&formatversion=2

interface ApiInterface2{
    @GET("api.php?action=query&list=allcategories&acprefix=List+of&formatversion=2&format=json")
    fun getData2(): Call<Categories_main_data>
//@Query("page")page:Int

}
object Categories_service{
    val apiInstance2:ApiInterface2
    init {
        val retrofit= Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        apiInstance2 =retrofit.create(ApiInterface2::class.java)
    }


}