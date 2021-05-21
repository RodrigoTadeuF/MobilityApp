package br.com.empresa.mobileproject

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class SavingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_savings)

        var subwayTotalUsage : ProgressBar = findViewById(R.id.subwayUsageSavings)
        var subwayTotalSaving : ProgressBar = findViewById(R.id.subwaySaving)
        var bikeTotalUsage : ProgressBar = findViewById(R.id.bikeUsageSavings)
        var bikeTotalSaving : ProgressBar = findViewById(R.id.bikeSaving)

        var subwaySpent : ProgressBar = findViewById(R.id.subwaySpent)
        var subwaySpentSaving : ProgressBar = findViewById(R.id.subwaySpentSaving)
        var bikeSpent : ProgressBar = findViewById(R.id.bikeSpent)
        var bikeSpentSaving : ProgressBar = findViewById(R.id.bikeSpentSaving)

        var totalSpent : ProgressBar = findViewById(R.id.totalSpent)
        var totalSpentSaving : ProgressBar = findViewById(R.id.totalSpentSaving)



        var maxValue = 1000

        subwayTotalUsage.max = maxValue
        subwayTotalSaving.max = maxValue
        bikeTotalUsage.max = maxValue
        bikeTotalSaving.max = maxValue

        subwaySpent.max = maxValue
        subwaySpentSaving.max = maxValue
        bikeSpent.max = maxValue
        bikeSpentSaving.max = maxValue

        totalSpent.max = maxValue
        totalSpentSaving.max = maxValue

        subwayTotalUsage.setProgress(200)
        subwayTotalSaving.setProgress(100)
        bikeTotalUsage.setProgress(100)
        bikeTotalSaving.setProgress(200)

        subwaySpent.setProgress(maxValue)
        subwaySpentSaving.setProgress(maxValue)
        bikeSpent.setProgress(maxValue)
        bikeSpentSaving.setProgress(maxValue)

        totalSpent.setProgress(maxValue)
        totalSpentSaving.setProgress(maxValue)

        subwayTotalUsage.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        bikeTotalUsage.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        subwayTotalSaving.progressTintList = ColorStateList.valueOf(Color.rgb(255, 177, 195))
        bikeTotalSaving.progressTintList = ColorStateList.valueOf(Color.rgb(255, 177, 195))

        subwaySpent.progressTintList = ColorStateList.valueOf(Color.rgb(173, 251, 184))
        bikeSpent.progressTintList = ColorStateList.valueOf(Color.rgb(173, 251, 184))
        subwaySpentSaving.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))
        bikeSpentSaving.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))

        totalSpent.progressTintList = ColorStateList.valueOf(Color.rgb(173, 251, 184))
        totalSpentSaving.progressTintList = ColorStateList.valueOf(Color.rgb(80, 246, 102))

        subwayTotalUsage.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        subwayTotalSaving.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        bikeTotalUsage.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        bikeTotalSaving.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)

        subwaySpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        subwaySpentSaving.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        bikeSpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        bikeSpentSaving.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)

        totalSpent.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        totalSpentSaving.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)

    }
}