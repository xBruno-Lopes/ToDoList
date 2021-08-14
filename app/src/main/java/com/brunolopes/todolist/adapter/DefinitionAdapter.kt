package com.brunolopes.todolist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.brunolopes.todolist.R
import com.brunolopes.todolist.model.Definition

class DefinitionAdapter(private val context: Context, private val dataset: List<Definition>)
    : RecyclerView.Adapter<DefinitionAdapter.DefinitionViewHolder>(){
    class DefinitionViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val descriptionTextView: TextView = view.findViewById(R.id.card_descripition_textview)
        val titleTextView: TextView = view.findViewById(R.id.card_title_textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefinitionViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_card_item, parent, false)
        return DefinitionViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DefinitionViewHolder, position: Int) {
        val definition = dataset[position]
        val word = context.resources.getResourceEntryName(definition.stringResourceId).replace("_", " ").
        replaceFirstChar { it.uppercase() }
        val description = context.getString(definition.stringResourceId)
        holder.titleTextView.text = word
        holder.descriptionTextView.text = description
    }

    override fun getItemCount() = dataset.size
}