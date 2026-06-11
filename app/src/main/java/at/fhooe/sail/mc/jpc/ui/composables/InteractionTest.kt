package at.fhooe.sail.mc.jpc.ui.composables

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import at.fhooe.sail.mc.jpc.TAG
import at.fhooe.sail.mc.jpc.ui.theme.JpCTutorialTheme

@Composable
fun InteractionTest(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center,

        ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,


        ){
            var counter: Int = 0
            val c: Context = LocalContext.current
            Text(text ="Interaction Test", fontSize = 32.sp, color = Color.Blue)
            Spacer(modifier = Modifier.size(300.dp))



            Button(
                onClick = {
                    counter++
                    Log.i(TAG, "Button clicked!")
                    Toast.makeText(
                        c,
                        "Button Clicked ($counter)",
                        Toast.LENGTH_SHORT)
                        .show()
                }
            ){
                Text("Click Me! ($counter)")
            }

            val m: Modifier = Modifier
                .size(width = 50.dp, height = 50.dp)
                .background(Color.DarkGray)
                .border(
                    width = 3.dp,
                    color = Color.Red,
                )
                .clickable(onClick = {
                    counter++
                    Log.i(TAG, "Box Clicked!")
                    Toast.makeText(
                        c,
                        "Button Clicked ($counter)",
                        Toast.LENGTH_SHORT)
                        .show()
                } )

            Spacer(modifier = Modifier.size(20.dp))

            // BOX 1
            Box(
                modifier = m,
                contentAlignment = Alignment.Center
            ) {
                Text(text = "A", fontSize = 24.sp, color = Color.White,)
            }
            Spacer(modifier = Modifier.size(300.dp))
        }
    }

}

@Preview (showBackground = true)
@Composable
private fun InteractionTestPreview() {
    JpCTutorialTheme() {
        InteractionTest()
    }
}