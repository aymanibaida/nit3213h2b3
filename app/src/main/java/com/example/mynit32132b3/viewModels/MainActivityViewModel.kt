package com.example.mynit32132b3.viewModels

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    
    var greetingtext="hello from viewmodel"

    fun loadData(){
        greetingtext="update hello from view model"


    }
}