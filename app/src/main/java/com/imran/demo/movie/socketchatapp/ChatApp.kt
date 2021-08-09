package com.imran.demo.movie.socketchatapp

import android.app.Application
import io.realm.Realm
import io.socket.client.IO
import io.socket.client.Socket

/**
 * Created by Md. Imran Chowdhury on 8/7/2021.
 */
class ChatApp: Application() {

    companion object {
        lateinit var mSocket: Socket
        lateinit var realm: Realm
    }

    private val CHAT_URL = "https://socket.interspeed.agency"

    override fun onCreate() {
        super.onCreate()
        mSocket = IO.socket(CHAT_URL)
        Realm.init(this)
        realm = Realm.getDefaultInstance()
    }

}