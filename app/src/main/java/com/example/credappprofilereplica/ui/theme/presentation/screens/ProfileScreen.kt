package com.example.credappprofilereplica.ui.theme.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBalance
import androidx.compose.material.icons.rounded.CreditScore
import androidx.compose.material.icons.rounded.Payments
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.credappprofilereplica.ui.theme.presentation.utils.ReferAndEarnRow
import com.example.credappprofilereplica.ui.theme.presentation.utils.RewardsRow
import com.example.credappprofilereplica.ui.theme.presentation.utils.TopAppBar
import com.example.credappprofilereplica.ui.theme.presentation.utils.VehicleSection
import com.example.credappprofilereplica.ui.theme.presentation.utils.InfoRow
import com.example.credappprofilereplica.ui.theme.presentation.utils.ProfileSection

@Composable
fun ProfileScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Top Bar
            TopAppBar()

            Spacer(modifier = Modifier.height(16.dp))

            // Profile Section
            ProfileSection(
                name = "andaz Kumar",
                memberSince = "member since Dec, 2020"
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Vehicle Section
            VehicleSection()

            Spacer(modifier = Modifier.height(24.dp))

            // Credit Score Section
            InfoRow(
                icon = Icons.Rounded.CreditScore,
                title = "credit score",
                value = "757",
                showRefresh = true
            )

            Divider(
                modifier = Modifier.padding(vertical = 16.dp),
                color = Color.DarkGray
            )

            // Lifetime Cashback Section
            InfoRow(
                icon = Icons.Rounded.Payments,
                title = "lifetime cashback",
                value = "₹3"
            )

            Divider(
                modifier = Modifier.padding(vertical = 16.dp),
                color = Color.DarkGray
            )

            // Bank Balance Section
            InfoRow(
                icon = Icons.Rounded.AccountBalance,
                title = "bank balance",
                value = "check"
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Rewards & Benefits Section
            Text(
                text = "YOUR REWARDS & BENEFITS",
                color = Color.Gray,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Cashback Balance
            RewardsRow(title = "cashback balance", value = "₹0")

            Divider(
                modifier = Modifier.padding(vertical = 16.dp),
                color = Color.DarkGray
            )

            // Coins
            RewardsRow(title = "coins", value = "26,46,583")

            Divider(
                modifier = Modifier.padding(vertical = 16.dp),
                color = Color.DarkGray
            )

            // Refer and Earn
            ReferAndEarnRow()

            Spacer(modifier = Modifier.height(24.dp))

            // Transactions & Support Section
            Text(
                text = "TRANSACTIONS & SUPPORT",
                color = Color.Gray,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // All Transactions
            RewardsRow(title = "all transactions", value = "")
        }
    }
}