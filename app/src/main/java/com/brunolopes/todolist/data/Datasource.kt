package com.brunolopes.todolist.data

import com.brunolopes.todolist.R
import com.brunolopes.todolist.model.Definition

class Datasource {
    fun loarDefinition() = listOf<Definition>(
        Definition(R.string.pagar_internet),
        Definition(R.string.fazer_trabalho),
        Definition(R.string.pagar_energia),
        Definition(R.string.fazer_as_compras),
        Definition(R.string.passear_com_dog),
        Definition(R.string.academia),
        Definition(R.string.pagar_agua),
        Definition(R.string.aniversario),
        Definition(R.string.encontro_com_namorada)

    )
}