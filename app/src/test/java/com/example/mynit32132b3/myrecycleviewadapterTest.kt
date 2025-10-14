package com.example.mynit32132b3

import com.example.mynit32132b3.UI.recycleview.myrecycleviewadapter
import io.mockk.every
import io.mockk.spyk
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions

class myrecycleviewadapterTest {
   private lateinit var adapter: myrecycleviewadapter
    private val mocknavfun:()-> Unit={}
    private val exampledataset = listOf("item1", "item2", "item3")

    @Before
    fun setup(){
        adapter= spyk(myrecycleviewadapter(exampledataset,mocknavfun))
        every { adapter.notifyDataSetChanged() } returns Unit
    }

    @Test
    fun testgetcount(){

        assertEquals(3,adapter.itemCount)
       // Assertions.assertEquals(1, 1)
    }


}