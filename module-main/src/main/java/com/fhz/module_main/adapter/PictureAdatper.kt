package com.fhz.module_main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.fhz.module_main.databinding.MainRecycleViewPictureAdapterLayoutBinding
import com.fhz.library_http.utils.entity.Picture

/**
 * 时间:2023/11/3
 * @author Mr.Feng
 * 简述: TODO
 */
class PictureAdatper : BaseQuickAdapter<Picture, PictureAdatper.VH>() {

    // 自定义ViewHolder类
    class VH(
        parent: ViewGroup,
        val binding:MainRecycleViewPictureAdapterLayoutBinding = MainRecycleViewPictureAdapterLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ),
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): VH {
        // 返回一个 ViewHolder
        return VH(parent)
    }

    override fun onBindViewHolder(holder: VH, position: Int, item: Picture?) {
        // 设置item数据
//        holder.binding.pictureRecycleViewIcon
        holder.binding.pictureRecycleViewTitle.text = item?.title
    }
}