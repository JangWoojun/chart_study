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
            entries.add(Entry(1f, 150f))
            entries.add(Entry(2f, 155f))
            entries.add(Entry(3f, 140f))
            entries.add(Entry(4f, 145f))
            entries.add(Entry(5f, 150f))
            entries.add(Entry(6f, 152f))
            entries.add(Entry(7f, 148f))
            entries.add(Entry(8f, 147f))
            entries.add(Entry(9f, 149f))
            entries.add(Entry(10f, 150f))
            entries.add(Entry(11f, 153f))
            entries.add(Entry(12f, 155f))
            entries.add(Entry(13f, 154f))
            entries.add(Entry(14f, 156f))
            entries.add(Entry(15f, 158f))
            entries.add(Entry(16f, 157f))
            entries.add(Entry(17f, 159f))
            entries.add(Entry(18f, 160f))
            entries.add(Entry(19f, 161f))
            entries.add(Entry(20f, 162f))
            entries.add(Entry(21f, 160f))
            entries.add(Entry(22f, 158f))
            entries.add(Entry(23f, 159f))
            entries.add(Entry(24f, 157f))
            entries.add(Entry(25f, 156f))
            entries.add(Entry(26f, 155f))
            entries.add(Entry(27f, 154f))
            entries.add(Entry(28f, 153f))
            entries.add(Entry(29f, 152f))
            entries.add(Entry(30f, 150f))
            entries.add(Entry(1f, 150f))
            entries.add(Entry(2f, 155f))
            entries.add(Entry(3f, 140f))
            entries.add(Entry(4f, 145f))
            entries.add(Entry(5f, 150f))
            entries.add(Entry(6f, 152f))
            entries.add(Entry(7f, 148f))
            entries.add(Entry(8f, 147f))
            entries.add(Entry(9f, 149f))
            entries.add(Entry(10f, 150f))
            entries.add(Entry(11f, 153f))
            entries.add(Entry(12f, 155f))
            entries.add(Entry(13f, 154f))
            entries.add(Entry(14f, 156f))
            entries.add(Entry(15f, 158f))
            entries.add(Entry(16f, 157f))
            entries.add(Entry(17f, 159f))
            entries.add(Entry(18f, 160f))
            entries.add(Entry(19f, 161f))
            entries.add(Entry(20f, 162f))
            entries.add(Entry(21f, 160f))
            entries.add(Entry(22f, 158f))
            entries.add(Entry(23f, 159f))
            entries.add(Entry(24f, 157f))
            entries.add(Entry(25f, 156f))
            entries.add(Entry(26f, 155f))
            entries.add(Entry(27f, 154f))
            entries.add(Entry(28f, 153f))
            entries.add(Entry(29f, 152f))
            entries.add(Entry(30f, 150f))
            entries.add(Entry(31f, 150f))
            entries.add(Entry(32f, 155f))
            entries.add(Entry(33f, 140f))
            entries.add(Entry(34f, 145f))
            entries.add(Entry(35f, 150f))
            entries.add(Entry(36f, 152f))
            entries.add(Entry(37f, 148f))
            entries.add(Entry(38f, 147f))
            entries.add(Entry(39f, 149f))
            entries.add(Entry(40f, 150f))
            entries.add(Entry(41f, 153f))
            entries.add(Entry(42f, 155f))
            entries.add(Entry(43f, 154f))
            entries.add(Entry(44f, 156f))
            entries.add(Entry(45f, 158f))
            entries.add(Entry(46f, 157f))
            entries.add(Entry(47f, 159f))
            entries.add(Entry(48f, 160f))
            entries.add(Entry(49f, 161f))
            entries.add(Entry(50f, 162f))
            entries.add(Entry(51f, 160f))
            entries.add(Entry(52f, 158f))
            entries.add(Entry(53f, 159f))
            entries.add(Entry(54f, 157f))
            entries.add(Entry(55f, 156f))
            entries.add(Entry(56f, 155f))
            entries.add(Entry(57f, 154f))
            entries.add(Entry(58f, 153f))
            entries.add(Entry(59f, 152f))
            entries.add(Entry(60f, 150f))



            // 데이터 세트 생성
            val dataSet = LineDataSet(entries, "APPLE Stock Price")
            dataSet.color = resources.getColor(com.google.android.material.R.color.design_default_color_primary)
            dataSet.valueTextColor = resources.getColor(com.google.android.material.R.color.design_default_color_primary)

            // 라인 데이터 객체에 데이터 세트 추가
            val lineData = LineData(dataSet)
            lineChart.data = lineData

            // 차트 갱신
            lineChart.invalidate()
        }
    }
}