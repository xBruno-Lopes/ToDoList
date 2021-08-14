package com.brunolopes.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.brunolopes.todolist.adapter.DefinitionAdapter
import com.brunolopes.todolist.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleView = findViewById<RecyclerView>(R.id.definition_recicleView)

        val adapter = DefinitionAdapter(this, Datasource().loarDefinition())

        recycleView.adapter = adapter
        recycleView.setHasFixedSize(true)

    }
}