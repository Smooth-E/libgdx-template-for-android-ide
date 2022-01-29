<p align=center>
  <img src="https://media.discordapp.net/attachments/486869413732155404/937056162971541555/new_icon.png" height=150px width=150px>
  <h1 align=center>Template LibGDX project for AndroidIDE </h1>
</p>

This is a template [LibGDX](libgdx.com) project that you can use to make games and apps with [AndroidIDE](https://github.com/itsaky/AndroidIDE). It contains some minor structure changes in order for IDE to recognise it properly.
1. Gradle wrapper version set to 7.0.2
2. Android implementation module renamed `:android -> :app`
3. Created a sample example for newcomers to get started with LibGDX

Building: `Open AndroidIDE -> Open Existing Project -> Wait until build finishes -> Build Tasks - AssembleDebug`. After that the IDE will generate debug APk located in `project_root/app/build/output/debug`