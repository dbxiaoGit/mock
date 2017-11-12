package hello;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: x
 * Date: 2017-11-11
 * Time: 21:34
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}