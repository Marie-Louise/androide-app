package com.example.androideapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var contactList:List<Contact>, var context:Context):RecyclerView.Adapter<ContactViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder{
          var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_items,parent,false)
          return  ContactViewHolder(itemView)
     }

     override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
          var currentContact=contactList.get(position)
          holder.etName.text=currentContact.name
          holder.etEmail.text=currentContact.email
          holder.etPhone.text=currentContact.phone
          Picasso.get().load(currentContact.imageUrl).resize(100,100).placeholder(R.drawable.img).into(holder.imageUrl)
          holder.cvContact.setOnClickListener {
                    var intent = Intent(context, DisplayContact::class.java)
                    intent.putExtra("Name", currentContact.name)
                    intent.putExtra("Email", currentContact.email)
                    intent.putExtra("phone", currentContact.phone)
                    intent.putExtra("Image", currentContact.imageUrl)
                    context.startActivity(intent)
          }


     }

     override fun getItemCount(): Int {
          return  contactList.size
     }

}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
     var etName=itemView.findViewById<TextView>(R.id.etName)
     var etEmail=itemView.findViewById<TextView>(R.id.etEmail)
     var etPhone=itemView.findViewById<TextView>(R.id.etPhone)
    var imageUrl=itemView.findViewById<ImageView>(R.id.ImageUrl)
     var cvContact=itemView.findViewById<CardView>(R.id.cvContact)

}
