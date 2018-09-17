package com.kthiri.foursimplerulesforhappierlife

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.RemoteMessage
import kotlin.math.log


class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        super.onTokenRefresh()
        sendTokenToServer()
    }
private fun sendTokenToServer(){
    Log.d("TOKEN",FirebaseInstanceId.getInstance().token)
}
}
