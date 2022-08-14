package developer.abdulahad.tabehapp

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerForContextMenu(btn_menu)
        textsalovat.text = Salovat.salovat
        number()
    }



    override fun onRestart() {
        super.onRestart()
//        ekrancha.background = Fonlar.fon as Drawable?
        textsalovat.text = Salovat.salovat
        btn_2_2.backgroundTintList = Fonlar.fonknopka as ColorStateList?
        btn_menu.backgroundTintList = Fonlar.fonknopka as ColorStateList?

        if (Fonlar.fontxt != null) {
            txt_ekran.setTextColor(Color.parseColor("${Fonlar.fontxt}"))
        }
    }

    fun setImage() {
        ekrancha.setImageResource(
            when (Fonlar.fon) {
                R.drawable.rasmqora -> R.drawable.rasmqora
                R.drawable.rasmsariq -> R.drawable.rasmsariq
                else -> R.drawable.rasmoq
            }
        )
    }

    override fun onResume() {
        super.onResume()
        setImage()
    }

    private fun number() {
        var a = 1
        var b = a++

        btn_2.setOnClickListener {
            when(Fonlar.vibrate){
                true ->{
                    var v = getSystemService(VIBRATOR_SERVICE) as Vibrator
                    v.vibrate(80)
                }
                else -> {}
            }
            txt_ekran.text = "${b++}"
        }
        btn_2_2.setOnClickListener {
            when(Fonlar.vibrate){
                true ->{
                    var v = getSystemService(VIBRATOR_SERVICE) as Vibrator
                    v.vibrate(80)
                }
                else -> {}
            }
            txt_ekran.text = "${b++}"
        }
        btn_1.setOnClickListener {
            txt_ekran.text = "0"
            number()
        }
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.my_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.settings -> {
                startActivity(Intent(this, MainActivity2::class.java))
            }
            R.id.malumot -> {
                startActivity(Intent(this, MainActivity3::class.java))
            }
        }
        return super.onContextItemSelected(item)
    }


}