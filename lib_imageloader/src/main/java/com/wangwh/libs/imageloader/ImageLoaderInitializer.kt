package com.wangwh.libs.imageloader

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import com.wangwh.sdk.kext.KextInitializer

/**
 * 作者: wenhui.w
 * 日期: 2024-10-25 10:29
 * 描述: App Startup初始化库
 */
class ImageLoaderInitializer : Initializer<Any> {
    /**
     * 该组件并不需要初始化, 用于演示初始化顺序
     *
     * @param context
     * @return
     */
    override fun create(context: Context): Any {
        Log.d("ImageLoaderInitializer", "call create")
        return Any()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return listOf(
            KextInitializer::class.java
        ).toMutableList()
    }
}