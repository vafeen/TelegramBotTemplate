package ru.vafeen.test_telegrambot

import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Message


class MessageListener {

    fun processMessage(message: Message, sendMessage: (SendMessage) -> Unit) {
        sendMessage(SendMessage(message.chatId.toString(), "Тестовое сообщение"))
    }
}