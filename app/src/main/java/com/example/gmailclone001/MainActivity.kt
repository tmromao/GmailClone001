package com.example.gmailclone001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.example.gmailclone001.components.*
import com.example.gmailclone001.ui.theme.GmailClone001Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailClone001Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog = remember{
        mutableStateOf(false)
    }

    Scaffold(

        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState = scaffoldState, coroutineScope, openDialog) },
        drawerContent = {

            GmailDrawerMenu(scrollState)
        },
        bottomBar = {
            HomeBottomMenu()
        },
        floatingActionButton = { GmailFab(scrollState) }

    ) {

       MailList(paddingValues = it)

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailClone001Theme {
        GmailApp()
    }
}