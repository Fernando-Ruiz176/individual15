package cl.fernando.individual15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.fernando.individual15.databinding.ActivityMainBinding

/* Pasos para crear un recycler View
[ ] Item layout
[ ] Definir id
[ ] layout con recycler view
[ ] Asignar layout manager
[ ] Adapter + view holder
[ ] Obtener los datos
*/


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter() //Adaptador
        val pokedex = Pokedex.getPokedex() //Lista, obteniendo informacion
        adapter.setData(pokedex) //Adapter con datos
        binding.RV.adapter = adapter // Enlace de recycleview con adapter
    }


}