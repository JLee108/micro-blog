import java.io.UnsupportedEncodingException;

class MicroBlog {
    public String truncate(String input) {
        //take the input string and take the first 5 index's and return it
        if (input.length() > 5) {
            return input.codePoints().limit(5)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        } else {
            return input;
        }
    }
}
