package com.tush.quoteapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.tush.quoteapp.Model.Quote
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.tush.quoteapp.R

@Composable
fun QuoteListScreen(data : Array<Quote> , onClick : (quote : Quote)-> Unit) {
    Column(
        modifier = Modifier.
        background(color = Color.Black)
    ) {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.headlineSmall,
            color = Color.White
//            fontFamily = FontFamily(Font(R.font.montserrat_regular))
        )
        QuoteList(data = data , onClick)
    }
}