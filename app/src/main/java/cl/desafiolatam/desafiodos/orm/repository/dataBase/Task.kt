package cl.desafiolatam.desafiodos.orm.repository.dataBase

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

//Representacion de las tablas dentro de nuestra base de datos
@Entity(tableName= "task_tabla")
data class Task ( @PrimaryKey(autoGenerate=true)
@NotNull val idTask:Int,
val taks:String,
val creationDateTask:String,
val creationDate:String
,val finishedDate:String)