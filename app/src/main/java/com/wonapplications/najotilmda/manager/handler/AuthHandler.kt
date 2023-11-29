package com.wonapplications.najotilmda.manager.handler

interface AuthHandler {
    fun onSuccess(uid: String)
    fun onError(exception: Exception?)
}