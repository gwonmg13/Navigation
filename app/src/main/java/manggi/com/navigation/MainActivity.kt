package manggi.com.navigation

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity(),navigationFragment.OnFragmentInteractionListener,
BlankFragment.OnFragmentInteractionListener{

    override fun onFragmentInteraction() {
        Navigation.findNavController(this,R.id.my_nav_host_fragment)
                .navigate(R.id.action_navigationFragment_to_blankFragment)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this,R.id.my_nav_host_fragment).navigateUp()
    }

}