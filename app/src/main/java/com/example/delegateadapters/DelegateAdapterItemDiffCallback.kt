package com.example.delegateadapters

import androidx.recyclerview.widget.DiffUtil
import com.example.delegateadapters.models.DelegateAdapterItem

internal class DelegateAdapterItemDiffCallback : DiffUtil.ItemCallback<DelegateAdapterItem>() {

    override fun areItemsTheSame(
        oldItem: DelegateAdapterItem,
        newItem: DelegateAdapterItem
    ) = oldItem::class == newItem::class && oldItem.id() == newItem.id()

    override fun areContentsTheSame(
        oldItem: DelegateAdapterItem,
        newItem: DelegateAdapterItem
    ) = oldItem.content() == newItem.content()

}