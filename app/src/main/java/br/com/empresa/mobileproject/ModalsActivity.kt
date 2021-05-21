package br.com.empresa.mobileproject

import android.animation.ObjectAnimator
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class ModalsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modals)

        var carProgressBar: ProgressBar = findViewById(R.id.carUsageModals)
        var subwayProgressBar: ProgressBar = findViewById(R.id.subwayUsageModals)
        var bikeProgressBar: ProgressBar = findViewById(R.id.bikeUsageModals)
        var busProgressBar: ProgressBar = findViewById(R.id.busUsageModals)


        carProgressBar.max = 1000
        subwayProgressBar.max = 1000
        bikeProgressBar.max = 1000
        busProgressBar.max = 1000

        carProgressBar.setProgress(600)
        subwayProgressBar.setProgress(200)
        bikeProgressBar.setProgress(100)
        busProgressBar.setProgress(100)


        carProgressBar.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        subwayProgressBar.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        bikeProgressBar.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))
        busProgressBar.progressTintList = ColorStateList.valueOf(Color.rgb(255, 41, 91))

        carProgressBar.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        subwayProgressBar.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        bikeProgressBar.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)
        busProgressBar.progressBackgroundTintList = ColorStateList.valueOf(Color.WHITE)

    }
}