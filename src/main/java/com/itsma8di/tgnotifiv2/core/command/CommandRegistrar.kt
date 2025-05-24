package com.itsma8di.tgnotifiv2.core.command

import org.bukkit.command.CommandExecutor
import org.bukkit.command.TabCompleter
import org.bukkit.plugin.java.JavaPlugin

class CommandRegistrar (private val plugin: JavaPlugin){
    fun register(command: String, executor: CommandExecutor) {
        plugin.getCommand(command)?.setExecutor(executor)
    }
    fun register(command: String, executor: CommandExecutor,completer: TabCompleter) {
        plugin.getCommand(command)?.apply{
            setExecutor(executor)
            tabCompleter = completer
        }
    }

    fun unregister(command: String) {
        plugin.getCommand(command)?.apply {
            setExecutor(null)
            tabCompleter = null
        }
    }
}