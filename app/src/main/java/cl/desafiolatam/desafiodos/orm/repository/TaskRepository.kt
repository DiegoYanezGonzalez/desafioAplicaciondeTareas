package cl.desafiolatam.desafiodos.orm.repository

import androidx.lifecycle.LiveData
import cl.desafiolatam.desafiodos.orm.repository.dataBase.Task


//se comunica con la base de datos con el Dao
class TaskRepository (private val tTaskDao:ITaskDao){
//LiveData es de forma asincrona, pasa por segundo plano
    val AllTask: LiveData<List<Task>> = tTaskDao.getAllTask()

//corrutinas(suspend) para hacer que pase por segundo plata y no bloquee la ui
    suspend fun insertTask(task:Task) {
        tTaskDao.insertTask(task)
    }

    suspend fun update(task:Task){
        tTaskDao.updateTask(task)
    }

    suspend fun delete(task:Task){
        tTaskDao.deleteOneTask(task)
    }
}