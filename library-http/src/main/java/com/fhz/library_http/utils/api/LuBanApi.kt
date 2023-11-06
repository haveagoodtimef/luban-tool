package com.fhz.module_main.api

import com.fhz.library_http.utils.entity.BannerPage
import com.fhz.library_http.utils.entity.BaseResponse
import retrofit2.http.GET

/**
 * 时间:2023/11/3
 * @author Mr.Feng
 * 简述: 后台的接口
 */
interface LuBanApi {
    @GET("/banner/select")
    suspend fun getMainInfo() : BaseResponse<BannerPage>

}