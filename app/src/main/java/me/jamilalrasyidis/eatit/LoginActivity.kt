package me.jamilalrasyidis.eatit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // init firebase
        val db = FirebaseFirestore.getInstance()
        val tableUser = db.collection("users").get()

        /*btn_login.setOnClickListener {
            tableUser.addOnSuccessListener {result ->
                for (document in result) {
                    Log.d("firebase_thing", "${document.data}")
                }
            }.addOnFailureListener { exception ->
                Log.w("firebase_thing", exception)
            }
        }*/
    }
}
