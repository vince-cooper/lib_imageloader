package com.wangwh.demo.lib_imageloader

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wangwh.demo.lib_imageloader.databinding.ActivityMainBinding
import com.wangwh.libs.imageloader.load

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.photoIv.load("https://img1.baidu.com/it/u=3214067567,2890092849&fm=253&app=120&size=w931&n=0&f=JPEG&fmt=auto?sec=1729789200&t=3a3a4ac253685a0258ef48b533644fbb")
    }
}