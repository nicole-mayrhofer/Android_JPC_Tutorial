package at.fhooe.sail.mc.jpc.ui.composables

import android.content.res.Configuration
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import at.fhooe.sail.mc.jpc.R
import at.fhooe.sail.mc.jpc.ui.theme.JpCTutorialTheme

// Spezifiziert die Stimmungen, die dann in Bilder dargestellt werden

// drawable hier als Prüfwert übergeben, damit nicht eine Klasse "Mood" kommt
enum class Mood(@DrawableRes val resId: Int) {
    HOT (R.drawable.fire),
    NEUTRAL (R.drawable.water),
    COLD (R.string.app_name),
}

@Composable
fun Mood (
    // funktion: Klasse = Parameter
    mood: Mood = Mood.COLD, // neutral als default, sonst funkt. preview nicht richtig
    modifier: Modifier = Modifier,
    ) {

    Image(
        painter = painterResource(mood.resId),
        contentDescription = "water image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(128.dp)
            .border(
                width = 5.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = CircleShape,
            )
            .clip(CircleShape)
    )
}

@Preview (showBackground = true)
@Composable
private fun MoodPreview() {
    JpCTutorialTheme() {
        Mood()
    }
}

@Preview (showBackground = true,
uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL)
@Composable
private fun MoodPreviewNight() {
    JpCTutorialTheme() {
        Mood()
    }

}