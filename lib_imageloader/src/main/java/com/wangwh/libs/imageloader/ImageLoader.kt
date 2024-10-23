package com.wangwh.libs.imageloader

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.wangwh.sdk.kext.ctx

/**
 * 作者: wenhui.w
 * 日期: 2024-10-23 19:43
 * 描述:
 */

fun ImageView.load(url: String) {
    Glide.with(ctx)
        .load(url)
        .into(this)
}