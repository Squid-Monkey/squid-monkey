import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SquidMonkeySDK {

    // The SDK will always operate on a file named "test.java" in the current directory.
    private static final Path TARGET_FILE = Paths.get("test.java");

    /**
     * Ensures the test.java file exists, creating it if necessary.
     */
    private static void ensureTestFileExists() throws IOException {
        if (!Files.exists(TARGET_FILE)) {
            Files.createFile(TARGET_FILE);
            System.out.println("Created 'test.java' file.");
        }
    }


    public static void showSnippets() {
        System.out.println("Available Snippets:");
        // CHANGED: Path now points to the root of the JAR.
        try (InputStream is = SquidMonkeySDK.class.getResourceAsStream("/templates.index")) {
            if (is == null) {
                System.err.println("❌ Error: Could not find templates.index inside the JAR.");
                return;
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
                reader.lines().forEach(line -> System.out.println("- " + line));
            }
        } catch (IOException e) {
            System.err.println("❌ Error reading templates index: " + e.getMessage());
        }
    }

    /**
     * Injects a snippet by reading it from inside the JAR and appending it to test.java.
     * @param snippetName The name of the snippet to inject.
     */
    public static void injectSnippet(String snippetName) {
        try {
            ensureTestFileExists();
            // CHANGED: Path now points to the root of the JAR.
            String resourcePath = "/" + snippetName + ".txt";
            try (InputStream is = SquidMonkeySDK.class.getResourceAsStream(resourcePath)) {
                if (is == null) {
                    System.err.println("❌ Error: Snippet '" + snippetName + "' not found inside the JAR.");
                    return;
                }
                String content = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                String contentToAppend = "\n" + content + "\n";
                Files.writeString(TARGET_FILE, contentToAppend, StandardOpenOption.APPEND);
                System.out.println("✅ Injected '" + snippetName + "' into " + TARGET_FILE.getFileName());
            }
        } catch (IOException e) {
            System.err.println("❌ Error injecting snippet: " + e.getMessage());
        }
    }

    /**
     * Clears the content of the test.java file and clears the console screen.
     */
    public static void clear() {
        // 1. Clear the file content
        try {
            ensureTestFileExists();
            Files.writeString(TARGET_FILE, ""); // Overwrites the file with an empty string
            System.out.println("✅ Cleared content of " + TARGET_FILE.getFileName());
        } catch (IOException e) {
            System.err.println("❌ Error clearing file: " + e.getMessage());
        }

        // 2. Clear the console screen (OS-dependent)
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            // If clearing the screen fails, it's not a critical error.
            System.out.println("\n------------------------------\n");
        }
    }
}