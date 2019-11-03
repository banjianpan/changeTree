package bdp839.mobile.changetree

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.cur_charities.*
import kotlinx.android.synthetic.main.cur_charities.view.*


class curCharities: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.cur_charities, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.getInfo.setOnClickListener({
            Log.d("curCharities", "inside clicked")
            activity!!.supportFragmentManager.beginTransaction().add(R.id.cur_change_container, openInfo.newInstance()).addToBackStack(null).commit()
        })
    }

    companion object{
        fun newInstance(): curCharities = curCharities()

    }
}