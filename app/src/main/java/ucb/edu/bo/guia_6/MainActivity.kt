package ucb.edu.bo.guia_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

import kotlin.math.log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar as Toolbar?)

        supportActionBar.let {
            it?.setDisplayHomeAsUpEnabled(true)
            it?.setDisplayShowHomeEnabled(true)}

    setContentView(R.layout.activity_main)
        btnWhite.setOnClickListener {toast("White")
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }

        btnRed.setOnClickListener {toast("REd")
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        fun toast(text: String, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
    }

    fun selectedButton(view: View) {
        if ( view.id === R.id.btnServices) {
            val intent: Intent = Intent(view.context, MainActivity::class.java)
            startActivity(intent)

        } else {
            Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

   override fun onOptionsItemSelected(item: Menu?): Boolean {
        when (item!!.itemId) {

            R.id.action_search ->{
                Log.d("TEST", "ICON SEARCH")
                true
            }
        }


    fun toast(text: String, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()

    //return super.onOptionsItemSelected(item)
    //}

}
