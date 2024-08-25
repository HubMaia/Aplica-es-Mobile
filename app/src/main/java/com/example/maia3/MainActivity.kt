package com.example.maia3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.maia3.ui.theme.Maia3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                    TextFieldFun()
                }
            }
        }

@Composable
fun TextFieldFun() {
    var text1 by rememberSaveable { mutableStateOf("") }
    var text2 by rememberSaveable { mutableStateOf("") }

Column(
    modifier = Modifier
    .fillMaxSize()
    .padding(16.dp)
){
    TextField(
    value = text1,
    onValueChange = {text1 = it},
    label = { Text("Textfield 1") },
    modifier = Modifier.fillMaxWidth()
    )

    TextField(value = text2,
    onValueChange = {text2 = it },
    label = { Text("TextField 2") },
    modifier = Modifier.fillMaxWidth()
    )
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Maia3Theme {
        TextFieldFun()
    }
}