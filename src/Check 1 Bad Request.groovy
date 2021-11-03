def candidate = ["id":"", "firstName":"", "lastName":""]

println("candidate sending - id: "+candidate.id)
def html = ("http://localhost:8888/?id="+candidate.id+"&firstName="+candidate.firstName+"&lastName="+candidate.lastName).toURL().text
println("candidate: "+candidate+", exists: "+html)
