package de.strasser.peter.aopkotlinanybug

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AopKotlinAnyBugApplicationTests {

    @Autowired
    private lateinit var aopAnyExample: AopAnyExample

    @Test
    fun `should fail because aspect has non-nullable return type`() {
        assertThrows<NullPointerException> { aopAnyExample.failsBecauseOfAny() }
    }

    @Test
    fun `should succeed because aspect has nullable return type`() {
        aopAnyExample.worksBecauseOfNullable()
    }
}
