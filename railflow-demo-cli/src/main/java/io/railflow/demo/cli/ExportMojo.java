package io.railflow.demo.cli;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * The {@link ExportMojo} class implements a Maven plugin that runs the {@link Export} CLI target.
 */
@Mojo(name = "export")
public class ExportMojo extends AbstractMojo {

    /**
     * ALM URL.
     */
    @Parameter(property = "url", required = true)
    private String url;

    /**
     * Test report file to upload.
     */
    @Parameter(property = "file", required = true)
    private String file;

    /**
     * Called to execute the Maven plugin.
     *
     * @throws MojoExecutionException if there was an execution failure.
     * @throws MojoFailureException if there was an execution failure.
     */
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        Export.main("--url=" + url, file);
    }
}
