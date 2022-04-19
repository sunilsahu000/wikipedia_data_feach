package com.sunilsahu.wiki


import com.sunilsahu.wiki.Myapi.Main_Data_my
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


const val BASE_URL="https://commons.wikimedia.org/w/"

interface ApiInterface{
@GET("api.php?action=query&prop=imageinfo&iiprop=timestamp%7Cuser%7Curl&generator=categorymembers&gcmtype=file&gcmtitle=Category:Featured_pictures_on_Wikimedia_Commons&format=json&utf8")
fun getData(@Query("page") page:Int):Call<Main_Data_my>
//@Query("page")page:Int

}
object ApiService{
    val apiInstance:ApiInterface
    init {
        val retrofit=Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        apiInstance =retrofit.create(ApiInterface::class.java)
    }


}