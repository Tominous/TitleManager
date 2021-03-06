package io.puharesource.mc.titlemanager.internal.functionality.commands

import io.puharesource.mc.titlemanager.internal.pluginInstance
import io.puharesource.mc.titlemanager.internal.web.UpdateChecker
import org.bukkit.ChatColor

object CommandVersion : TMSubCommand("version",
        cmdExecutor = { cmd, sender, args, parameters -> commandExecutor(cmd, sender, args, parameters) {
            sendConfigMessage("version", "version" to pluginInstance.description.version)

            if (UpdateChecker.isUpdateAvailable()) {
                sendMessage("${ChatColor.YELLOW}An update is available version: ${UpdateChecker.getLatestVersion()}")
            }
        }})