import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Execute;

@Mojo(name = "level0")
@Execute(goal = "level1")
public class Level0 extends AbstractMojo {
    public void execute() throws MojoExecutionException {
    }
}
