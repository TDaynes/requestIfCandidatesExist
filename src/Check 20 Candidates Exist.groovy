def candidates = [
        ["id":"1", "firstName":"John", "lastName":"Smith"],
        ["id":"2", "firstName":"Deanna", "lastName":"Morgan"],
        ["id":"3", "firstName":"Daniel", "lastName":"Lloyd"],
        ["id":"4", "firstName":"Daryl", "lastName":"Richards"],
        ["id":"5", "firstName":"Kellan", "lastName":"Jones"],
        ["id":"6", "firstName":"Alexia", "lastName":"Mason"],
        ["id":"7", "firstName":"Sam", "lastName":"Brooks"],
        ["id":"8", "firstName":"Clark", "lastName":"Grant"],
        ["id":"9", "firstName":"Paige", "lastName":"Stevens"],
        ["id":"10", "firstName":"Thomas", "lastName":"Moore"],
        ["id":"11", "firstName":"Darcy", "lastName":"Robinson"],
        ["id":"12", "firstName":"Hailey", "lastName":"Riley"],
        ["id":"13", "firstName":"Sawyer", "lastName":"Smith"],
        ["id":"14", "firstName":"Valeria", "lastName":"Dixon"],
        ["id":"15", "firstName":"Savana", "lastName":"Baker"],
        ["id":"16", "firstName":"Melanie", "lastName":"Baker"],
        ["id":"17", "firstName":"Maximilian", "lastName":"Parker"],
        ["id":"18", "firstName":"Spike", "lastName":"Craig"],
        ["id":"19", "firstName":"Valeria", "lastName":"Johnston"],
        ["id":"20", "firstName":"Sophia", "lastName":"Farrell"]
]

// Asynchronously post requests to Check Candidate Exist app endpoint:
import java.util.concurrent.Executors

pool = Executors.newFixedThreadPool( 20 )
(candidates).each { more -> pool.submit {
    doCandidatesExist(more)
} }

def doCandidatesExist(more){
    println("candidate sending - id: "+more.id)
    def html = ("http://localhost:8888/?id="+more.id+"&firstName="+more.firstName+"&lastName="+more.lastName).toURL().text
    println("candidate: "+more+", exists: "+html)
}

