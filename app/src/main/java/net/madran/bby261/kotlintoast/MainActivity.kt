package net.madran.bby261.kotlintoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun viewToast(view: View) {
        Toast.makeText(this@MainActivity, "Butona Tıklandı..!", Toast.LENGTH_SHORT).show();
    }

}
