import java.util.Scanner

def hitungLuasLingkaran(double jariJari) {
    return Math.PI * jariJari * jariJari
}

def hitungKelilingLingkaran(double jariJari) {
    return 2 * Math.PI * jariJari
}

def scanner = new Scanner(System.in)
print "Masukkan jari-jari lingkaran: "
def jariJari = scanner.nextDouble()

def luas = hitungLuasLingkaran(jariJari)
def keliling = hitungKelilingLingkaran(jariJari)

println "Luas lingkaran: ${String.format('%.2f', luas)}"
println "Keliling lingkaran: ${String.format('%.2f', keliling)}"
