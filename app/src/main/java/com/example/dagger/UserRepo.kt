package com.example.dagger

import android.util.Log
import javax.inject.Inject

interface SaveUser{
    fun saveUser(email: String, password: String)
}

class SqlUserRepo @Inject constructor() : SaveUser {
    override fun saveUser(email: String, password: String) {
        Log.d("Sign up", "User Successfully Saved in SQL!!")
    }
}

class FirebaseUserRepo : SaveUser{
    override fun saveUser(email: String, password: String) {
        Log.d("Sign up", "User Successfully Saved in Firebase!!")
    }

}