//Brenan Marenger
//Android Programming: PG1
//Date: 2/7/23

// main.kt will initialize a new library, then allow the user to access it with a list of commands
// commands include: add, remove, print, and exit. 
// e.g. add "Harry Potter", remove "Pott", print, eExIt

fun main () {

	var myLibrary = library ()

	while(true){
		println ("Enter a command: ")
		var command = readLine()
		
		if(command!!.startsWith("exit", true)){
			break;
		} else if (command.startsWith("add", true) && command.length > 3){
			if(command[3] == ' '){
				command = command.removeRange(0, 4)
				command = command.replace("\"", "")
				if(!command.isNullOrEmpty()){
					println("Adding ${command}...")
					myLibrary.add(command)
				}
			}
			
		} else if (command.startsWith("remove", true) && command.length > 6) {
			if(command[6] == ' '){
				command = command.removeRange(0, 7)
				command = command.replace("\"", "")
				
				println("Removing all books with ${command}")
				myLibrary.remove(command)
				
			}
		} else if (command.startsWith("print", true)) {
			println("Printing all book titles...")
			myLibrary.print()

		} else {
			println("Invalid Input")
		}
	}
}