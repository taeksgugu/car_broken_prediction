package com.chobo.selectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class SubActivity : AppCompatActivity() {

    private lateinit var btnShowDialog: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        settingButton()

        // btnShowDialog 버튼 변수 초기화
        btnShowDialog = findViewById(R.id.btnShowDialog)


        // 다이얼로그에 표시할 목록 데이터
        val listOfItems = arrayOf("BENZ", "CHIRYSLER", "NISSAN", "기아", "한국GM", "HONDA", "현대", "AUDI", "쌍용", "VOLVO", "TOYOTA", "VOLKSWAGEN", "MASERATI", "PEUGEOT", "LANDROVER", "PORSCHE",
            "르노삼성", "LEXUS", "JAGUAR", "JEEP", "CADILAC", "FIAT", "BENTLEY", "DODGE", "MINI", "SUZUKI", "MITSUBISHI", "LINCOLN", "BAIC(북기은상)",
            "SUBARU", "GM", "MAYBACH", "Chevrolet", "INFINITI", "GMC", "ASTON", "MAZDA", "FORD", "TESLA", "BMW")

        // 다이얼로그 빌더 생성
        val builder = AlertDialog.Builder(this)

        // 목록 어댑터 생성
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfItems)

        // 다이얼로그에 목록 어댑터 설정
        builder.setAdapter(adapter) { _, which ->
            // 목록 항목이 클릭되었을 때의 동작 구현
            Toast.makeText(this, "선택한 항목: ${listOfItems[which]}", Toast.LENGTH_SHORT).show()

            // 선택한 항목 이름으로 버튼 텍스트 변경
            btnShowDialog.text = listOfItems[which]
        }

        // 다이얼로그 생성
        val dialog = builder.create()

        // 다이얼로그 띄우기 버튼 클릭 리스너 설정
        btnShowDialog.setOnClickListener {
            dialog.show()
        }
    }

    fun settingButton() {
        val quotebutton = findViewById<Button>(R.id.quoteButton)
        quotebutton.setOnClickListener {
            //subactivity2 로 이동.
            //intent : 의지, 지황, 의도
            val intent = Intent(this, SubActivity2::class.java)
            startActivity(intent)
        }
    }
}
