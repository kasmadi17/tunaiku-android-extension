package com.tunaikumobile.extensions

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

/**
 * @author Kasmadi
 * @date 14/11/23
 */
class CalendarExtensionsTest {
    private lateinit var calendar: Calendar

    @Before
    fun setUp() {
        calendar = Calendar.getInstance(Locale.getDefault())
        calendar.time = Date(1699949386577)
    }

    @Test
    fun `get day should show day as 14`() {
        Assert.assertTrue(calendar.getDay() == 14)
    }

    @Test
    fun `get month should show month as Nov`() {
        Assert.assertTrue(calendar.getMonth() == "Nov")
    }

    @Test
    fun `get day of week should show day as Selasa`() {
        Assert.assertTrue(calendar.getDayOfWeek() == "Selasa")
    }

    @Test
    fun `is weekend should assert false`() {
        Assert.assertFalse(calendar.isWeekend(Date(1699949386577)))
    }

    @Test
    fun `is weekend should assert true`() {
        Assert.assertTrue(calendar.isWeekend(Date(1699635600000)))
        Assert.assertTrue(calendar.isWeekend(Date(1699722000000)))
    }
}