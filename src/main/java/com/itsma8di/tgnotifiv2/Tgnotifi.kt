package com.itsma8di.tgnotifiv2

import com.itsma8di.tgnotifiv2.core.command.CommandRegistrar
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger

@Suppress("unused")
class Tgnotifi : JavaPlugin() {
    ///////////////////////////////
    val debug: Logger
        get() = com.itsma8di.tgnotifiv2.utils.Logger(this,IS_PRODUCTION)
    ///////////////////////////////

    private val registrar: CommandRegistrar = CommandRegistrar(this)

    companion object {
        ///////////////////////////////
        private const val IS_PRODUCTION = false;
        ///////////////////////////////

        lateinit var instance: Tgnotifi
    }
    override fun onEnable() {
        // Plugin startup logic

        instance = this;

        debug.info("TGNOTIFI has been enabled")


    }

    override fun onDisable() {
        // Plugin shutdown logic
        debug.info("TGNOTIFI has been disabled")
    }
}
