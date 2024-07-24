package ru.vafeen.test_telegrambot

import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update


class ExampleBot : TelegramLongPollingBot() {
    private val messageListener = MessageListener()
    override fun getBotUsername(): String = BotInfo.USER_NAME

    override fun getBotToken(): String = API.key

    override fun onUpdateReceived(update: Update) {
        if (update.hasMessage())
            messageListener.processMessage(update.message) {
                execute(it)
            }
    }
}