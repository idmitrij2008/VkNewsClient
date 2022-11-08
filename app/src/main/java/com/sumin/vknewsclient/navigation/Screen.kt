package com.sumin.vknewsclient.navigation

sealed class Screen(
    val route: String
) {

    object NewsFeed : Screen(ROUTE_NEWS_FEED)
    object Favourites : Screen(ROUTE_FAVOURITES)
    object Profile : Screen(ROUTE_PROFILE)

    private companion object {
        const val ROUTE_NEWS_FEED = "ROUTE_NEWS_FEED"
        const val ROUTE_FAVOURITES = "ROUTE_FAVOURITES"
        const val ROUTE_PROFILE = "ROUTE_PROFILE"
    }
}