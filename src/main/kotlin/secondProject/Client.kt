package secondProject

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class Client(val id: Int,
             val name: String,
             var number: Int,
             var adress: String) {

    val commandeHistory = mutableListOf<Commande>()

    // Methods
    // 1 - Identification du client
    // 2 - HistoriqueDeLaCommande
    // 3 - RetournerLaCommande
    // 4 -

    fun afficherClient() : String = """
        clientId: $id   
        clientName: $name
        clientNumber: $number
        clientAdress: $adress
    """.trimIndent()


    fun clientHistory() {
        val tempsDeFaireLaCommande: LocalDate? = LocalDate.now()
        println("Les commandes")
        for (commande in commandeHistory) {
            println(commande)
            println(tempsDeFaireLaCommande)
        }
    }

    fun retournerLaCommande() {

        val tempsDeFaireLaCommande: LocalDate? = LocalDate.now()
        val dateLimiteDeLaCommande: LocalDateTime = LocalDateTime.of(2023,
            10,
            1,
            11,
            30,
            0,
            0)

        while (dateLimiteDeLaCommande != LocalDateTime.now()) {
            println(dateLimiteDeLaCommande.minusMinutes(2))
        }


        val tempsLimite: LocalDate? = LocalDate.ofYearDay(2023, 2)
        val DeuxJours: LocalDate? = LocalDate.ofYearDay(2023, 2)

        if (DeuxJours != null) {
            if(DeuxJours < tempsLimite) {
                println("Vous pouvez annuler vos commandes")
            } else {
                println("Vous ne pouvez plus annuler vos commandes")
            }
        }
    }
}