class IndeksNilaiMatkul { 
    fun hitungIndeks(nilai: Int?): String { 
        return when (nilai) { 
            in 101..1000 -> "Nilai di luar jangkauan" 
            in 80..100 -> "A" 
            in 70..79 -> "AB" 
            in 60..69 -> "B" 
            in 50..59 -> "BC" 
            in 40..49 -> "C" 
            in 30..39 -> "D" 
            in 0..29 -> "E" 
            null -> "Nilai harus diisi" 
            else -> "Nilai tidak valid" 
        } 
    } 
 
    fun prosesNilai(nilaiArr: Array<Int?>) { 
        for (nilai in nilaiArr) { 
            println(hitungIndeks(nilai)) 
        } 
    } 
} 
 
fun main() { 
    val indeksNilai = IndeksNilaiMatkul() 
    val arrNilai = arrayOf(77, 110, null, 25) 
    indeksNilai.prosesNilai(arrNilai) 
}