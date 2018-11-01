# MechLaunch2019
2019 Mech Cadets robot code

## Setup
* ### Windows
	* make sure you have git set up (TODO: improve)
	* clone the repository into your directory of choice
		* to use SSH, run `git clone git@github.com:TEAM4456/MechLaunch2019.git`
		* to use HTTPS, run `git clone https://github.com/TEAM4456/MechLaunch2019.git`
	* change directory to `MechLaunch2019/`
	* run `gradlew.bat` (if using CMD) or `./gradlew` (if using PowerShell)
	* set up the project for your editor/IDE
		* for IntelliJ IDEA
			* select "Check out/Project from Version Control" and select "Git"
			* click "Log in to GitHub"
			* log in, and select "MechLaunch2019"
			* when IntelliJ IDEA asks to import Gradle project, select yes
		* for VS Code
			* --TODO--
* ### Linux
	* make sure you have git set up (TODO: improve)
	* clone the repository into your directory of choice
		* to use SSH, run `git clone git@github.com:TEAM4456/MechLaunch2019.git`
		* to use HTTPS, run `git clone https://github.com/TEAM4456/MechLaunch2019.git`
	* change directory to `MechLaunch2019/`
	* run `./gradlew` to get all of the necessary dependencies automatically
	* set up the project for your editor/IDE
		* for IntelliJ IDEA
			* select "Check out/Project from Version Control" and select "Git"
			* click "Log in to GitHub"
			* log in, and select "MechLaunch2019"
			* when IntelliJ IDEA asks to import Gradle project, select yes
		* for VS Code
			* --TODO--
		* for vim, emacs, nano, or whatever you prefer
			* you should know what you're doing
			* just don't commit your editor-specific files
				* add them to the .gitignore if you need to

## Style Conventions
* ### Indentation
	* tab characters are used for block indentation
		```
		if (true) {
			System.out.println("Tabs are configurable!");
			while (foo == bar) {
				System.out.println("Hooray for tabs!");
			}
		}
		```
	* spaces (**without tab characters**) are used for aligning text
		```
		doTheVeryComplicatedThing("The parameters can be long sometimes",
		                          "so breaking parameters across lines",
		                          "can improve readability", "hooray!");
		```
		* if you encounter issues with this, please notify the Programming Chief
	* these conventions ensure that indentation is consistent and configurable, and that text is always aligned
* ### Naming
	* variables use lowerCamelCase
	* objects use UpperCamelCase
	* constants use UPPER_SNAKE_CASE
	* enums use UpperCamelCase, and enum values use UPPER_SNAKE_CASE
		```
		public enum ExampleEnum {
			FOO, BAR, EXAMPLE_WOW
		}
		```
	* methods (functions) use lowerCamelCase
	* parameters use lowerCamelCase
* ### Inlining
	* there are no formal rules on when to inline code, so best judgement should be used
* ### Enforcement
	* the Programming Chief may modify code as they see fit in order to conform to the style conventions
