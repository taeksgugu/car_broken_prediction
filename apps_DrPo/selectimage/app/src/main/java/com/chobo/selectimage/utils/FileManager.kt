package com.chobo.selectimage.utils

import android.app.Activity
import android.content.Context
import android.os.Environment
import com.chobo.selectimage.utils.Constant.PREFIX
import com.chobo.selectimage.utils.Constant.SUFFIX
import java.io.File

object FileManager {
    fun createImageFile(context: Context): File {
        val storageDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(PREFIX, SUFFIX, storageDir)
    }
}
