package com.sumin.vknewsclient.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
internal fun AppNavGraph(
    navHostController: NavHostController,
    newsFeedScreenContent: @Composable () -> Unit,
    favouritesScreenContent: @Composable () -> Unit,
    profileScreenContent: @Composable () -> Unit,
    commentsScreenContent: @Composable () -> Unit,
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route,
    ) {

        homeScreenNavGraph(
            newsFeedScreenContent = newsFeedScreenContent,
            commentsScreenContent = commentsScreenContent
        )

        composable(route = Screen.Favourites.route) {
            favouritesScreenContent()
        }
        composable(route = Screen.Profile.route) {
            profileScreenContent()
        }
    }
}