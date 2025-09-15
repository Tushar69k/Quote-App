package com.tush.quoteapp.Screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tush.quoteapp.DataManager
import com.tush.quoteapp.Model.Quote
import com.tush.quoteapp.R

@Composable
fun QuoteDetail(quote : Quote) {

BackHandler {
    DataManager.switchPages(null)
}
    Box(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.radialGradient(
                    colors = listOf(
                        Color(0xFF0A0A0A),
                        Color(0xFF0A0A0A),
                        Color(0xFFFF5E00),
                        Color(0xFFFF5E00),
                        Color(0xFF0A0A0A),
                        Color(0xFF0A0A0A),
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {

        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .padding(15.dp)
                .border(
                    width = 2.dp,
                    color = Color(0xFFFF5E00), // Neon Orange
                    shape = RoundedCornerShape(12.dp)
                ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ) {


            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.orangeneonquote),
                    contentDescription = "",
                    modifier = Modifier
                        .size(69.dp)
                )


                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(8.dp)
                ) {

                    Text(
                        text = quote.text,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(5.dp),
                        color = Color.White
                    )


                    Box(
                        modifier = Modifier
                            .fillMaxWidth(.9f)
                            .height(1.dp)
                            .background(Color(0xFFFFFFFF))
                            .padding(50.dp)
                    ) {
                    }

                    Text(
                        text = quote.author,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(4.dp)
                    )
                }
            }

        }


    }


}







@Preview(showBackground = true)
@Composable
fun QuoteDerailPreview() {
//    QuoteDetail()
}
