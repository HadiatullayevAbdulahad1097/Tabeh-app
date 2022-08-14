package developer.abdulahad.tabehapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Myshared.init(this)

        salovat.addTextChangedListener {
            Salovat.salovat = it.toString()
        }

        clear_sal.setOnClickListener {
            if (Salovat.salovat.isNotEmpty()){
                Salovat.salovat = ""
            }
        }

        txt_oq.setOnClickListener {
            Fonlar.fontxt = "#C3C3C3"
        }
        txt_qora.setOnClickListener {
            Fonlar.fontxt = "#000000"
        }
        txt_sariq.setOnClickListener {
            Fonlar.fontxt = "#FFD600"
        }

        img_oq.setOnClickListener {
            Fonlar.fon = R.drawable.rasmoq
        }
        img_qora.setOnClickListener {
            Fonlar.fon = R.drawable.rasmqora
        }
        img_sariq.setOnClickListener {
            Fonlar.fon = R.drawable.rasmsariq
        }
        knopka_oq.setOnClickListener {
            Fonlar.fonknopka = knopka_oq.backgroundTintList
        }
        knopka_qora.setOnClickListener {
            Fonlar.fonknopka = knopka_qora.backgroundTintList
        }
        knopka_sariq.setOnClickListener {
            Fonlar.fonknopka = knopka_sariq.backgroundTintList
        }

        Switch.setOnClickListener {
            if (Switch.isChecked) {
                Fonlar.vibrate = true
                Myshared.tru = Fonlar.vibrate
            }else{
                Fonlar.vibrate = false
                Myshared.tru = Fonlar.vibrate
            }
        }

    }
}
