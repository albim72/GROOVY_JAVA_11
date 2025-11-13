if (this.args.size() == 0) {
    println("usage: groovy iofile.groovy <file>")
    System.exit(1)
}

def path = this.args[0]
def lines = new File(path).readLines().size()
println("Lines: $lines")

//zmienna środowiskowa dla groovy - katalog bin/groovy.bat (Path) -> C:\GROOVY_JAVA_11\groovy-5.0.0\bin
//groovy iofile.groovy test.txt
