package com.kthiri.foursimplerulesforhappierlife

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kthiri.foursimplerulesforhappierlife.R.id.image_smile
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    private var mNotificationTime = Calendar.getInstance().timeInMillis + 5000
   // private var nof2= Calendar.getInstance().timeInMillis+10000
    //private var nof3= Calendar.getInstance().timeInMillis+7200000
    //private var nof4= Calendar.getInstance().timeInMillis+10800000

     //Set after 5 seconds from the current time.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





            NotificationUtils().setNotification(mNotificationTime, this@MainActivity)


          //  NotificationUtils().setNotification(nof2, this@MainActivity)
                    //NotificationUtils().setNotification(nof3, this@MainActivity)
            //NotificationUtils().setNotification(nof4, this@MainActivity)







        image_smile.setOnClickListener {
            var intent = Intent(this, SmileActivity::class.java)
            startActivity(intent)

        }

        image_breath.setOnClickListener {
            var intent = Intent(this, BreathActivity::class.java)
            startActivity(intent)
        }
        image_squat.setOnClickListener {
            var intent = Intent(this, SquatActivity::class.java)
            startActivity(intent)
        }
        image_water.setOnClickListener {
            var intent = Intent(this, WaterActivity::class.java)
            startActivity(intent)
        }
    }
}


