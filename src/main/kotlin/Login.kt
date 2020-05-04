package nl.astraeus

import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.js.onClickFunction
import nl.astraeus.komp.HtmlBuilder
import nl.astraeus.komp.Komponent

class Login : Komponent() {

    override fun HtmlBuilder.render() {
        div {
            onClickFunction = {
                hidden = !hidden
                home.updateHome()
            }
            h1 {
                + "login"
            }
        }
    }
}