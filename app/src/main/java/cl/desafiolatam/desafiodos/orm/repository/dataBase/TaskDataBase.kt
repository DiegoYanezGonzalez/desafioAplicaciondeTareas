package cl.desafiolatam.desafiodos.orm.repository.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cl.desafiolatam.desafiodos.orm.repository.ITaskDao


//Service Base de datos
@Database(entities=arrayOf(Task::class)
,version=0,
exportSchema=false)
abstract class TaskDataBase:RoomDatabase() {

    //objeto que nos permite acceder a la base de datos con los dao de la interfaz
    abstract fun getTaskDao():ITaskDao


    companion object {

        @Volatile
        private var INSTANCE: TaskDataBase? = null


        fun getDatabase(context: Context): TaskDataBase {
            val tempInstance =
                INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance =
                    Room.databaseBuilder(context.applicationContext,
                        TaskDataBase::class.java,
                        "word database").build()
                INSTANCE = instance
                return instance
            }
        }

    }




}