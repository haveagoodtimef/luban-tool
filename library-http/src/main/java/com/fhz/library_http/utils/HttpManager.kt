package com.fhz.library_http.utils

import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

/**
 * 时间:2023/11/3
 * @author Mr.Feng
 * 简述: 网络请求管理类
 */
object HttpManager {
    fun createCache(): Cache {
        var file = File("/sdcard/Pictures")//缓存路径，不标准
        return Cache(file, 10 * 1024 * 1024)//10M
    }
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .client(getClient())
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())//自动解析
            .build()
    }

    private fun getClient(): OkHttpClient {
        return  OkHttpClient.Builder()
            //.retryOnConnectionFailure(true)//超时重连，默认1次，多次使用拦截器
//                .cache(createCache())//配置缓存路径
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
    }
}