package com.example.jetpackcomposeexample.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.jetpackcomposeexample.common.model.ContentModel

class HomeViewModel : ViewModel() {

    fun getContentList(): ArrayList<ContentModel> {
        return arrayListOf<ContentModel>().apply {
            add(ContentModel(1, "Cube with text"))
            add(ContentModel(2, "ListView with LazyColumn and items"))
            add(ContentModel(3, "Colorful clickable cube"))
            add(ContentModel(4, "Decorated Text"))
            add(ContentModel(5, "Big text with rounded corner border view"))
            add(ContentModel(6, "Rounded corner image with text"))
            add(ContentModel(7, "Big text in square view"))
            add(ContentModel(8, "Horizontal Text with similar space around"))
            add(ContentModel(9, "Vertical Text with similar space around"))
            add(ContentModel(10, "Scrollable horizontal text"))
            add(ContentModel(11, "Custom font family for text"))
            add(ContentModel(12, "Text selection and customization"))
            add(ContentModel(13, "Expandable Views"))
            add(ContentModel(14, "Text Fields"))
            add(ContentModel(15, "Custom google button"))
            add(ContentModel(16, "Password text field"))
            add(ContentModel(17, "Gradient buttons"))
            add(ContentModel(18, "Indian flags"))
            add(ContentModel(19, "Simple alert dialog"))
        }
    }
}