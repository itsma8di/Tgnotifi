package com.itsma8di.tgnotifiv2.utils

import org.bukkit.plugin.PluginLogger
import org.bukkit.plugin.java.JavaPlugin
import java.util.function.Supplier


open class Logger(private val plugin: JavaPlugin, private val isProd: Boolean = false) : PluginLogger(plugin){
    companion object {

        protected const val LOG_PREFIX = "[DEBUG]"
    }

    override fun info(msg: String?) {

        if(!isProd)
            super.info("$LOG_PREFIX $msg")

    }

    override fun info(msgSupplier: Supplier<String>?) {
        if(!isProd)
            super.info(msgSupplier)
    }
    override fun fine(msg: String?) {
        if(!isProd)
            super.fine("$LOG_PREFIX $msg")
    }


    override fun fine(msgSupplier: Supplier<String>?) {
        if(!isProd)
            super.fine(msgSupplier)
    }
    override fun finest(msg: String?) {
        if(!isProd)
            super.finest("$LOG_PREFIX $msg")
    }

    override fun finest(msgSupplier: Supplier<String>?) {
        if(!isProd)
            super.finest(msgSupplier)
    }
    override fun finer(msg: String?) {
        if(!isProd)
            super.finer("$LOG_PREFIX $msg")
    }


    override fun finer(msgSupplier: Supplier<String>?) {
        if(!isProd)
            super.finer(msgSupplier)
    }
    override fun severe(msg: String?) {
        if(!isProd)
            super.severe("$LOG_PREFIX $msg")
    }


    override fun severe(msgSupplier: Supplier<String>?) {
        if(!isProd)
            super.severe(msgSupplier)
    }
    override fun warning(msg: String?) {
        if(!isProd)
            super.warning("$LOG_PREFIX $msg")
    }


    override fun warning(msgSupplier: Supplier<String>?) {
        if(!isProd)
            super.warning(msgSupplier)
    }
    override fun config(msg: String?) {
        if(!isProd)
            super.config("$LOG_PREFIX $msg")
    }


    override fun config(msgSupplier: Supplier<String>?) {
        if(!isProd)
            super.config(msgSupplier)
    }
}