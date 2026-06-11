package at.fhooe.sail.mc.jpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import at.fhooe.sail.mc.jpc.ui.composables.InteractionTest
import at.fhooe.sail.mc.jpc.ui.theme.JpCTutorialTheme

const val TAG: String = "JetpackComposeIntroduction"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
// set content ist einziger bereich wo ein composable implementiert werden kann
        setContent {
            JpCTutorialTheme {
                InteractionTest()
            }
        }
    }
}

@Composable
                          // companion-objekt vom typ modifier -> hier ohne ()
fun Greeting(
    name: String,
    modifier: Modifier = Modifier,
) {
    Text(
        modifier = modifier,
        text = "Hello $name!",
        color = MaterialTheme.colorScheme.primary,
        style = MaterialTheme.typography.headlineMedium,
        )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewA() {
    JpCTutorialTheme {
        Greeting("again")
    }
}

@Preview(showSystemUi = true, showBackground = true, backgroundColor = 0xFF8BC34A)
@Composable
private fun GreetingPreviewB() {
    JpCTutorialTheme() {
        Greeting("Class")
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFC107)
@Composable
private fun GreetingPreviewC() {
    JpCTutorialTheme() {
        Greeting("Nicole")
    }
}