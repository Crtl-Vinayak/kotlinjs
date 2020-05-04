package nl.astraeus

import kotlinx.html.style
import kotlinx.html.div
import kotlinx.html.h1
import nl.astraeus.komp.HtmlBuilder
import nl.astraeus.komp.Komponent

class Home : Komponent() {

    fun updateHome() {
        console.log("click update home please")
        update()
    }

    override fun HtmlBuilder.render() {
        div {
            if (hidden) {
                style = "display: none;"
            } else {
                style = "display: block;"
            }
            h1 {
                + "Home"
            }
        }
    }
}