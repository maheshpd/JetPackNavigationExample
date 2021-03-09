package com.createsapp.hetpacknavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_view_transactions.*

class ViewTransactionsFragment : Fragment(R.layout.fragment_view_transactions) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_test.setOnClickListener {
            val action = ViewTransactionsFragmentDirections
                .actionViewTransactionsFragmentToSendCashFragment("test",200)
            findNavController().navigate(action)
        }
    }
}