package com.hack.service;

import com.hack.model.AppDto;
import com.hack.model.PermissionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    public List<AppDto> getApp() {
        return List.of(
                new AppDto("TikTok", "TikTok", "https://cdn.worldvectorlogo.com/logos/tiktok-logo-2--1.svg", 2, new PermissionDto()),
                new AppDto("VK", "VK", "https://worldvectorlogo.com/ru/download/vk-1.svg", 1, new PermissionDto()),
                new AppDto("Instagram", "Instagram", "https://worldvectorlogo.com/ru/download/instagram-2-1.svg", 1, new PermissionDto()),
                new AppDto("Telegram", "Telegram", "https://worldvectorlogo.com/ru/download/telegram.svg", 0, new PermissionDto()));
    }
}
