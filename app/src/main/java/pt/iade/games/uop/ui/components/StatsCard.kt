package pt.iade.games.uop.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.games.uop.R
import pt.iade.games.uop.ui.theme.UopTheme

@Composable
fun StatRow(
    state: String,
    value: Int,
    @DrawableRes icon: Int
) {
    Row {
        Text(
            text = state,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(end = 10.dp)
                .width(width = 85.dp)
        )

        for (i in 1..value) {
            Image(
                painter = painterResource(icon),
                contentDescription = value.toString(),
                modifier = Modifier.height(24.dp)
            )
        }
    }
}

@Composable
fun StatsCard() {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            StatRow(
                state = "Hunger",
                value = 8,
                icon = R.drawable.stat_steak
            )
            StatRow(
                state = "Clean",
                value = 5,
                icon = R.drawable.stat_clean
            )
            StatRow(
                state = "Health",
                value = 10,
                icon = R.drawable.stat_health
            )
            StatRow(
                state = "Loneliness",
                value = 2,
                icon = R.drawable.stat_cake
            )
        }
    }
}

@Composable
@Preview(showBackground = false)
fun StatsCardPreview() {
    UopTheme {
        StatsCard()
    }
}
