To replicate issue:

- Run `./mvnw clean install`
- Run `./mvnw clean com.athkalia:module-1:level0 -e`

Error appears:

```
[ERROR] Unsupported phase: null
java.lang.IllegalArgumentException: Unsupported phase: null
    at org.apache.maven.buildcache.LifecyclePhasesHelper.isLaterPhase (LifecyclePhasesHelper.java:131)
    at org.apache.maven.buildcache.LifecyclePhasesHelper.isLaterPhaseThanClean (LifecyclePhasesHelper.java:115)
    at org.apache.maven.buildcache.LifecyclePhasesHelper.getCleanSegment (LifecyclePhasesHelper.java:151)
    at org.apache.maven.buildcache.BuildCacheMojosExecutionStrategy.execute (BuildCacheMojosExecutionStrategy.java:106)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:157)
    at org.apache.maven.lifecycle.internal.MojoExecutor.executeForkedExecutions (MojoExecutor.java:454)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:317)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:172)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:160)
    at org.apache.maven.buildcache.BuildCacheMojosExecutionStrategy.execute (BuildCacheMojosExecutionStrategy.java:132)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:157)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:106)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:74)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:58)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:130)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:304)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:226)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:151)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:854)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:281)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:197)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:566)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:566)
    at org.apache.maven.wrapper.BootstrapMainStarter.start (BootstrapMainStarter.java:53)
    at org.apache.maven.wrapper.WrapperExecutor.execute (WrapperExecutor.java:152)
    at org.apache.maven.wrapper.MavenWrapperMain.main (MavenWrapperMain.java:76)
```
