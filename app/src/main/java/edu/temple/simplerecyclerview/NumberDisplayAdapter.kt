package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation
/* TODO Step 3a: Provide Adapter Parent */
class NumberDisplayAdapter(private val numbers : Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()  {
    // TODO Step 3b: Complete function definitions for adapter

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder (TextView (parent.context))
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = "${numbers[position]}"
        holder.textView.textSize = numbers[position].toFloat()
    }
}