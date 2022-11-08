package com.sumin.vknewsclient.ui

import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.currentBackStackEntryAsState
import com.sumin.vknewsclient.navigation.AppNavGraph
import com.sumin.vknewsclient.navigation.rememberNavigationState

@Composable
internal fun MainScreen(
    viewModel: MainViewModel
) {
    val navigationState = rememberNavigationState()

    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navigationState.navHostController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                val items = listOf(
                    NavigationItem.Home,
                    NavigationItem.Favourites,
                    NavigationItem.Profile
                )

                items.forEach { item ->
                    BottomNavigationItem(
                        selected = currentRoute == item.screen.route,
                        onClick = { navigationState.navigateTo(item.screen.route) },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text(text = stringResource(id = item.titleResId))
                        },
                        selectedContentColor = MaterialTheme.colors.onPrimary,
                        unselectedContentColor = MaterialTheme.colors.onSecondary
                    )
                }
            }
        },
    ) { paddingValues ->
        AppNavGraph(
            navHostController = navigationState.navHostController,
            homeScreenContent = {
                HomeScreen(
                    viewModel = viewModel,
                    paddingValues = paddingValues
                )
            },
            favouritesScreenContent = {
                TextCounter(name = "Favourite")
            },
            profileScreenContent = {
                TextCounter(name = "Profile")
            }
        )
    }
}

@Composable
private fun TextCounter(name: String) {
    var count by rememberSaveable() {
        mutableStateOf(0)
    }

    Text(
        modifier = androidx.compose.ui.Modifier.clickable { count++ },
        text = "$name Count: $count",
        color = Color.Black
    )
}