package com.sumin.vknewsclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            VkNewsClientTheme {
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(MaterialTheme.colors.background)
//                        .padding(8.dp)
//                ) {
//                    PostCard()
//                }
//            }

            Test()
        }
    }
}

@Preview
@Composable
private fun Test() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
//        Example1()
//        Example2()
        Example3()
    }
}

@Composable
private fun Example1() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Hello World")
    }
}

@Composable
private fun Example2() {
    TextField(
        value = "",
        onValueChange = { },
        label = {
            Text(text = "Label")
        },
        singleLine = true
    )
}

@Composable
private fun Example3() {
    AlertDialog(
        onDismissRequest = { },
        title = {
            Text(text = "Are you sure?")
        },
        text = {
            Text(text = "Do you want to delete this file?")
        },
        confirmButton = {
            TextButton(
                onClick = { }
            ) {
                Text(text = "Yes")
            }
        },
        dismissButton = {
            TextButton(
                onClick = { }
            ) {
                Text(text = "No")
            }
        }
    )
}
