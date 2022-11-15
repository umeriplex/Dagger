package com.example.dagger

import dagger.Component

@Component
interface UserResComp {
//    fun getUserResService() : UserResServices
//    fun getEmailSentService() : SentEmail

    fun inject(mainActivity: MainActivity)
}