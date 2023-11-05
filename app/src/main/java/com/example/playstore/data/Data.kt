package com.example.playstore.data

import com.example.playstore.model.App

class Data {
    fun loadSocialApp(): List<App> {
        return listOf(
            App("Reddit", 0, 4.1f, false),
            App("Reuters News", 0, 4.6f, false),
            App("The New York Times", 0, 4.6f, false),
            App("Quora", 0, 3.8f, false),
            App("Flickr", 0, 3.7f, false),
            App("Meetup", 0, 3.6f, true),
            App("VK", 0, 3.5f, false),
            App("Telegram", 0, 3.4f, false),
            App("WhatsApp", 0, 3.3f, false),
            App("Messenger", 0, 3.2f, true),
            App("Skype", 0, 3.1f, false),
            App("Viber", 0, 3.0f, false),
            App("WeChat", 0, 2.9f, false),
            App("LINE", 0, 2.8f, false),
            App("Tango", 0, 2.5f, false),
        )
    }

    fun loadFlightApp(): List<App> {
        return listOf(
            App("Traveloka", 0, 4.7f, false),
            App("TripIt", 0, 4.6f, false),
            App("Qatar Airways", 0, 4.7f, false),
        )
    }

    fun loadPopularApp(): List<App> {
        return listOf(
            App("Tiktok", 0, 4.4f, false),
            App("Facebook", 0, 4.6f, false),
            App("Youtube", 0, 4.8f, false),
            App("Instagram", 0, 4.7f, false),
            App("Twitter", 0, 4.5f, false),
        )
    }

    fun loadGame(): List<App> {
        return listOf(
            App("PUBG Mobile", 0, 4.4f, false),
            App("Mobile Legends", 0, 4.6f, false),
            App("Free Fire", 0, 4.8f, false),
            App("Call of Duty", 0, 4.7f, false),
            App("Clash of Clans", 0, 4.5f, false),
        )
    }
}