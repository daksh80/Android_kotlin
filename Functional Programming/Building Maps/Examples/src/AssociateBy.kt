// BuildingMaps/AssociateBy.kt
import buildingmaps.*
import atomictest.eq

fun main() {
  val map: Map<String, Person> =
    people().associateBy { it.name }
  map eq mapOf(
    "Alice" to Person("Alice", 21),
    "Arthricia" to Person("Arthricia", 15),
    "Bob" to Person("Bob", 25),
    "Bill" to Person("Bill", 25),
    "Birdperson" to Person("Birdperson", 42),
    "Charlie" to Person("Charlie", 21),
    "Crocubot" to Person("Crocubot", 42),
    "Franz" to Person("Franz", 21),
    "Revolio" to Person("Revolio", 33))
}

// output
//include patterns:
//exclude patterns:
//{Alice=Person(name=Alice, age=21), Arthricia=Person(name=Arthricia, age=15), Bob=Person(name=Bob, age=25), Bill=Person(name=Bill, age=25), Birdperson=Person(name=Birdperson, age=42), Charlie=Person(name=Charlie, age=21), Crocubot=Person(name=Crocubot, age=42), Franz=Person(name=Franz, age=21), Revolio=Person(name=Revolio, age=33)}
//Class transformation time: 0.154546544s for 190 classes or 8.134028631578947E-4s per class


//
//AssociatedBy:- Returns a map containing the element from the given sequence indexed by the key retured from
//        keySelector function applied to each element
//
//        :- if any two elements would have the same key returned by keySelector the last one get added to the map
//        :- the retuned map preservs the enetry interation order of the original sequence

