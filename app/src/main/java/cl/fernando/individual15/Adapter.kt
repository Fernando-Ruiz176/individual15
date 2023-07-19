package cl.fernando.individual15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.fernando.individual15.databinding.ItemLayoutBinding

/*
    [ ] Implementar clase Adapter
    [ ] Heredar RecyclerView.Adapter
    [ ] Creaciones de los metodos onCreateViewHolder, onBindViewHolder y getItemCount
    [ ] crear clase anidada ViewHolder, que hereda de la clase ViewHolder
    [ ] Agregar constructor
    [ ] crear objeto, data class
    [ ] Crear lista
    [ ] asignar tamaño de la lista en getItemCount
    [ ] definir Binding Class del Item
    [ ] cambiar view por el binding
    [ ] declarar variable item en onBindViewHolder
    [ ] implementar binding en clase viewHolder
 */

class Adapter: RecyclerView.Adapter <Adapter.ViewHolder>(){

    var pokemones = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        var binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    fun setData(pokedex: List<Pokemon>) {
        this.pokemones = pokedex.toMutableList()
    }


    class ViewHolder (val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(pokemon: Pokemon) {
            binding.textView1.text = pokemon.nombre
            binding.textView2.text = pokemon.tipo

        }

    }



}