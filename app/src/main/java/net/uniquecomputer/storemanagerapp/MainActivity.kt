package net.uniquecomputer.storemanagerapp

import android.R
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode
import androidx.core.view.GravityCompat
import net.uniquecomputer.storemanagerapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.filter.setOnClickListener {

            AlertDialog.Builder (this)
                .setTitle("Filter By")
                .setSingleChoiceItems(arrayOf("All", "Awaiting Payment", "Received","Processed", "Shipped","Delivered","Cancelled","Returned"), 0) { _, which ->
                    when (which) {
                        0 -> {

                        }
                        1 -> {

                        }
                        2 -> {

                        }
                    }
                  }
                .setPositiveButton("Ok") { _, _ ->
                    //do something
                }
                .setNegativeButton("Cancel") { _, _ ->

                }
                .setCancelable(false)
                .show()


        }



    }


}
