package com.tunaikumobile.extensions

import org.junit.Assert
import org.junit.Test
import java.util.Date

/**
 * @author Kasmadi
 * @date 14/11/23
 */
class StringExtensionTest {
    @Test
    fun convertStringToDateTest() {
        val stringDate = "14/11/2023"
        val expected = Date(1699894800000)
        Assert.assertTrue(stringDate.convertToDate(pattern = "dd/MM/yyyy") == expected)
    }
}