package com.example.dagger

import android.util.Log
import javax.inject.Inject

interface NotiService{
    fun sendNow(to: String, from: String,body: String?)
}

class SentEmail @Inject constructor() : NotiService {
    fun sentEmail(to: String, from: String, body: String?) {
        Log.d("Email", "Email Successfully Sent")
    }

    override fun sendNow(to: String, from: String, body: String?) {
        TODO("Not yet implemented")
    }
}
class MessageSend : NotiService{
    override fun sendNow(to: String, from: String, body: String?) {
        TODO("Not yet implemented")
    }

}