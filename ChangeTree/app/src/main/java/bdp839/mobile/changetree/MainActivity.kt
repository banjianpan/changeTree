package bdp839.mobile.changetree

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.home_fragment.*

class MainActivity : AppCompatActivity() {
    lateinit var toolbar: ActionBar
    lateinit var list_of_charities: MutableList<Charity>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeCharities()


        if(findViewById<FrameLayout>(R.id.frame_layout) != null){
            if(savedInstanceState != null){
                return
            }
            supportFragmentManager.beginTransaction().add(R.id.frame_layout, homeFragment.newInstance()).commit()

        }






        val bottomNav: BottomNavigationView = findViewById(R.id.navigation_bar)
        bottomNav.setOnNavigationItemSelectedListener(navigation_item_select)

    }



    private fun initializeCharities(){
        list_of_charities = mutableListOf()
        list_of_charities.add(make_Charities("AMERICAN CIVIL LIBERTIES UNIONS", 3.05, true))
        list_of_charities.add(make_Charities("1-800-RUNAWAY", 3.05, true))
        list_of_charities.add(make_Charities("1000 MOTHERS TO PREVENT VIOLENCE", 3.05, true))
        list_of_charities.add(make_Charities("ANIMAL HUMANE", 3.05, true))
        list_of_charities.add(make_Charities("CANCER RESEARCH INSTITUTE", 3.05, true))
        list_of_charities.add(make_Charities("PREVENT CHILD ABUSE", 3.05, true))
        list_of_charities.add(make_Charities("CONSERVATION FUND", 3.05, true))
        list_of_charities.add(make_Charities("WATER.ORG", 3.05, true))
        list_of_charities.add(make_Charities("WILDAID", 3.05, true))
        list_of_charities.add(make_Charities("HUMAN RIGHTS FIRST", 3.05, true))
    }

    private fun make_Charities(charity_name: String, current_donations: Double, current_charity: Boolean): Charity{
        val charity: Charity = Charity()
        charity.makeCharity(charity_name, current_donations, current_charity)
        return charity
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
