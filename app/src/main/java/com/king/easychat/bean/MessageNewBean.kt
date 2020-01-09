package com.king.easychat.bean

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.Index
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


/**
 * @author: Zed
 * date: 2019/08/22.
 * description:
 */
@Entity(indices = [Index(value = ["groupId"], unique = true)])
@Parcelize
class MessageNewBean(val groupId: String, var groupName: String,var content: String?, var avatar: String? ,var say: String?) : Parcelable {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @Ignore var memberNum: Int = 0

    var zuozhe ="金牌小编"

    fun getMemberNumber(): String{
        return memberNum.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MessageNewBean

        if (groupId != other.groupId) return false

        return true
    }

    override fun hashCode(): Int {
        return groupId.hashCode()
    }




}
