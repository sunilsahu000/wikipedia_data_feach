package com.sunilsahu.wiki

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.sunilsahu.Categories_Api_work.Categories_service
import com.sunilsahu.categories_data_class.Categories_main_data
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Fragment_Two : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       getpi2()

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__two, container, false)
    }


    private fun getpi2() {
        val api= Categories_service.apiInstance2.getData2()
        api.enqueue(object : Callback<Categories_main_data> {


            override fun onFailure(call: Call<Categories_main_data>, t: Throwable) {
                Log.d("SUNIL","ERROR IN FECHING DATA",t)
            }


            override fun onResponse(call: Call<Categories_main_data>, response: Response<Categories_main_data>) {

                try {


                    val myappi2 = response.body()


                    if (myappi2 != null) {

                        //text view for binding daata in feach
                        val cat_text_1= view?.findViewById<TextView>(R.id.category_text_1)
                        val cat_text_2= view?.findViewById<TextView>(R.id.category_text_2)
                        val cat_text_3= view?.findViewById<TextView>(R.id.category_text_3)
                        val cat_text_4= view?.findViewById<TextView>(R.id.category_text_4)
                        val cat_text_5= view?.findViewById<TextView>(R.id.category_text_5)
                        val cat_text_6= view?.findViewById<TextView>(R.id.category_text_6)
                        val cat_text_7= view?.findViewById<TextView>(R.id.category_text_7)
                        val cat_text_8= view?.findViewById<TextView>(R.id.category_text_8)
                        val cat_text_9= view?.findViewById<TextView>(R.id.category_text_9)
                        val cat_text_10= view?.findViewById<TextView>(R.id.category_text_10)




                        //data bind in our text view
                        if (cat_text_1 != null) {
                            cat_text_1.text= myappi2.query.allcategories[0].category.toString()
                        }
                        //2
                        if (cat_text_2 != null) {
                                cat_text_2.text= myappi2.query.allcategories[1].category.toString()
                        }
                        //3
                        if (cat_text_3 != null) {
                            cat_text_3.text= myappi2.query.allcategories[2].category.toString()
                        }
                        //4
                        if (cat_text_4 != null) {
                            cat_text_4.text= myappi2.query.allcategories[3].category.toString()
                        }
                        //5
                        if (cat_text_5 != null) {
                            cat_text_5.text= myappi2.query.allcategories[4].category.toString()
                        }
                        //6
                        if (cat_text_6 != null) {
                            cat_text_6.text= myappi2.query.allcategories[5].category.toString()
                        }
                        //7
                        if (cat_text_7 != null) {
                            cat_text_7.text= myappi2.query.allcategories[6].category.toString()
                        }
                        //8
                        if (cat_text_8 != null) {
                            cat_text_8.text= myappi2.query.allcategories[7].category.toString()
                        }
                        //9
                        if (cat_text_9 != null) {
                            cat_text_9.text= myappi2.query.allcategories[8].category.toString()
                        }
                        //10
                        if (cat_text_10 != null) {
                            cat_text_10.text= myappi2.query.allcategories[9].category.toString()
                        }






                    }



                }catch (e:Exception){
                    Log.d("Su",e.toString())
                }
            }


        })


    }







}









