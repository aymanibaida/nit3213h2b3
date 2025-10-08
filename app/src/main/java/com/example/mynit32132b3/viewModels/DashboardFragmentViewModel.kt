package com.example.mynit32132b3.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mynit32132b3.models.ResponseItem
import com.example.mynit32132b3.networking.retrofitclient
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DashboardFragmentViewModel: ViewModel() {

    private val _text= MutableStateFlow< List<ResponseItem>>(emptyList())
    val text: StateFlow<List<ResponseItem>> =_text

    init {
        LoadData()
    }

    private fun LoadData(){
        viewModelScope.launch {


            //simulate delay from netword call
            _text.value=retrofitclient.impapiservice.getAllObjects()
        }


    }

}