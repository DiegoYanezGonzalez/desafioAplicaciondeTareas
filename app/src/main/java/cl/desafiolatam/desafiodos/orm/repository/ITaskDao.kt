package cl.desafiolatam.desafiodos.orm.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import cl.desafiolatam.desafiodos.orm.repository.dataBase.Task


//Interfaz que tiene los metodos para acceder a la base da datos
@Dao
interface ITaskDao{

    //traeria toodo los task y los ordenaria por el id ascendentemente
    @Query("SELECT * FROM task_tabla ORDER BY idTask ASC")
    fun getAllTask():LiveData<List<Task>>

    //Insert , objeto que deberia ir a la base de datos task de la clase Task
    @Insert
    suspend fun insertTask(task: Task)

    //Insert Masivo
    @Insert
    suspend fun insertMultipleTask(list: List<Task>)

    @Update
    suspend fun updateTask(task: Task)

    @Delete
    suspend fun deleteOneTask(task: Task)

}