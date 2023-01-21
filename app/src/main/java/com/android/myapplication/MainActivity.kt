package com.android.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.myapplication.ui.theme.LoginTheme
import com.android.myapplication.ui.theme.Purple200
import com.android.myapplication.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                           Students()
                }
            }
        }
    }
}


@Composable
fun Students() {
    LazyColumn {
        item {
            Text(text = "First Item")
        }
        items(5) { index ->
            Text(text = "Item: $index")
        }
        item {
            Text(text = "Last Item")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginTheme {

    }
}