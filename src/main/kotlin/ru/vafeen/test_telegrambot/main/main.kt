package ru.vafeen.test_telegrambot.main

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession
import ru.vafeen.test_telegrambot.ExampleBot

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    TelegramBotsApi(DefaultBotSession::class.java).registerBot(ExampleBot())
    while (true) {
        SpringApplication.run(Application::class.java, *args)
    }
}