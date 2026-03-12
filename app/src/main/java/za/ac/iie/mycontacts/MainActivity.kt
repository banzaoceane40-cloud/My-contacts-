package za.ac.iie.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName ="oceane"
        val lastName ="banza"
        var address ="202 lower main road"
        var isMale =false
        val dayOfBirth=29
        val monthOfBirth="december"
        val yearOfBirth=2005
        Log.d("Hi",firstName +" "+lastName+ "you Live in"+ address+ "it is"+ isMale+"that you are male"+dayOfBirth+" "+
        monthOfBirth+" "+yearOfBirth)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}