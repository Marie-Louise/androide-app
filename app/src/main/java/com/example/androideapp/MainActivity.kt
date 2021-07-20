package com.example.androideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun displayContact(){
        var contactList= listOf<Contact>(
            Contact("Marie","marie@gmail.com","0788888888","https://images.pexels.com/photos/1239291/pexels-photo-1239291.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Geraldine","geraldine@gmail.com","0783547465","https://images.pexels.com/photos/1222271/pexels-photo-1222271.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Kevine","kevin@gmail.com","0784546647","https://media.istockphoto.com/photos/young-woman-with-camera-picture-id602315862?k=6&m=602315862&s=612x612&w=0&h=ak67tGJe63j99Zu42L6wZ0aAJTyzh-F4GqQvIRnFX5k="),
            Contact("Jeannine","jeannine@gmail.com","0786556464","https://media.istockphoto.com/photos/woman-in-nature-picture-id147946204?s=612x612"),
            Contact("Divine","divine@gmail.com","0786465544","https://media.istockphoto.com/photos/young-woman-with-camera-picture-id602315862?k=6&m=602315862&s=612x612&w=0&h=ak67tGJe63j99Zu42L6wZ0aAJTyzh-F4GqQvIRnFX5k="),
            Contact("Olive","olive@gmail.com","0785465463","https://images.pexels.com/photos/8745722/pexels-photo-8745722.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
        )
        rvContact=findViewById(R.id.cvContact)
        var contactAdapter=ContactAdapter(contactList,baseContext)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter

    }

}