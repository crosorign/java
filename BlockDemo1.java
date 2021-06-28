import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockDemo1 {
    static List<BlockDemo1> BlockDemo1chain = new ArrayList<>();
    static int prefix = 4;
    private static final Logger logger = Logger.getLogger(BlockDemo1.class.getName());
    private final String previousHash; // contains previous hash
    private final long timeStamp; // contains timestamp epoch (linux time )
    private String hash; // stores current hash
    private String data; // contains data
    private int nonce; // occurrences

    // initialising the BlockDemo1 of BlockDemo1 chain

    public BlockDemo1(String data, String previousHash, long timeStamp) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        this.hash = calculateBlockDemo1Hash();
    }

    public static void main(String[] args) {
        BlockDemo1 newBlockDemo1 = new BlockDemo1(
                "The is a New BlockDemo1.",
                BlockDemo1chain.get(BlockDemo1chain.size() - 1).getHash(),
                new Date().getTime());
        newBlockDemo1.mineBlockDemo1(prefix);
        BlockDemo1chain.add(newBlockDemo1);
        // Lets execute
    }

    // calculate hash based on the considering BlockDemo1 chain model

    // mine BlockDemo1 until prefix length matches the hash prefix
    public String mineBlockDemo1(int prefix) {
        String prefixString = new String(new char[prefix]).replace('\0', '0');
        while (!hash.substring(0, prefix)
                .equals(prefixString)) {
            nonce++;
            System.out.println(nonce);
            hash = calculateBlockDemo1Hash();
        }
        return hash;
    }

    public String calculateBlockDemo1Hash() {
        String dataToHash = previousHash + timeStamp + nonce + data;
        MessageDigest digest = null;
        byte[] bytes = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            bytes = digest.digest(dataToHash.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        }
        StringBuffer buffer = new StringBuffer();
        for (byte b : bytes) {
            buffer.append(String.format("%02x", b));
        }
        return buffer.toString();
    }

    public String getHash() {
        return this.hash;
    }

    public String getPreviousHash() {
        return this.previousHash;
    }

    public void setData(String data) {
        this.data = data;
    }
}
