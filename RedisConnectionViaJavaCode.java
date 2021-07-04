import redis.clients.jedis.Jedis;

public class RedisConnectionViaJavaCode {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost"); // using redis hosted on local machine
        // connection established
        // added steps to host redis on local machine in GIT link please do check
        // 1. Print all keys in redis
        System.out.println(jedis.keys("*"));
        jedis.setex("key1", 60, "value1");
        System.out.println(jedis.keys("*"));
        jedis.setex("key2", 30, "value2");
        printAllValuesInRedis(jedis);


    }

    private static void printAllValuesInRedis(Jedis jedis) {
        for (String key : jedis.keys("*")) {
            System.out.println("key namae =" + key + " data =" + jedis.get(key) );
        }
    }
}
