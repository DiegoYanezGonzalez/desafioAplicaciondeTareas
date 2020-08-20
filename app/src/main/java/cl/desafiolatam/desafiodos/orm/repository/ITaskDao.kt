package cl.desafiolatam.desafiodos.orm.repository

import androidx.room.*
import cl.desafiolatam.desafiodos.orm.repository.dataBase.Task


//Interfaz que tiene los metodos para acceder a la base da datos
@Dao
interface ITaskDao{

    //traeria toodo los task y los ordenaria por el id ascendentemente
    @Query("SELECT * FROM task_tabla ORDER BY idTask ASC")
    suspend fun getAllTask():List<Task>

    //Insert , objeto que deberia ir a la base de datos task de la clase Task
    @Insert
    fun insertTask(task: Task)

    //Insert Masivo
    @Insert
    fun insertMultipleTask(list: List<Task>)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteOneTask(task: Task)

}