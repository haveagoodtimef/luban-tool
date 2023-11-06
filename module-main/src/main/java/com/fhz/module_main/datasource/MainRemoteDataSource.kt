package com.fhz.module_main.datasource

import com.fhz.library_http.utils.entity.BannerPage
import com.fhz.library_http.utils.entity.BaseResponse
import com.fhz.module_main.api.LuBanApi
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * 时间:2023/11/3
 * @author Mr.Feng
 * 简述: 远程数据源
 */
class MainRemoteDataSource @Inject constructor (val api: LuBanApi ) {


    suspend fun getBanners() : BaseResponse<BannerPage>{
        return api.getMainInfo()
    }


}