package bdp839.mobile.changetree

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharatiesAdapter(val charities: MutableList<Charity>): RecyclerView.Adapter<CharatiesAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharatiesAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.charity_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharatiesAdapter.ViewHolder, position: Int) {
        holder.stock_name.text = charities.get(position).getName()
        holder.stock_price.text = "$" + charities.get(position).getDonation()
    }

    override fun getItemCount(): Int {
        return charities.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val stock_name: TextView = itemView.findViewById(R.id.stock_text)
        val stock_price: TextView = itemView.findViewById(R.id.stock_price)
    }

}