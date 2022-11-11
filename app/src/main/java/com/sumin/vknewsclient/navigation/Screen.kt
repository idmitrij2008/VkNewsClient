package com.sumin.vknewsclient.navigation

sealed class Screen(
    val route: String
) {

    object NewsFeed : Screen(ROUTE_NEWS_FEED)
    object Favourites : Screen(ROUTE_FAVOURITES)
    object Profile : Screen(ROUTE_PROFILE)
    object Home : Screen(ROUTE_HOME)
    object Comments : Screen(ROUTE_COMMENTS)

    private companion object {
        const val ROUTE_HOME = "ROUTE_HOME"
        const val ROUTE_COMMENTS = "ROUTE_COMMENTS"
        const val ROUTE_NEWS_FEED = "ROUTE_NEWS_FEED"
        const val ROUTE_FAVOURITES = "ROUTE_FAVOURITES"
        const val ROUTE_PROFILE = "ROUTE_PROFILE"
    }
}