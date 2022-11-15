package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    private lateinit var userResServices : UserResServices

    @Inject
    private lateinit var emailService : SentEmail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserResComp.builder().build()

//        val userResServices = component.inject(this)
//        val emailService = component.getEmailSentService()

        component.inject(this)

        userResServices.resUser("alex123@gmail.com","alex123")
        emailService.sentEmail("tum","mai","nothing")


    }
}