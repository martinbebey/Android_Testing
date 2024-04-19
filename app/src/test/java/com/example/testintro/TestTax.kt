package com.example.testintro

import org.junit.Test
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.runners.Parameterized.AfterParam

/**
 * manually created test class
 */
class TestTax {

    private  lateinit var tax: Tax

    /**
     * runs before the tests
     */
    @Before
    fun setup(){
        tax = Tax()
    }

    /**
     * runs after the tests
     */
    @After
    fun teardown(){

    }

    @Test
    fun calculateTax() {
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncome() {
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90)
    }
}