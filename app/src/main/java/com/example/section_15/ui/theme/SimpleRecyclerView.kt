package com.example.section_15.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleRecyclerView() {
    LazyColumn{
        item { Text(text = "Primer Item") }
        item { Text(text = "Primer Item") }
        item { Text(text = "Primer Item") }
        item { Text(text = "Primer Item") }

        items(7) {
            Text(text = "Este es el item $it")
        }
        val myList = listOf("José", "Manuel", "Jesús")

        items(myList) {
            Text(text = "Nombre: $it")
        }

    }
}

@Preview()
@Composable
fun SRVPreview() {
    SimpleRecyclerView()
}