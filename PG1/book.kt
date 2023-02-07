// book.kt represents each linked list node, containing the title and the next node
// All methods within preform recursively, maintaining a non-case-sensitive, alphabetical order

class book (t:String, n:book?) {

    var title = t
    var next = n
    
    fun print () {
        println(title)
        next?.print()
    }


    fun add (t:String, prev:book?, L:library) {
        if(t.lowercase() == title.lowercase()){
            println("Duplicate")
            return;
        }
        if(t.lowercase() < title.lowercase()) {
            if(prev!=null){
                prev.next = book (t, this)
            } else {
                L.head = book (t, this)
            }
        } else {
            if(next==null){
                next = book(t,null)
            } else {
                next!!.add(t, this, L)
            }
        }
    }

    fun remove(t:String, prev:book?, L:library){
        if(next!=null){
            next!!.remove(t, this, L)
        }
        if(title.contains(t, ignoreCase = true)){
             println("${title} contains ${t}, removing...")
            if(prev != null){
                prev.next = next
            } else { 
                L.head = next
            }
        }
        
    }
}