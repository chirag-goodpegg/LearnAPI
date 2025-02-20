package com.example.learnnavigation

import android.os.Bundle
import android.provider.Settings.Global
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learnnavigation.screens.ScreenA
import com.example.learnnavigation.screens.ScreenB
import com.example.learnnavigation.screens.mainScreen
import com.example.learnnavigation.ui.theme.LearnNavigationTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnNavigationTheme {
//                Naigation()
                mainScreen()
                getEmployeeInformation()
            }
        }
    }

    private fun getEmployeeInformation() {
//        TODO("Not yet implemented")
        GlobalScope.launch {
            try {
                val response = RetrofitInstance.employeeAPI.getEmployeeInformation()
            } catch (e: Exception) {

            }
        }

    }









//
//    private fun setUI(employee:EmployeeModel) {
//        binding.tvFirstName.text = employee.firstName
//    }

//    private fun setInProgress(inProgress: Boolean) {
//     if (inProgress){
//         binding.progressBar.visibility = View.VISIBLE
//     }
//    }
}

