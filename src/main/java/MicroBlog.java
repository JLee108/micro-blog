import java.io.UnsupportedEncodingException;

class MicroBlog {
    public String truncate(String input) {
        //take the input string and take the first 5 index's and return it
        if (input.length() > 5) {
            return input.substring(0, 5);
        } else {
            return input;
        }

//matches("[A-Za-z]{1}")
    }
}
