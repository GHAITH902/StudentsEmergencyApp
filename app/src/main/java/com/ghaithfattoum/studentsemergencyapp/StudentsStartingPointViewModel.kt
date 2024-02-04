package com.ghaithfattoum.studentsemergencyapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentsStartingPointViewModel : ViewModel() {

    private val _event = MutableLiveData<UiEvent>()
    internal val event: LiveData<UiEvent> = _event

    sealed class UiEvent {
        object NotificationSentSuccessfully : UiEvent()

        object FailedSendingNotification : UiEvent()
    }
}