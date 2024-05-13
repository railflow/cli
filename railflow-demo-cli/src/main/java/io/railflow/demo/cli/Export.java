package io.railflow.demo.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

/**
 * The {@link Export} class implements the export functionality of the CLI,
 * which exports a test report to TestRail via RailFlow.
 */
@Command(
    name = "export",
    mixinStandardHelpOptions = true,
    version = "export 2.0",
    description = "Export test results to TestRail"
)
public class Export implements Callable<Integer> {

    @Parameters(index = "0", description = "Test report file to export")
    private String file;

    @Option(names = { "--url" }, description = "URL of the TestRail server")
    private String url = "https://testrail.io";

    /**
     * Called to execute the export action.
     *
     * @throws Exception if there was an error.
     */
    @Override
    public Integer call() throws Exception {
        System.out.println("Exporting test results from " + file + " to " + url);
        return 0;
    }

    /**
     * Main entry-point.
     *
     * @param args Command line arguments.
     */
    public static void main(String... args) {
        int exitCode = new CommandLine(new Export()).execute(args);
        System.exit(exitCode);
    }
}
