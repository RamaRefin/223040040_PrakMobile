class PersegiPanjang(val panjang: Int, val lebar: Int, val luas: Int, val 
keliling: Int) { 
    fun display() { 
        println("panjang: $panjang") 
        println("Luas: $luas") 
        println("Lebar: $lebar") 
        println("Keliling: $keliling") 
    } 
} 
 
fun main() { 
    val PersegiPanjang = PersegiPanjang(4,8,2,12) 
    PersegiPanjang.display() 
} 