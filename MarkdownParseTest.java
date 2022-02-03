import static org.junit.Assert.*;

import org.junit.*;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {

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

        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();
        list.add("https://something.com");
        list.add("some-page.html");
        assertEquals(list, links);
    }

    @Test
    public void testfile2Test() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();

        ArrayList<String> links = MarkdownParse.getLinks(contents);

        ArrayList<String> list = new ArrayList<String>();

        list.add("https://something.com");
        list.add("some-page.html");
        assertEquals(list, links);
    }


    @Test
    public void testfile3Test() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();
        assertEquals(list, links);
    }

    @Test
    public void testfile4Test() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();
        assertEquals(list, links);
    }

    @Test
    public void testfile5Test() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();
        list.add("page.com");
        assertEquals(list, links);
    }

    @Test
    public void testfile6Test() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();
        assertEquals(list, links);
    }

    @Test
    public void testfile7Test() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String contents = Files.readString(fileName);
        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();
        assertEquals(list, links);
    }

    @Test
    public void testfile8Test() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        ArrayList <String> links = MarkdownParse.getLinks(contents);
        ArrayList <String> list = new ArrayList<String>();
        list.add("a link on the first line");
        assertEquals(list, links);
    }

}