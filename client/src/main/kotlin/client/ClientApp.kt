package client


import client.Managers.CommandFinder
import general.AppIO.InputData

/**
 * @author Sukhareva Sofya
 */

fun main(){

    val inputData = InputData()
    val commandFinder = CommandFinder(inputData)
    val client = Client(commandFinder,  7001, "savikin.ru");
    client.run()

}