package id.ac.polbeng.wawansaputra.intens2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.wawansaputra.intens2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val sendData = binding.editText.text.toString()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("main_activity_data", sendData)
            startActivity(intent)
        }
    }
}
