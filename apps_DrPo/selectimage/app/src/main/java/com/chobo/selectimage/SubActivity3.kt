package com.chobo.selectimage

import RepairAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.chobo.selectimage.databinding.ActivitySub3Binding
import com.chobo.selectimage.databinding.RepairRecyclerListBinding


class SubActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivitySub3Binding
    private lateinit var binding1:RepairRecyclerListBinding
    private val repairData = arrayListOf<RepairData>()      // 아이템 배열
    private val repairAdapter = RepairAdapter(repairData)

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub3Binding.inflate(layoutInflater)
        binding1 = RepairRecyclerListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        settingButton()

        // 레이아웃 매니저와 어댑터 설정
        binding.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvList.adapter = repairAdapter


        // 아이템 추가
        repairData.add(RepairData("AI 견적서", "1,869,646원", ""))
        repairData.add(RepairData("기아자동차(주)포항서비스센터", "1,907,653원", "2.3km"))
        repairData.add(RepairData("터미널자동차정비", "1,924,977원", "2.4km"))
        repairData.add(RepairData("르노삼성자동차포항정비사업소(주)", "1,897,698원", "3.1km"))
        repairData.add(RepairData("아성자동차정비공장", "1,897,643원", "4km"))
        repairData.add(RepairData("덕우종합정비", "1,887,683원", "4.6km"))


        // 리스트가 변경됨을 어댑터에 알림
        repairAdapter.notifyDataSetChanged()
    }

    private fun settingButton() {
        binding1.button3.setOnClickListener {
            //subactivity4 로 이동.
            //intent : 의지, 지황, 의도
            val intent = Intent(this, SubActivity4::class.java)
            startActivity(intent)
        }
    }
}

