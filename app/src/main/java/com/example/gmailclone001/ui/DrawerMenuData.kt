package com.example.gmailclone001.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {

    object AllInboxes : DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All inboxes"
    )

    object Inbox : DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )

    object Person : DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Person"
    )

    object AllMail : DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All Mail"
    )

    object Calendar : DrawerMenuData(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )

    object Settings : DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )

    object Help : DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & Feedback"
    )

    object Divider : DrawerMenuData(
        isDivider = true
    )

    object HeaderOne:DrawerMenuData(
        isHeader = true,
        title = "All labels"
    )

    object HeaderTwo:DrawerMenuData(
        isHeader = true,
        title = "Google Apps"
    )


}
