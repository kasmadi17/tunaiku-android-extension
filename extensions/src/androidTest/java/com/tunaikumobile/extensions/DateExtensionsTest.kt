package com.tunaikumobile.extensions


import org.junit.Assert
import org.junit.Test

/**
 * @author Kasmadi
 * @date 15/11/23
 */
class DateExtensionsTest {

    @Test
    fun getDiffDaysTest() {
        val target = "2023-11-15".convertToDate()
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.getDiffDays(target) == 1)
    }

    @Test
    fun getDiffMonthsTest() {
        val target = "2023-12-15".convertToDate()
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.getDiffMonths(target) == 1)
    }

    @Test
    fun getDiffYearsTest() {
        val target = "2024-12-15".convertToDate()
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.getDiffYears(target) == 1)
    }

    @Test
    fun plusDaysTest() {
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.plusOrMinusDays(1) == "2023-11-15")
    }

    @Test
    fun minusDaysTest() {
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.plusOrMinusDays(-1) == "2023-11-13")
    }

    @Test
    fun plusMonthTest() {
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.plusOrMinusMonths(1) == "2023-12-14")
    }

    @Test
    fun minusMonthTest() {
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.plusOrMinusMonths(-1) == "2023-10-14")
    }

    @Test
    fun plusYearTest() {
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.plusOrMinusYears(1) == "2024-11-14")
    }

    @Test
    fun minusYearTest() {
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.plusOrMinusYears(-1) == "2022-11-14")
    }

    @Test
    fun convertToStringTest() {
        val stringDate = "2023-11-14"
        Assert.assertTrue(stringDate.convertToDate().convertToString() == stringDate)

    }

    @Test
    fun changeDateFormatTest() {
        val date = "2023-11-14".convertToDate()
        Assert.assertTrue(date.changeDateFormat("dd/MM/yyyy") == "14/11/2023".convertToDate("dd/MM/yyyy"))

    }
}