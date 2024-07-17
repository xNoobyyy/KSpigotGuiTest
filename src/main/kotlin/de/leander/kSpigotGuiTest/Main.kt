package de.leander.kSpigotGuiTest

import net.axay.kspigot.commands.command
import net.axay.kspigot.commands.runs
import net.axay.kspigot.gui.openGUI
import net.axay.kspigot.main.KSpigot

class Main : KSpigot() {

    override fun startup() {
        command("guiA") {
            runs {
                this.player.openGUI(Guis.guiA)
            }
        }
        command("guiB") {
            runs {
                this.player.openGUI(Guis.guiB)
            }
        }
    }

}