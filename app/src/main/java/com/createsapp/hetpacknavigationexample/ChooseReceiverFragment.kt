package com.createsapp.hetpacknavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_choose_receiver.*

class ChooseReceiverFragment : Fragment(R.layout.fragment_choose_receiver) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_next.setOnClickListener {

            val navOption = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopEnterAnim(R.anim.slide_out_right)
                .build()

            val receiverName = et_receiver_name.text.toString()

            val args = Bundle()
            args.putString("name",receiverName)

            val action = ChooseReceiverFragmentDirections
                    .actionChooseReceiverFragmentToSendCashFragment(receiverName,300)

            findNavController().navigate(action)
        }
    }

}