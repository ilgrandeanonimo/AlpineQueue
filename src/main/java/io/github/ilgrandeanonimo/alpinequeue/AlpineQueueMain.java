package io.github.ilgrandeanonimo.alpinequeue;

import javax.inject.Inject;

import org.slf4j.Logger;

import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

@Plugin(
    id = "alpinequeue",
    name = "AlpineQueue",
    version = "1.0.0-SNAPSHOT",
    url = "https://github.com/ilgrandeanonimo/alpinequeue",
    description = "Join queue plugin for Velocity",
    authors = {"IlGrandeAnonimo"}
)
public class AlpineQueueMain {
    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public AlpineQueueMain(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;

        logger.info("AlpineQueue Loaded");
    }
}