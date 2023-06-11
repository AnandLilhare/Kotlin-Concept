package objectAndClass

class DVDPlayer(var hasRecorder: Boolean) {



    fun recordDVD() {

        if (hasRecorder) {

            println ("DVD recording")

        }

    }

}



fun main(args: Array<String>) {

    val d = DVDPlayer(true)
    d.recordDVD()

}