package de.strasser.peter.aopkotlinanybug

import org.springframework.stereotype.Service

@Service
class AopAnyExample {

    fun failsBecauseOfAny(){
        println("fail!")
    }

    fun worksBecauseOfNullable(){
        println("success!")
    }
}