import services.CandidateService

def candidateService = new CandidateService()

def jedis = candidateService.connectToRedis()
def candidates = candidateService.getActiveCandidates(jedis)
for(candidate in candidates){
    println("Candidate: "+candidate)
}
