// library.kt acts as the enitre linked list, containing the head node and passing down commands to the nodes

class library {

    var head:book? = null

    fun add (title:String) {
        if(head==null){
            head = book (title, null)
        } else {
            head!!.add(title, null, this)
        }
    }

    fun remove(titleWith:String) {
        if(head==null){
            println("Library Empty!")
        } else {
            head!!.remove(titleWith, null, this)
        }
    }

    fun print () {
        head?.print()
    }
}