package com.fhz.module_main.repository

import com.fhz.library_http.utils.entity.BannerPage
import com.fhz.library_http.utils.entity.BaseResponse
import com.fhz.module_main.datasource.MainLocalDataSource
import com.fhz.module_main.datasource.MainRemoteDataSource
import javax.inject.Inject

/**
 * 时间:2023/11/3
 * @author Mr.Feng
 * 简述: TODO
 */
class MainRepository @Inject constructor(
    val mainRemoteDataSource: MainRemoteDataSource,
    val mainLocalDataSource: MainLocalDataSource) {


    suspend fun getBanners() : BaseResponse<BannerPage> {
        return mainRemoteDataSource.getBanners()
    }


}