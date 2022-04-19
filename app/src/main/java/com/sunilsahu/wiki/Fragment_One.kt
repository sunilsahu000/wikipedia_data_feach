package com.sunilsahu.wiki

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.sunilsahu.wiki.Myapi.Main_Data_my
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Fragment_One : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getpi()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__one, container, false)

      //  getpi()


    }


    private fun getpi() {
        val api = ApiService.apiInstance.getData(1)
        api.enqueue(object : Callback<Main_Data_my> {


            override fun onFailure(call: Call<Main_Data_my>, t: Throwable) {
                Log.d("SUNIL", "ERROR IN FECHING DATA", t)
            }


            override fun onResponse(call: Call<Main_Data_my>, response: Response<Main_Data_my>) {

                try {


                    val myappi = response.body()


                    if (myappi != null) {

                          //Log.d("SAHU", myappi.toString())

                        Log.d("SAHU", myappi.query.pages.`101350129`.imageinfo[0].url.toString())
                       // Log.d("SAHU", myappi.query.pages.`101350129`.imageinfo[0].url)
                       // Log.d("SAHU", myappi.query.pages.`38243931`.imageinfo[0].url)
                       // Log.d("SAHU", myappi.query.pages.`4406048`.imageinfo[0].url)
                      //  Log.d("SAHU", myappi.query.pages.`45353950`.imageinfo[0].url)
                       // Log.d("SAHU", myappi.query.pages.`49179423`.imageinfo[0].url)
                       // Log.d("SAHU", myappi.query.pages.`49829990`.imageinfo[0].url)



                        //imageView for binding data in glide
                        val img = view?.findViewById<ImageView>(R.id.Data_image)
                        val img2 = view?.findViewById<ImageView>(R.id.imageView2)
                        val img3 = view?.findViewById<ImageView>(R.id.imageView3)
                        val img4 = view?.findViewById<ImageView>(R.id.imageView4)
                        val img5 = view?.findViewById<ImageView>(R.id.imageView5)
                        val img6 = view?.findViewById<ImageView>(R.id.imageView6)
                        val img7 = view?.findViewById<ImageView>(R.id.imageView7)
                        val img8 = view?.findViewById<ImageView>(R.id.imageView8)
                        val img9 = view?.findViewById<ImageView>(R.id.imageView9)
                        val img10 = view?.findViewById<ImageView>(R.id.imageView10)
                        //load image in glide


                        //image 1 data bind

                            if (img != null) {
                                LoadImage(myappi.query.pages.`100622105`.imageinfo[0].url, img)
                            }
                        //image 2 data bind
                        if (img2 != null) {
                            LoadImage(myappi.query.pages.`101350129`.imageinfo[0].url.toString(), img2)
                        }
                        //image 3 data bind
                        if (img3 != null) {
                            LoadImage(myappi.query.pages.`38243931`.imageinfo[0].url.toString(), img3)
                        }
                        //image 4 data bind
                        if (img4 != null) {
                            LoadImage(myappi.query.pages.`4406048`.imageinfo[0].url.toString(), img4)
                        }
                        //image 5 data bind
                        if (img5 != null) {
                            LoadImage(myappi.query.pages.`45353950`.imageinfo[0].url.toString(), img5)
                        }
                        //image 6 data bind
                        if (img6 != null) {
                            LoadImage(myappi.query.pages.`49179423`.imageinfo[0].url.toString(), img6)
                        }
                        //image 7 data bind
                        if (img7 != null) {
                            LoadImage(myappi.query.pages.`49829990`.imageinfo[0].url.toString(), img7)
                        }
                        //image 8 data bind
                        if (img8 != null) {
                            LoadImage(myappi.query.pages.`79000710`.imageinfo[0].url.toString(), img8)
                        }
                        //image 9 data bind
                        if (img9 != null) {
                            LoadImage(myappi.query.pages.`89274662`.imageinfo[0].url.toString(), img9)
                        }
                        //image 10 data bind
                        /*  if (img10 != null) {
                            LoadImage(myappi.query.pages.`93986328`.imageinfo[0].url.toString(),img10)
                        }*/


                    }


                } catch (e: Exception) {
                    Log.d("Su", e.toString())
                }
            }


        })


    }


    fun LoadImage(url: String, id: ImageView) {

        try {
            Glide.with(this@Fragment_One)
                    .load(url)
                    .skipMemoryCache(true)
                    .format(DecodeFormat.PREFER_RGB_565)
                    .centerInside()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .listener(object : RequestListener<Drawable> {
                        override fun onLoadFailed(e: GlideException?, model: Any?, target: com.bumptech.glide.request.target.Target<Drawable>?, isFirstResource: Boolean
                        ): Boolean {
                            return false;

                        }

                        override fun onResourceReady(resource: Drawable?, model: Any?, target: com.bumptech.glide.request.target.Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean
                        ): Boolean {
                            return false;
                        }

                    })
                    .into(id)
        } catch (e: java.lang.Exception) {

        }


    }




}