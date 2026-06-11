package at.fhooe.sail.mc.jpc.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import at.fhooe.sail.mc.jpc.ui.theme.JpCTutorialTheme

@Composable
fun LayoutTest (modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.BottomCenter

    ) {

        Row(
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)

        ) {

            val m: Modifier = Modifier
                .size(width = 50.dp, height = 50.dp)
                .background(Color.DarkGray)
                .border(
                    width = 3.dp,
                    color = Color.Red,
                )

            // BOX 1
            Box(
                modifier = m,
                contentAlignment = Alignment.Center
            ) {
                Text(text = "A", fontSize = 24.sp, color = Color.White,)
            }
            // BOX 2
            Box(
                modifier = m,
                contentAlignment = Alignment.Center
            )
            {
                Text(text = "B", fontSize = 24.sp, color = Color.White,)
            }

            // weight ist die "Wichtigkeit des Elements
            Spacer(
                modifier = Modifier
                    .weight(0.2f)
            )

            // BOX 3
            Box(
                modifier = m,
                contentAlignment = Alignment.Center
            )
            {
                Text(text = "C", fontSize = 24.sp, color = Color.White,)
            }

        }


    }

}

@Preview (showBackground = true)
@Composable
private fun LayoutTestPreview() {
    JpCTutorialTheme() {
        LayoutTest()
    }
}