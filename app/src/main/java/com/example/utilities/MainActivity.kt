package com.example.utilities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.utilities.ui.theme.Homescreen
import com.example.utilities.ui.theme.UtilitiesTheme
import androidx.compose.ui.text.font.Font

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.nunito_regular, FontWeight.Thin),
            Font(R.font.nunito_bold, FontWeight.Bold),
            Font(R.font.nunito_extrabold, FontWeight.ExtraBold),
            Font(R.font.nunito_semibold, FontWeight.SemiBold),
            Font(R.font.nunito_light, FontWeight.Light),
            Font(R.font.nunito_black, FontWeight.Black)

        )
        setContent {
            UtilitiesTheme {
                // A surface container using the 'background' color from the theme
               Homescreen(fontFamily)
            }
        }
    }
}

