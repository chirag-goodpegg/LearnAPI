package com.example.learnnavigation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class EmployeeViewModel : ViewModel() {
    private val _employees = MutableStateFlow<List<EmployeeModel>>(emptyList())
    val employees: StateFlow<List<EmployeeModel>> = _employees

    init {
        fetchEmployees()
    }

    private fun fetchEmployees() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getEmployees()
                _employees.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}