package nl.astraeus

import kotlinx.html.div
import nl.astraeus.komp.HtmlBuilder
import nl.astraeus.komp.Komponent
import nl.astraeus.komp.include
import kotlin.browser.document

var hidden = false
var login = Login()
var home = Home()

class Main : Komponent() {

    override fun HtmlBuilder.render() {
        div {
            include(login)
            include(home)
        }
    }
}

fun main() {
    Komponent.create(document.body!!, Main())

    document.body!!.style.backgroundColor = "gray"
}