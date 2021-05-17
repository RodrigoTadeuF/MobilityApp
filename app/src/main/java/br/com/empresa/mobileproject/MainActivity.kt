package br.com.empresa.mobileproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnModals:Button = findViewById(R.id.modalsButton)
        var btnUsage:Button = findViewById(R.id.usageButton)
        var btnSavings:Button = findViewById(R.id.savingsButton)

        btnModals.setOnClickListener(View.OnClickListener {
            var intent= Intent(this,ModalsActivity::class.java)
            startActivity(intent)
        })

        btnUsage.setOnClickListener(View.OnClickListener {
            var intent= Intent(this,UsageActivity::class.java)
            startActivity(intent)
        })

        btnSavings.setOnClickListener(View.OnClickListener {
            var intent= Intent(this,SavingsActivity::class.java)
            startActivity(intent)
        })




    }
}