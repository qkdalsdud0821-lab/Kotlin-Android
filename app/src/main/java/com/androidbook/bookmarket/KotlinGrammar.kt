package com.androidbook.bookmarket

import android.util.Log

object KotlinGrammar {

    fun runAll() {
        variable()
        dataType()
        typeCasting()
        operator()
        ifControl()
        whenControl()
        loopControl()
        function()
        oop()
        collection()
        nullSafety()
        scopeFunction()
    }

    // 02 변수 (코드 2-1, 2-2)
    private fun variable() {
        var myAge = 20
        myAge = 25
        Log.d("코틀린 : 가변 변수 var ", "나의 나이는 " + myAge)

        val myName = "홍길동"
        val age: Int = 25
        // myName = "홍길순"   // 오류: val 변수는 값을 변경할 수 없음
        Log.d("코틀린: 불변 변수 val ", "나의 이름은 " + myName)
    }

    // 02 자료형 (코드 2-3 ~ 2-8)
    private fun dataType() {
        var numOne = 1
        var numTwo = 3000000000
        var myByte: Byte = 1
        var myInt: Int = 20
        var myLong = 25L
        Log.d("코틀린 : 정수 자료형 ", "Int : " + numOne)
        Log.d("코틀린 : 정수 자료형 ", "Long : " + numTwo)
        Log.d("코틀린 : 정수 자료형 ", "Byte : " + myByte)
        Log.d("코틀린 : 정수 자료형 ", "Int : " + myInt)
        Log.d("코틀린 : 정수 자료형 ", "Long : " + myLong)

        var myFloat = 30.2F
        var myDouble = 35.4
        Log.d("코틀린 : 실수 자료형 ", "Float :  " + myFloat)
        Log.d("코틀린 : 실수 자료형 ", "Double :  " + myDouble)

        var myBoolean: Boolean = true
        Log.d("코틀린 : 부울린 자료형 ", "Boolean :  " + myBoolean)

        var myChar1: Char = 'K'
        var myChar2: Char = 'o'
        var myChar3: Char = 't'
        var myChar4: Char = 'l'
        var myChar5: Char = 'i'
        var myChar6: Char = 'n'
        Log.d("코틀린 : 문자 자료형 ", "Char : " + myChar1 + myChar2 + myChar3
                + myChar4 + myChar5 + myChar6)

        var myString1: String = "Kotlin\n"
        var myString2: String = "Java"
        Log.d("코틀린 : 문자열 자료형 ", "String : " + myString1)
        Log.d("코틀린 : 문자열 자료형 ", "String : " + myString2)

        var myArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
        Log.d("코틀린 : 배열 자료형 ", "배열의 3번째 값 : " + myArray[2])
    }

    // 02 형 변환 (코드 2-9, 2-10)
    private fun typeCasting() {
        var myX: Int = 100
        // var myY: Long = myX   // 오류 발생 (코드 2-9)
        var myY: Long = myX.toLong()
        Log.d("코틀린 : 자료형 변환 ", "Int : " + myX)
        Log.d("코틀린 : 자료형 변환 ", "Long : " + myY)
    }

    // 03 연산자 (코드 2-11 ~ 2-15)
    private fun operator() {
        var x: Int = 4
        var y: Int = 2
        Log.d("코틀린 : 산술 연산자 ", "x + y = " + (x + y))
        Log.d("코틀린 : 산술 연산자 ", "x - y = " + (x - y))
        Log.d("코틀린 : 산술 연산자 ", "x / y = " + (x / y))
        Log.d("코틀린 : 산술 연산자 ", "x * y = " + (x * y))
        Log.d("코틀린 : 산술 연산자 ", "x % y = " + (x % y))

        Log.d("코틀린 : 비교 연산자 ", "x > y = " + (x > y))
        Log.d("코틀린 : 비교 연산자 ", "x < y = " + (x < y))
        Log.d("코틀린 : 비교 연산자 ", "x >= y = " + (x >= y))
        Log.d("코틀린 : 비교 연산자 ", "x <= y = " + (x <= y))
        Log.d("코틀린 : 비교 연산자 ", "x == y = " + (x == y))
        Log.d("코틀린 : 비교 연산자 ", "x != y = " + (x != y))

        x = 5
        y = 10
        y += x
        Log.d("코틀린 : 할당 연산자 ", "y += x => y = " + y)
        y -= x
        Log.d("코틀린 : 할당 연산자 ", "y -= x => y = " + y)
        y *= x
        Log.d("코틀린 : 할당 연산자 ", "y *= x => y = " + y)
        y /= x
        Log.d("코틀린 : 할당 연산자 ", "y /= x => y = " + y)
        y %= x
        Log.d("코틀린 : 할당 연산자 ", "y %= x => y = " + y)

        x = 1
        Log.d("코틀린 : 증감 연산자 ", "++x = " + (++x))
        Log.d("코틀린 : 증감 연산자 ", "--x = " + (--x))

        var a: Boolean = true
        var b: Boolean = false
        Log.d("코틀린 : 논리 연산자 ", "x && y = " + (a && b))
        Log.d("코틀린 : 논리 연산자 ", "x || y = " + (a || b))
        Log.d("코틀린 : 논리 연산자 ", "!y = " + (!b))
    }

    // 04 조건문 - if (코드 2-16 ~ 2-19)
    private fun ifControl() {
        var num: Int = 3
        if (num > 0) {
            Log.d("코틀린 : if 조건문 ", "숫자 " + num + "은 양수")
        }

        num = 10
        if (num % 2 == 0) {
            Log.d("코틀린 : if-else 조건문 ", "숫자 " + num + "은 짝수")
        } else {
            Log.d("코틀린 : if-else 조건문 ", "숫자 " + num + "은 홀수")
        }

        num = -10
        var result: String
        if (num > 0) {
            result = "숫자 " + num + "은 양수"
        } else if (num == 0) {
            result = "숫자 " + num + "은 0"
        } else {
            result = "숫자 " + num + "은 음수"
        }
        Log.d("코틀린 : if-else if 조건문 ", result)

        if (num > 0) {
            if (num % 2 == 0) {
                result = "숫자 " + num + "은 양수이고 짝수"
            } else {
                result = "숫자 " + num + "은 양수이고 홀수"
            }
        } else {
            if (num % 2 == 0) {
                result = "숫자 " + num + "은 음수이고 짝수"
            } else {
                result = "숫자 " + num + "은 음수이고 홀수"
            }
        }
        Log.d("코틀린 : 중첩 if 조건문 ", result)
    }

    // 04 조건문 - when (코드 2-20)
    private fun whenControl() {
        var day: Int = 2
        var result: String
        when (day) {
            1 -> result = "Monday"
            2 -> result = "Tuesday"
            3 -> result = "Wednesday"
            4 -> result = "Thursday"
            5 -> result = "Friday"
            6 -> result = "Saturday"
            7 -> result = "Sunday"
            else -> result = "Invalid day"
        }
        Log.d("코틀린 : when 조건문 ", result)
    }

    // 05 반복문 (코드 2-21 ~ 2-26)
    private fun loopControl() {
        for (i in 1..5) {
            Log.d("코틀린 : for 반복문 ", "반복 변수 : " + i)
        }
        for (i in 5 downTo 1) {
            Log.d("코틀린 : for 반복문 ", "반복 변수 : " + i)
        }
        for (i in 5 downTo 1 step 2) {
            Log.d("코틀린 : for 반복문 ", "반복 변수 : " + i)
        }

        var numbers = arrayOf(1, 2, 3, 4, 5)
        for (i in numbers) {
            if (i % 2 == 1) {
                Log.d("코틀린 : for 반복문 ", "반복 변수 : " + i)
            }
        }
        for (i in numbers.indices) {
            Log.d("코틀린 : for 반복문 ", "반복 변수 : " + numbers[i])
        }

        var i = 0
        while (i <= 5) {
            Log.d("코틀린 : while 반복문 ", "반복 변수 : " + i)
            i++
        }
    }

    // 06 함수 (코드 2-27 ~ 2-31)
    private fun function() {
        var num1 = 3
        var num2 = 5
        var result = mul(num1, num2)
        Log.d("코틀린 : 사용자 정의 함수 ", "$num1 * $num2 = $result")

        result = mulDefault(num1)
        Log.d("코틀린 : 사용자 정의 함수 ", "$num1 * 5 = $result")

        mulUnit(num1, num2)

        result = mul(a = 3, b = 5)
        Log.d("코틀린 : 사용자 정의 함수 ", "3 * 5 = $result")

        var n1 = 26
        var n2 = 3
        var remResult = n1.rem(n2)
        Log.d("코틀린 : 표준 라이브러리 함수 ", "$n1 % $n2 = $remResult")
    }

    private fun mul(a: Int, b: Int): Int {
        var number = a * b
        return number
    }

    private fun mulDefault(a: Int, b: Int = 5): Int {
        var number = a * b
        return number
    }

    private fun mulUnit(a: Int, b: Int): Unit {
        var number = a * b
        Log.d("코틀린 : 사용자 정의 함수 ", "$a * $b = $number")
    }

    // 07 객체 지향 프로그래밍 (코드 2-33 ~ 2-39)
    private fun oop() {
        var myObj = Member()
        myObj.name = "홍길동"
        myObj.age = 20
        myObj.gender = 'M'
        myObj.printMemberInfo()

        var myEmp = Employee(202201, "홍길순")
        var myPerson = Person("홍길순", 20)

        val myAnimal = Animal()
        val myDog = Dog()
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Animal 클래스: ${myAnimal.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog.sound()}")

        val myDog2 = Dog2()
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog2.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog2.sleep()}")

        val myDog3 = Dog3()
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog3.sound()}")

        val myDog4 = Dog4()
        myDog4.printNames()
        myDog4.callSoundMethods()
    }

    // 08 컬렉션 (코드 2-40, 2-41)
    private fun collection() {
        val lists = listOf("월요일", "화요일", "수요일", "목요일", "금요일")
        val sets = setOf(1, 2, 2, 3, 3, 3, "Java", "Java", "Kotlin")
        val maps = mapOf(1 to "Java", 2 to "Kotlin", 3 to "Android")

        Log.d("코틀린 : 컬렉션", "불변 리스트: $lists")
        Log.d("코틀린 : 컬렉션", "첫 번째 요일: ${lists[0]}")
        Log.d("코틀린 : 컬렉션", "불변 셋: $sets")
        Log.d("코틀린 : 컬렉션", "셋에 'Java' 포함 여부: ${"Java" in sets}")
        Log.d("코틀린 : 컬렉션", "불변 맵: $maps")
        Log.d("코틀린 : 컬렉션", "맵에서 key 2에 해당하는 값: ${maps[2]}")
        // lists.add("토요일")   // 오류: unresolved reference
        // sets.add("Swift")     // 오류
        // maps[1] = "C#"        // 오류

        val mLists = mutableListOf("월요일", "화요일", "수요일", "목요일", "금요일")
        val mSets = mutableSetOf(6, 10)
        val mMaps = mutableMapOf(1 to "Java", 2 to "Kotlin", 3 to "Android")

        Log.d("코틀린 : 컬렉션", "초기 리스트: $mLists")
        Log.d("코틀린 : 컬렉션", "초기 셋: $mSets")
        Log.d("코틀린 : 컬렉션", "초기 맵: $mMaps")

        mLists[0] = "일요일"
        mLists.add("토요일")
        mSets.add(2)
        mSets.add(5)
        mMaps[1] = "C#"
        mMaps[4] = "C++"

        Log.d("코틀린 : 컬렉션", "변경 후 ---------------")
        Log.d("코틀린 : 컬렉션", "변경된 리스트: $mLists")
        Log.d("코틀린 : 컬렉션", "변경된 셋: $mSets")
        Log.d("코틀린 : 컬렉션", "변경된 맵: $mMaps")
    }

    // 09 널 처리 (108~110쪽)
    private fun nullSafety() {
        val name: String? = "John"
        val length = name?.length
        Log.d("코틀린 : 널 처리", "name?.length = $length")

        val nullName: String? = null
        val length2 = nullName?.length
        Log.d("코틀린 : 널 처리", "null?.length = $length2")

        val length3 = nullName?.length ?: 0
        Log.d("코틀린 : 널 처리", "엘비스 연산자 결과 = $length3")

        // val length4 = nullName!!.length   // NullPointerException 발생 (앱이 종료되므로 주석 처리)

        name?.let {
            Log.d("코틀린 : 널 처리", "이름의 길이는 ${it.length}입니다.")
        }
    }

    // 10 기초 스코프 함수 (111~113쪽)
    private fun scopeFunction() {
        val letName: String? = "Kotlin"
        letName?.let {
            Log.d("코틀린 : 스코프 함수", "let: 이름의 길이는 ${it.length}입니다.")
        }

        val runName: String? = "Hello, Kotlin"
        val messageLength = runName?.run {
            Log.d("코틀린 : 스코프 함수", "run: 이름은 $this 입니다.")
            length
        }
        Log.d("코틀린 : 스코프 함수", "run: 길이: $messageLength")

        val withResult = with(StringBuilder()) {
            append("Hello, ")
            append("Kotlin!")
            toString()
        }
        Log.d("코틀린 : 스코프 함수", "with: $withResult")

        val person = Member().apply {
            name = "John"
            age = 25
        }
        Log.d("코틀린 : 스코프 함수", "apply: ${person.name}")

        val number = mutableListOf(1, 2, 3).also {
            Log.d("코틀린 : 스코프 함수", "also: 리스트의 크기: ${it.size}")
            it.add(4)
        }
        Log.d("코틀린 : 스코프 함수", "also: $number")
    }
}

// 코드 2-32 클래스 선언
class Member {
    var name: String = ""
    var age: Int = 0
    var gender: Char = 'M'

    fun printMemberInfo() {
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Member 이름 : $name")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Member 나이 : $age")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Member 성별 : $gender")
    }
}

// 코드 2-34 기본 생성자
class Employee(empId: Int, empName: String) {
    val id: Int
    var name: String

    init {
        id = empId
        name = empName
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Employee 아이디: $id")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Employee 이름 : $name")
    }
}

// 코드 2-35 보조 생성자
class Person {
    var name: String
    var age: Int

    init {
        println("기본 생성자 초기화")
    }

    constructor(pname: String, page: Int) {
        this.name = pname
        this.age = page
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Person 이름: $name")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Person 나이 : $age")
    }
}

// 코드 2-36 상속
open class Animal {
    open fun sound(): String {
        return "동물이 소리를 낸다"
    }
}

class Dog : Animal() {
    override fun sound(): String {
        return "멍멍"
    }
}

// 코드 2-37 인터페이스
interface Animal2 {
    fun sound(): String
    fun sleep(): String {
        return "잠을 잔다"
    }
}

class Dog2 : Animal2 {
    override fun sound(): String {
        return "멍멍"
    }
}

// 코드 2-38 추상 클래스
abstract class Animal3 {
    abstract fun sound(): String
}

class Dog3 : Animal3() {
    override fun sound(): String {
        return "멍멍"
    }
}

// 코드 2-39 super와 this
open class Animal4 {
    open val name: String = "동물"

    open fun sound(): String {
        return "동물 소리"
    }

    constructor() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "Animal4 생성자 호출")
    }
}

class Dog4 : Animal4 {
    override val name: String = "강아지"

    override fun sound(): String {
        return "멍멍!"
    }

    fun printNames() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "this.name = ${this.name}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "super.name = ${super.name}")
    }

    fun callSoundMethods() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "this.sound() 호출 결과: ${this.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "super.sound() 호출 결과: ${super.sound()}")
    }

    constructor() : super() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 생성자 호출")
    }
}