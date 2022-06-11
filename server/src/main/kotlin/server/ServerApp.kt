package server

import general.AppIO.InputData
import general.commands.*
import main.resources.commands.*
import server.Database.PostgresDao
import server.Managers.CollectionManager
import server.Managers.CommandManager
import server.Managers.DatabaseConnection
import server.serverWork.Server
import java.io.FileReader
import java.util.Properties


fun main(){

    /**
     * Главная функция, которая вызывает Server
     */

    val properties = Properties()
    val env = "lab7"
    val file = FileReader(System.getenv(env))
    properties.load(file)
    val inputData = InputData()
    val databaseConnection = DatabaseConnection(properties);
    val postgresDao = PostgresDao(databaseConnection)
    val collectionManager = CollectionManager(inputData, postgresDao)

    val commandManager = CommandManager(
        HelpCommand(),
        AddCommand(),
        ClearCommand(),
        CountCommand(),
        HistoryCommand(),
        InfoCommand(),
        PrintFieldCommand(),
        RemoveAllCommand(),
        RemoveByID(),
        RemoveFirstCommand(),
        RemoveGreaterCommand(),
        ShowCommand(),
        UpdateIDCommand(),
        ExitCommand(),
        collectionManager
    )
  val server =  Server(commandManager, 7001)
    server.run()




}



