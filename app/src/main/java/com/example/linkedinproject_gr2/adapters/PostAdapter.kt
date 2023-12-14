package com.example.linkedinproject_gr2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.linkedinproject_gr2.R
import com.example.linkedinproject_gr2.models.Post

class PostAdapter(private val context: Context, private val listOfPost: List<Post>) : BaseAdapter() {
    val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = listOfPost.size


    override fun getItem(position: Int): Any = listOfPost[position]



    override fun getItemId(position: Int): Long = position.toLong()


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = layoutInflater.inflate(R.layout.post_item,parent,false)

        val ivPhoto = rowView.findViewById<ImageView>(R.id.ivProfilePicture)
        val tvTitle = rowView.findViewById<TextView>(R.id.tvTitle)
        val tvDescription = rowView.findViewById<TextView>(R.id.tvDescription)

        ivPhoto.setImageResource(listOfPost[position].profilePicture)
        tvTitle.text = listOfPost[position].title
        tvDescription.text = listOfPost[position].description
        return rowView
    }
}