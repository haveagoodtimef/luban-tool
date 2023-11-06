package com.fhz.library_http.utils.di

import com.fhz.library_http.utils.HttpManager
import com.fhz.module_main.api.LuBanApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

/**
 * 时间:2023/11/4
 * @author Mr.Feng
 * 简述: 网络的依赖注入,通过不同的提供者 ,实现不同的api接口
 */
@Module
@InstallIn(SingletonComponent::class)
class HttpModule {

    @Provides
    @Singleton
    fun providerHttpManager() : Retrofit{
        return HttpManager.getRetrofit()
    }

    @Provides
    @Singleton
    fun providerluBanApi(retrofit:Retrofit) : LuBanApi{
        return retrofit.create(LuBanApi::class.java)
    }

}