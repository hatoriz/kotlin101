fun main(){

    //นี่คือ Hippo ของฉัน
    var myhippo = Hippo()
    myhippo.eat()
    myhippo.roam()
    myhippo.makeNoise()
    myhippo.sleep()

    println("")

    //สร้างแมวของเรา
    var mycat = Cat()
    //เขียนให้แมวเรา eat, roam, makenoise, sleep
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()

    println("------- สร้างตัวแปรสุนัข --------")
    // สร้างตัวแปรสุนัข
    var myDog = Dog()
    myDog.eat()
    myDog.roam()
    myDog.makeNoise()
    myDog.sleep()
}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("คลาส Animal กำลัง ส่งเสียงร้อง")
    }

    open fun eat(){
        println("คลาส Animal กำลัง กิน")
    }

    open fun roam(){
        println("คลาส Animal กำลัง เดิน")
    }

    fun sleep(){
        println("คลาส Animal กำลัง นอน")
    }
}

class Hippo : Animal(){

    override val image: String
        get() = "hippo.jpg"

    override val food: String
        get() = "หญ้า"

    override val habitat: String
        get() = "น้ำ"

    override fun makeNoise() {
        println("คลาส Hippo ร้อง ฮิป ฮิป")
    }

    override fun eat() {
        println("Hippo กิน $food")
    }

}

class Cat : Animal(){
    override val image: String
        get() = "cat.jpg"

    override val food = "อาหารแมว"
    override val habitat = "บ้าน"

    override fun makeNoise() {
        println("Meow! Meow!")
    }

    override fun eat() {
        println("The Cat is eating $food")
    }
}

class Dog : Animal(){
    override val image: String
        get() = "dog.jpg"
    override val food: String
        get() = "อาหารสุนัข"
    override val habitat: String
        get() = "บ้านสุนัข"

    override fun makeNoise() {
        println("คลาส Dog ส่งเสียงร้อง โฮ่ง โฮ่ง")
    }

    override fun eat() {
        println("คลาส Dog กิน $food")
    }
}