public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: sqwd <command>");
            System.out.println("Commands: show, clear, <snippet_name>");
            return;
        }

        String command = args[0];

        switch (command.toLowerCase()) {
            case "show":
                SquidMonkeySDK.showSnippets();
                break;
            case "clear":
                SquidMonkeySDK.clear();
                break;
            default:
                // If it's not a known command, assume it's a snippet name
                SquidMonkeySDK.injectSnippet(command);
                break;
        }
    }
}