package bdp839.mobile.changetree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class openInfo: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.open_info, container, false)
    }

    companion object{
        fun newInstance(): openInfo{
            return openInfo()
        }
    }
}