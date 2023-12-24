package com.woojun.chartstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.woojun.chartstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val entries = ArrayList<Entry>()
            // 여기에 데이터 포인트를 추가하세요. 예시 데이터를 사용하였습니다.
            for (i in 1..60) {
                entries.add(Entry(i.toFloat(), (100 + Math.random() * 50).toFloat())) // 예시 데이터
            }

            // 데이터 세트 생성
            val dataSet = LineDataSet(entries, "APPLE Stock Price")
            dataSet.color = resources.getColor(com.google.android.material.R.color.design_default_color_primary)
            dataSet.valueTextColor = resources.getColor(com.google.android.material.R.color.design_default_color_primary_dark)

            // 라인 데이터 객체에 데이터 세트 추가
            val lineData = LineData(dataSet)
            lineChart.data = lineData

            // 스크롤 가능하게 설정
            lineChart.setVisibleXRangeMaximum(10f) // 한 번에 보여질 최대 데이터 포인트 수
            lineChart.moveViewToX(0f) // 초기 스크롤 위치 설정

            // 차트 갱신
            lineChart.invalidate()
        }
    }
}
