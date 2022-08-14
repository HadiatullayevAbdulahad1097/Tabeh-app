package developer.abdulahad.tabehapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var anim = AnimationUtils.loadAnimation(this, R.anim.alpha2)
        text.startAnimation(anim)
        var anim2 = AnimationUtils.loadAnimation(this, R.anim.alpha)
        text2.startAnimation(anim2)
        kirish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
