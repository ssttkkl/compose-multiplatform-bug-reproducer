@file:OptIn(ExperimentalResourceApi::class)

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.icon_arrow_outward
import kotlinproject.composeapp.generated.resources.icon_drag_handle
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.imageResource

@Composable
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxWidth()) {
            Icon(imageResource(Res.drawable.icon_drag_handle), "")
            Icon(imageResource(Res.drawable.icon_arrow_outward), "")
        }
    }
}