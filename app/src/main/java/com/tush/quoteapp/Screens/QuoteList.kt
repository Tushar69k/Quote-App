package com.tush.quoteapp.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tush.quoteapp.Model.Quote

@Composable
fun QuoteList(data : Array<Quote> , onClick : (quote : Quote)-> Unit){


    LazyColumn(
        content = {
            items(data){
                QuoteListItem(quote = it , onClick )
            }
        }
    )

}




@Preview(showBackground = true)
@Composable
fun QuoteListPreview() {
//    QuoteList()
}