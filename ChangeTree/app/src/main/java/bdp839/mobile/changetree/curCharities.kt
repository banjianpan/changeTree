package bdp839.mobile.changetree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class curCharities: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.cur_charities, container, false)

    companion object{
        fun newInstance(): curCharities = curCharities()


    }
}