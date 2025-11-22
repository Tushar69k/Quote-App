package com.tush.quoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tush.quoteapp.Screens.QuoteDetail
import com.tush.quoteapp.Screens.QuoteListScreen
import com.tush.quoteapp.ui.theme.QuoteAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()



        CoroutineScope(Dispatchers.IO).launch { // for running in background thread . Dispatchers.IO is for background thread
            delay(1000)
            DataManager.LoadAssetsFromFile(applicationContext)
        }


        setContent {
            SplashApp()

//            App()
        }
    }
}


@Composable
fun App() {


    if (DataManager.isDataloaded.value) {

        if (DataManager.currentPage.value == Pages.LISTING) {
            QuoteListScreen(data = DataManager.data) {
                DataManager.switchPages(it)
            }
        } else {
            DataManager.currentQuote?.let { QuoteDetail( quote = it) }
        }


    } else {
        Box(
            modifier = Modifier
                .fillMaxSize(1f)
                .background(color = Color.Black),
            contentAlignment = Alignment.Center
        )
        {
            Text(
                text = "Loading....",
                color = Color(0xFFFF5E00),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }

}

enum class Pages {
    LISTING,
    DETAIL,
}





// Adding Splash Screen

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Splash Logo",
            modifier = Modifier.size(210.dp) // adjust size as needed
        )
    }
}



@Composable
fun SplashApp() {
    val showSplash = remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(3000) // 3 seconds delay
        showSplash.value = false
    }

    if (showSplash.value) {
        SplashScreen()
    } else {
        App()
    }
}










