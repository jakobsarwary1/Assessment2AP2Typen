interface PlayFetch
open class Pet()
class Dog() : Pet(), PlayFetch
class Cat() : Pet()

// Geben Sie an, ob die folgenden Ausdrücke in Ordnung (OK) sind, einen Compilerfehler (CF)
//oder einen Laufzeitfehler (LF) ergeben. Begründen Sie die Fehler jeweils.

val a : PlayFetch = Pet()
// Compilerfehler: "Pwt" implementiert nicht das interface "PlayFetch"

val b : "Schlafendes Tier"
// Ok: "b" ist ein gültiger String

val c = Dog()
// Ok: "c" ist ein gültiger "Dog" Objekt

val d : Pet = PlayFetch()
// Compilerfehler: "PlayFetch" ist ein Interface und kann nicht instanziiert werden.

val e : Pet = c
// Ok: "c" ist ein "Dog" und "Dog" erbt von "Pet", daher Zuweisung gültig.

val f: Pet = Pet()
// Ok: "f" ist ein gültiges "Pet" Objekt

val g: PlayFetch = f as PlayFetch
// Laufzeitfehler: "f" ist ein "Pet" und "Pet" implimentiert nicht "PlayFetch". Der Cast schlägt zur Laufzeit fehl.

val h: PlayFetch = c
// Ok: c ist ein Dog und Dog implementiert von PlayFetch, daher ist die Zuweisung gültig

val i : Cat = Pet()
// Compilerfehler: pet kann nicht einem cat zugewisen werden, da cat Spezialisierung von pet ist.

val j: Pet = Pet("Lucky")
// Compilerfehler; Der Konstruktor von Pet nimmt keine Argumente