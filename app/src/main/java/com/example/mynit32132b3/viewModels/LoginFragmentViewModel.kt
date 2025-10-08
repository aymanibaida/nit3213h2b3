package com.example.mynit32132b3.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mynit32132b3.networking.retrofitclient
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginFragmentViewModel: ViewModel() {

    private val _text= MutableStateFlow<String>("Initial text")
    val text: StateFlow<String> =_text

    init {
        LoadData()
    }

    private fun LoadData(){
        viewModelScope.launch {


            //simulate delay from netword call
            delay(10000)
            _text.value=retrofitclient.impapiservice.getAllObjects().toString()
        }


    }

}