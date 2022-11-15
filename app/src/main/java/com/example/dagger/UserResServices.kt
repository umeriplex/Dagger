package com.example.dagger

import javax.inject.Inject

class UserResServices @Inject constructor (
    private val saveUser: SaveUser,
    private val notiService: NotiService
    )
{

    fun resUser(email: String, password: String) {
        saveUser.saveUser(email, password)
        notiService.sendNow("john", "Alex", "Bye Bye")
    }
}