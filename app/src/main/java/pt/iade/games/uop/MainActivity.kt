package pt.iade.games.uop

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers.GREEN_DOMINATED_EXAMPLE
import androidx.compose.ui.unit.dp
import pt.iade.games.uop.ui.components.Character
import pt.iade.games.uop.ui.components.RoomHeader
import pt.iade.games.uop.ui.components.StatsCard
import pt.iade.games.uop.ui.theme.UopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UopTheme {
                MainView()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Uop")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Action"
                )
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            // TODO: PLACE YOUR APP HERE.
            RoomHeader(
                rooms = listOf("Living Room", "Bathroom", "Kitchen", "More Stuff")
            )
            StatsCard()
            Character(
                state = "hungry",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    UopTheme {
        MainView()
    }
}

fun Add(x: Int, y: Int): Int {
    return x + y
}