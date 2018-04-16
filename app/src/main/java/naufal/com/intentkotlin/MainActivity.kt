package naufal.com.intentkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_new_intent.setOnClickListener({
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        })

        btn_new_intent_with_data.setOnClickListener({
            val intent = Intent(this, SecondWithDataActivity::class.java)
            intent.putExtra("name", "Mochammad Naufal Rizaldi")
            intent.putExtra("dob", "3 December 1997")
            intent.putExtra("from", "Bandung")
            intent.putExtra("email", "naufalrzld@gmail.com")
            startActivity(intent)
        })

        btn_new_intent_with_object_data.setOnClickListener({
            val user = User("Mochammad Naufal Rizaldi", "3 December 1997", "Bandung", "naufalrzld@gmail.com")
            val intent = Intent(this, SecondWithDataObjectActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        })
    }
}
