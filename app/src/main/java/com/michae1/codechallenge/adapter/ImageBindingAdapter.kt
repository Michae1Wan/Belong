package com.michae1.codechallenge.adapter

import android.graphics.BitmapFactory
import android.util.Base64
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions
import com.michae1.codechallenge.R
import com.michae1.codechallenge.network.ApiService
import javax.inject.Inject


/**
 *
 * Created by Michae1 (michae1wan@live.com) on 7/23/2020.
 */
@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, imageUrl: String?) {
    Glide
        .with(imageView.context)
        .asBitmap()
        .placeholder(R.drawable.placeholder)
        .load(imageUrl)
        .centerCrop()
        .into(imageView)

}
