import redis.clients.jedis.Jedis

//Connect to Redis server on localhost
Jedis jedis = new Jedis("localhost")
println("Connection to server successful")
//check whether server is running or not
println("Hello Redis server. Are you running?: "+jedis.ping())
