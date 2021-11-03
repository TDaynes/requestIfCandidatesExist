package services

import redis.clients.jedis.Jedis

class CandidateService {


    def connectToRedis(){
        Jedis jedis = new Jedis("localhost")
        println("Connection to server successful")
        return jedis
    }


    def setActiveCandidate(jedis, tableName, candidate){
        jedis.rpush(tableName, candidate)
        return true
    }


    def getActiveCandidates(jedis, tableName){
        def candidates = jedis.lrange(tableName, 0, 2)
        return candidates
    }


}
