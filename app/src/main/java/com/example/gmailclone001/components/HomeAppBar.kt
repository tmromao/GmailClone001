package com.example.gmailclone001.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone001.GmailApp
import com.example.gmailclone001.ui.theme.GmailClone001Theme

@Composable
fun HomeAppBar() {
    Box(modifier = Modifier.padding(10.dp)) {

        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 6.dp
        ) {

            Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize().padding(8.dp)){


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