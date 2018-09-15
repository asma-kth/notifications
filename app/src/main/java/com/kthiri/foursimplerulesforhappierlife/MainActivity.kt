package com.kthiri.foursimplerulesforhappierlife

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kthiri.foursimplerulesforhappierlife.R.id.image_smile
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_smile.setOnClickListener {
            var intent  = Intent(this,SmileActivity::class.java)
            startActivity(intent)


        }

        image_breath.setOnClickListener {
            var intent  = Intent(this,BreathActivity::class.java)
            startActivity(intent)
        }
        image_squat.setOnClickListener {
            var intent  = Intent(this,SquatActivity::class.java)
            startActivity(intent)
        }
        image_water.setOnClickListener {
            var intent  = Intent(this,WaterActivity::class.java)
            startActivity(intent)
        }
    }

}
