package com.nz.anand.westpactechnicalassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nz.anand.westpactechnicalassessment.R
import modularization.libraries.actions.Actions
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Actions.openOnBoardIntent(this))
    }
}