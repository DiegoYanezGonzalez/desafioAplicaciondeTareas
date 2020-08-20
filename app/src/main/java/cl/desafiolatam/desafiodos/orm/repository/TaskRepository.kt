package cl.desafiolatam.desafiodos.orm.repository

import cl.desafiolatam.desafiodos.orm.repository.dataBase.Task

class TaskRepository (private val tTaskDao:ITaskDao){

    val mAllTaks: List<Task> = tTaskDao.getAllTask()


    suspend fun insertTask(task:Task) {
        tTaskDao.insertTask(task)
    }
}