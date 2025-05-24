package com.itsma8di.tgnotifiv2.core.data

import retrofit2.http.GET
import retrofit2.http.Query

interface TelegramApi {
    @GET("sendMessage")
    suspend fun sendMessage(
        @Query("chat_id") chatId: String,
        @Query("text") text: String,
        @Query("parse_mode") parseMode: String = "Markdown"
    )
}