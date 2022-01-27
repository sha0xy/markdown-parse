import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        ArrayList<String> list = new ArrayList<String>();
        list.add("https://something.com");
        list.add("some-page.html");
        assertEquals(list, links);
    }
}