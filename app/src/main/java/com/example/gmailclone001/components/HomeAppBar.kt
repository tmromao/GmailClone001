package com.example.gmailclone001.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone001.GmailApp
import com.example.gmailclone001.ui.theme.GmailClone001Theme
import com.example.gmailclone001.R


@Composable
fun HomeAppBar() {
    Box(modifier = Modifier.padding(10.dp)) {

        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 6.dp
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {

                Icon(Icons.Default.Menu, "Menu")

                Text(
                    text = "Search in emails",
                    modifier = Modifier.weight(2.0f)
                )

                Image(
                    painter = painterResource(id = R.drawable.gradient_2),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                )


            }//ROW

        }//CARD

    }//BOX

}

@Preview
@Composable
fun HomeAppBarPreview() {
    GmailClone001Theme {
        GmailApp()

    }

}