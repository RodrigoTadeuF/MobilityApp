package br.com.empresa.mobileproject

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class UsageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usage)

        var carUsage : ProgressBar = findViewById(R.id.carUsage)
        var subwayUsage : ProgressBar = findViewById(R.id.subwayUsage)
        var bikeUsage : ProgressBar = findViewById(R.id.bikeUsage)
        var busUsage : ProgressBar = findViewById(R.id.busUsage)

        var carSpent : ProgressBar = findViewById(R.id.carSpent)
        var subwaySpent : ProgressBar = findViewById(R.id.subwaySpent)
        var bikeSpent : ProgressBar = findViewById(R.id.bikeSpent)
        var busSpent : ProgressBar = findViewById(R.id.busSpent)

        var totalUsage : ProgressBar = findViewById(R.id.totalUsage)
        var totalSpent : ProgressBar = findViewById(R.id.totalSpent)

        var maxValue = 1000

        carUsage.max = maxValue
        subwayUsage.max = maxValue
        bikeUsage.max = maxValue
        busUsage.max = maxValue

        carSpent.max = maxValue
        subwaySpent.max = maxValue
        bikeSpent.max = maxValue
        busSpent.max = maxValue

        totalUsage.max = maxValue
        totalSpent.max = maxValue

        carUsage.setProgress(600)
        subwayUsage.setProgress(200)
        bikeUsage.setProgress(100)
        busUsage.setProgress(100)

        carSpent.setProgress(maxValue)
        subwaySpent.setProgress(maxValue)
        bikeSpent.setProgress(maxValue)
        busSpent.setProgress(maxValue)

        totalUsage.setProgress(maxValue)
        totalSpent.setProgress(maxValue)

        carUsage.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        subwayUsage.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        bikeUsage.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        busUsage.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))

        carSpent.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))
        subwaySpent.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))
        bikeSpent.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))
        busSpent.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))

        totalUsage.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        totalSpent.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))

        carUsage.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        subwayUsage.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        bikeUsage.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        busUsage.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)

        carSpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        subwaySpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        bikeSpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        busSpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)

        totalUsage.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        totalSpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)

    }
}