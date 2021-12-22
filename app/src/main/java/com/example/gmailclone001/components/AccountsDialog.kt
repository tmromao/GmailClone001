package com.example.gmailclone001.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.gmailclone001.R
import com.example.gmailclone001.model.MailData

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {

    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountsDialogUI()

    }

}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier) {

    Card() {

        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {
            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                IconButton(onClick = { /*TODO*/ }) {

                    Icon(imageVector = Icons.Default.Close, contentDescription = "Close Button")


                }//IconButton

                Image(
                    painterResource(id = R.drawable._google_search_thumbnail),
                    contentDescription = "",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                )

            }//Row 1

            Row(
                modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp)
            )
            {

                Image(
                    painter = painterResource(id = R.drawable.gradient_2),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                        .clickable {

                        }
                )//Image

                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp, bottom = 16.dp)
                ) {
                    Text(text = "Tutorials Eu", fontWeight = FontWeight.SemiBold)
                    Text(text = "Tutorials@eu.com")
                }
                Text(text = "99+", modifier = Modifier.padding(end = 16.dp))

            }//Row 2

            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

                Card(
                    modifier.requiredWidth(150.dp), shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, color = Color.Gray)
                ) {
                    
                    Text(text = "Google Account", modifier.padding(8.dp), textAlign = TextAlign.Center)

                }//Card

                Spacer(modifier.width(10.dp))

            }

            Divider(modifier.padding(top = 16.dp))

        }//Column

    }//Card

}

@Preview(showBackground = true)
@Composable
fun AccountsDialogUIPreview() {
    AccountsDialogUI()
}