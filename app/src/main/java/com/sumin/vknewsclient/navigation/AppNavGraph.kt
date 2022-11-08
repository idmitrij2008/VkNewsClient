package com.sumin.vknewsclient.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
internal fun AppNavGraph(
    navHostController: NavHostController,
    homeScreenContent: @Composable () -> Unit,
    favouritesScreenContent: @Composable () -> Unit,
    profileScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.NewsFeed.route,
    ) {
        composable(route = Screen.NewsFeed.route) {
            homeScreenContent()
        }
        composable(route = Screen.Favourites.route) {
            favouritesScreenContent()
        }
        composable(route = Screen.Profile.route) {
            profileScreenContent()
        }
    }
}