package com.peculiaruc.mixapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.peculiaruc.mixapp.R
import com.peculiaruc.mixapp.model.FactModel
import com.peculiaruc.mixapp.ui.DetailsActivity

class FactAdapter(context: Context, facts: List<FactModel>  ): ArrayAdapter<FactModel>(context,0, facts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        val fact = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.list_fact_item, parent, false)
        }

        val image = view?.findViewById<ImageView>(R.id.fact_Image)
        val name = view?.findViewById<TextView>(R.id.textfact_name)

        fact?.image?.let {
            image?.setImageResource(fact.image)
        }
        name?.text = fact?.name

        view?.setOnClickListener {
            val intent = Intent(parent.context, DetailsActivity::class.java)
            intent.putExtra(IMAGE_EXTRAS,fact?.image)
            intent.putExtra(NAME_EXTRAS,fact?.name)
            intent.putExtra(FACT_EXTRAS,fact?.fact)
            parent.context.startActivity(intent)
        }
        return view!!
    }

    companion object{
        val IMAGE_EXTRAS = "image_extras"
        val NAME_EXTRAS = "name_extras"
        val FACT_EXTRAS = "fact_extras"
    }
}
