package naufal.com.intentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_with_data.*

class SecondWithDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_with_data)

        val name = intent.getStringExtra("name")
        val dob = intent.getStringExtra("dob")
        val from = intent.getStringExtra("from")
        val email = intent.getStringExtra("email")

        val desc = "Nama saya $name. Saya lahir di $from pada tanggal $dob. Alamat email saya $email. " +
                "Saya sedang belajar Kotlin"
        tv_data.text = desc
    }
}
