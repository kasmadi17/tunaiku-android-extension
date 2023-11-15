package com.tunaikumobile.extensions

import org.joda.time.DateTime
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @author Kasmadi
 * @date 14/11/23
 */
class CalendarExtensionsTest {
    private lateinit var dateTime: DateTime

    @Before
    fun setUp() {
        val date = "2023-11-14".convertToDate()
        dateTime = DateTime(date)
    }

    @Test
    fun getShortMontTest() {
        Assert.assertTrue(dateTime.getShortMonth() == "Nov")
    }

    @Test
    fun getDayAsTextTest() {
        Assert.assertTrue(dateTime.getDayAsText() == "Selasa")
    }

    @Test
    fun isWeekendReturnFalse() {
        Assert.assertFalse(dateTime.isWeekend())
    }

    @Test
    fun isWeekendReturnTrue() {
        val date1 = DateTime("2023-11-11".convertToDate())
        val date2 = DateTime("2023-11-12".convertToDate())
        Assert.assertTrue(date1.isWeekend())
        Assert.assertTrue(date2.isWeekend())
    }
}