class HelloWorld {
    static void main(String[] args) {
        Person johnDoe = new Person("John", "Doe", 40)
        Person maryHill = new Person("Mary", "Hill", 30)
        Person thomasMarks = new Person("Thomas", "Marks", 21)

        // Create a new list of persons
		def allPersons = [johnDoe, maryHill, thomasMarks]

        // Querying Collections
		assert allPersons instanceof List
		assert allPersons.size() == 3
		assert allPersons[2] == thomasMarks

        // Iterate over elements
		allPersons.each {
			println it
		}

        // Iterate over elements and using an index
		allPersons.eachWithIndex { Person entry, int i ->
			println i + ": " + entry
		}

        // Filtering a specific element
		allPersons.find { it.lastName == 'Hill' } == maryHill

        // Transforming elements into something else
		allPersons.collect { it.age <= 30 } == [false, true, true]

        // Sorting elements based on a criterion
		allPersons.sort { it.age } == [thomasMarks, maryHill, johnDoe]
    }
}