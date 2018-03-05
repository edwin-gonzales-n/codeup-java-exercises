public class ServerNameGenerator {
    String[] adjectives = {"attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "fancy", "fit"};
    String[] nouns = {"man", "mountain", "state", "ocean", "country", "building", "cat", "airline","love", "wealth"};

    public int random(){
        return (int) Math.floor(Math.random()* 9);
    }
    public static void main(String[] args) {
        ServerNameGenerator random = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", random.adjectives[random.random()], random.nouns[random.random()]);
    }
}