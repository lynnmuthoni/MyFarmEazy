package com.example.myfarmeazy.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myfarmeazy.fragments.FriendsFragment
import com.example.myfarmeazy.fragments.GroupFragment

class FragmentPageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
       return 2
    }

    override fun createFragment(position: Int): Fragment {
      return if (position==0)
          FriendsFragment()
        else
            GroupFragment()
    }

}