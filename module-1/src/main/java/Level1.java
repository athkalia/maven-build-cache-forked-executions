import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Execute;

@Mojo(name = "level1")
@Execute(goal = "level2")
public class Level1 extends AbstractMojo {
    public void execute() throws MojoExecutionException {
    }
}
