package com.piashcse.hilt_mvvm_compose_movie.ui.screens.bottomnavigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavController
import com.piashcse.hilt_mvvm_compose_movie.ui.screens.HomeScreen
import com.piashcse.hilt_mvvm_compose_movie.ui.screens.viewmodel.HomeViewModel

@ExperimentalFoundationApi
@Composable
fun TopRated(
    navController: NavController,
    viewModel: HomeViewModel,
    isAppBarVisible: MutableState<Boolean>
) {
    HomeScreen(
        navController = navController,
        viewModel = viewModel,
        isAppBarVisible = isAppBarVisible
    )
}