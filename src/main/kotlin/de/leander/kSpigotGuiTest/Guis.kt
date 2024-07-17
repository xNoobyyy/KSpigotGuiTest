package de.leander.kSpigotGuiTest

import net.axay.kspigot.chat.literalText
import net.axay.kspigot.gui.GUIType
import net.axay.kspigot.gui.Slots
import net.axay.kspigot.gui.kSpigotGUI
import net.axay.kspigot.items.itemStack
import net.axay.kspigot.items.meta
import org.bukkit.Material

object Guis {

    val guiA = kSpigotGUI(GUIType.THREE_BY_NINE) {
        page(1) {
            changeGUI(
                Slots.RowTwoSlotFour,
                itemStack(Material.ARROW) { meta { displayName(literalText("Switch to GUI B")) } },
                { guiB },
                null,
                null
            )
            button(Slots.RowTwoSlotSix, itemStack(Material.DIAMOND) { meta { displayName(literalText("GUI A")) } }) {
                it.player.sendMessage("GUI A Button Clicked!")
            }
        }
    }

    val guiB = kSpigotGUI(GUIType.THREE_BY_NINE) {
        page(1) {
            button(Slots.RowTwoSlotFive, itemStack(Material.DIAMOND) { meta { displayName(literalText("GUI B")) } }) {
                it.player.sendMessage("GUI B Button Clicked!")
            }
        }
    }

}