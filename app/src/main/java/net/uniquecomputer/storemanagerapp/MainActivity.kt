package net.uniquecomputer.storemanagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
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
