package developer.abdulahad.tabehapp

import android.content.Context
import android.content.SharedPreferences

object Myshared {
    private const val NAME = "my_catch_file"
        private const val MODE = Context.MODE_PRIVATE
        private lateinit var sharedPreferences: SharedPreferences

        fun init(context: Context){
            sharedPreferences = context.getSharedPreferences(NAME , MODE)
        }

        private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit){
            val editor = edit()
            operation(editor)
            editor.apply()
        }

        var name:String?
        get() = sharedPreferences.getString("key","")
        set(value) = sharedPreferences.edit {
            it.putString("key", value)
        }
            var tru:Boolean?
        get () = sharedPreferences.getBoolean("key", true)
        set(value) = sharedPreferences.edit{
            if (value != null) {
                it.putBoolean("key", value)
            }
        }
}
