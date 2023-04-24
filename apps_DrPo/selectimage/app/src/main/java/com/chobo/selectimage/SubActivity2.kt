package com.chobo.selectimage

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import com.chobo.selectimage.utils.Constant.ALL_TYPE_IMAGE
import com.chobo.selectimage.utils.Constant.AUTHORITY
import com.chobo.selectimage.utils.FileManager
import com.chobo.selectimage.utils.PermissionManager
import java.io.File

class SubActivity2 : AppCompatActivity() {

    private lateinit var btnShowDialog3: Button

    private val image: ImageView by lazy {
        findViewById(R.id.image)
    }
    private val btnImageFromCamera: Button by lazy {
        findViewById(R.id.btn_capture_image)
    }
    private val btnImageFromGallery: Button by lazy {
        findViewById(R.id.btn_take_from_gallery)
    }
    private var tempImageUri: Uri? = null

    private lateinit var tempImageFile: File

    private val selectImageLauncher =
        registerForActivityResult(ActivityResultContracts.GetContent()) {
            image.setImageURI(it)
        }

    private val cameraLauncher =
        registerForActivityResult(ActivityResultContracts.TakePicture()) { success ->
            if (success)
                image.setImageURI(tempImageUri)
        }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)

        btnSelectCameraClicked()

        btnSelectGalleryClicked()

        settingButton()

        // btnShowDialog 버튼 변수 초기화
        btnShowDialog3 = findViewById(R.id.btnShowDialog3)

        // 다이얼로그에 표시할 목록 데이터
        val listOfItems = arrayOf("차량 외부 수리(긁힘 / 찌그러짐)", "기타 수리")

        // 다이얼로그 빌더 생성
        val builder = AlertDialog.Builder(this)

        // 목록 어댑터 생성
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfItems)

        // 다이얼로그에 목록 어댑터 설정
        builder.setAdapter(adapter) { _, which ->
            // 목록 항목이 클릭되었을 때의 동작 구현
            Toast.makeText(this, "선택한 항목: ${listOfItems[which]}", Toast.LENGTH_SHORT).show()

            // 선택한 항목 이름으로 버튼 텍스트 변경
            btnShowDialog3.text = listOfItems[which]
        }

        // 다이얼로그 생성
        val dialog = builder.create()

        // 다이얼로그 띄우기 버튼 클릭 리스너 설정
        btnShowDialog3.setOnClickListener {
            dialog.show()
        }

    }

    private fun btnSelectGalleryClicked() {
        btnImageFromGallery.setOnClickListener {
            PermissionManager.requestPermission(this) {
                selectImageLauncher.launch(ALL_TYPE_IMAGE)
            }
        }
    }

    private fun btnSelectCameraClicked() {
        btnImageFromCamera.setOnClickListener {
            PermissionManager.requestPermission(this) {
                tempImageUri = FileProvider.getUriForFile(this, AUTHORITY, FileManager.createImageFile(this).also { tempImageFile = it })
                cameraLauncher.launch(tempImageUri)
            }
        }
    }

    fun settingButton() {
        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            //subactivity3 로 이동.
            //intent : 의지, 지황, 의도
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }

}