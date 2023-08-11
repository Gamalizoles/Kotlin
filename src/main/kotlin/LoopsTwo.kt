fun main(args: Array<String>) {
    var names = arrayListOf("Steve", "Austin", "Kerubo")
    for (i in 0..5){
        println(i)
        if (i==3)
            for (jina in names){
                println(jina)
            }
    }

}