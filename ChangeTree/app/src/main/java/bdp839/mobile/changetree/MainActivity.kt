package bdp839.mobile.changetree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.home_fragment.*

class MainActivity : AppCompatActivity() {
    lateinit var toolbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNav: BottomNavigationView = findViewById(R.id.navigation_bar)
        bottomNav.setOnNavigationItemSelectedListener(navigation_item_select)

    }

    private val navigation_item_select = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when(item.itemId){
            R.id.bottom_nav_home -> {
                val home_Fragment = homeFragment.newInstance()
                openFragment(home_Fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_nav_cur_charities -> {
                val cur_Charities = curCharities.newInstance()
                openFragment(cur_Charities)
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_nav_search -> {
                val search_Charities = searchCharities.newInstance()
                openFragment(search_Charities)
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_nav_profile -> {
                val profile = profile.newInstance()
                openFragment(profile)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        //transaction.addToBackStack(null)
        transaction.commit()
    }
}
