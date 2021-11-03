import services.CandidateService

def candidateService = new CandidateService()

def jedis = candidateService.connectToRedis()
def candidates = [
        ["id":"250", "firstName":"Sofia", "lastName":"Campbell"],
        ["id":"28", "firstName":"Daniel", "lastName":"Payne"],
        ["id":"98", "firstName":"Antony", "lastName":"Edwards"],
        ["id":"1", "firstName":"John", "lastName":"Smith"],
        ["id":"106", "firstName":"Elise", "lastName":"Henderson"],
        ["id":"224", "firstName":"Owen", "lastName":"Allen"],
        ["id":"59", "firstName":"Jasmine", "lastName":"Richards"],
        ["id":"218", "firstName":"Connie", "lastName":"Morrison"],
        ["id":"93", "firstName":"Daryl", "lastName":"Johnston"],
        ["id":"297", "firstName":"Abigail", "lastName":"Thompson"]
]
for(candidate in candidates){
    candidateService.setActiveCandidate(jedis, "activeCandidates", candidate.inspect())
}

println("Finished")



