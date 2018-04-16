package naufal.com.intentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_with_data.*

class SecondWithDataObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_with_data_object)

        val data = intent.getParcelableExtra<User>("user")
        val desc = "Nama saya ${data.name}. Saya lahir di ${data.from} pada tanggal ${data.dob}. " +
                "Alamat email saya ${data.email}. Saya sedang belajar Kotlin"
        tv_data.text = desc
    }
}
