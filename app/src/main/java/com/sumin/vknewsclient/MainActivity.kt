package com.sumin.vknewsclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
        Example1()
    }
}

@Composable
private fun Example1() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "TopAppBar title")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = null
                        )
                    }
                }
            )
        },
        bottomBar = {
            val items = listOf("1", "2", "3")
            BottomNavigation {
                items.forEachIndexed { index, item ->
                    val icon = when (index) {
                        0 -> Icons.Filled.Favorite
                        1 -> Icons.Filled.Edit
                        else -> Icons.Filled.Delete
                    }

                    BottomNavigationItem(
                        icon = {
                            Icon(
                                imageVector = icon,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text(text = item)
                        },
                        selected = index == 0,
                        onClick = { }
                    )
                }
            }
        },
        drawerContent = {
            Text(text = "Text 1")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Text 2")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Text 3")
        }
    ) {
        Text(
            modifier = Modifier.padding(it),
            text = "This is scaffold content"
        )
    }
}