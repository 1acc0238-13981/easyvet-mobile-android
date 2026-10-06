package pe.edu.upc.easyvet.main

import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable
import pe.edu.upc.easyvet.core.designsystems.favorite
import pe.edu.upc.easyvet.core.designsystems.home

enum class NavigationItem (
    val route: @Serializable Any,
    val icon: ImageVector,
    val title: String
) {

    HOME(
        route = HomeRoute,
        icon = home,
        title = "Home"
    ),
    FAVORITES(
        route = FavoritesRoute,
        icon = favorite,
        title = "Favorites"
    )
}