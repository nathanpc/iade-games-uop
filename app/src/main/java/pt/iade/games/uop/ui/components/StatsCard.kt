package pt.iade.games.uop.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.games.uop.R
import pt.iade.games.uop.models.UopStats
import pt.iade.games.uop.ui.theme.UopTheme
import kotlin.Int

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
fun StatsCard(
    stats: UopStats,
    collapsed: Boolean = false,
    onClick: () -> Unit = {}
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            StatRow(
                state = "Hunger",
                value = stats.hunger,
                icon = R.drawable.stat_steak
            )
            StatRow(
                state = "Clean",
                value = stats.clean,
                icon = R.drawable.stat_clean
            )

            if (!collapsed) {
                StatRow(
                    state = "Health",
                    value = stats.health,
                    icon = R.drawable.stat_health
                )
                StatRow(
                    state = "Loneliness",
                    value = stats.loneliness,
                    icon = R.drawable.stat_cake
                )
            } else {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.keyboard_arrow_down),
                        contentDescription = "Show More",
                        colorFilter = ColorFilter.tint(Color.Gray)
                    )

                    Text(
                        text = "Show More...",
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = false)
fun StatsCardExpandedPreview() {
    UopTheme {
        StatsCard(UopStats(
            hunger = 8,
            clean = 10,
            health = 6,
            loneliness = 2,
            state = "sad"
        ))
    }
}

@Composable
@Preview(showBackground = false)
fun StatsCardCollapsedPreview() {
    UopTheme {
        StatsCard(
            stats = UopStats(
                hunger = 5,
                clean = 8,
                health = 10,
                loneliness = 5,
                state = "hungry"
            ),
            collapsed = true
        )
    }
}
