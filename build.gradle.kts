import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml

plugins {
  `java-library`
  id("io.papermc.paperweight.userdev") version "1.7.1"
  id("xyz.jpenilla.run-paper") version "2.3.0"
  id("xyz.jpenilla.resource-factory-bukkit-convention") version "1.1.1"
}

fun capitaliseFirstLetter(string: String): String {
  return string.first().uppercase() + string.slice(IntRange(1, string.length - 1))
}

fun snakecase(kebabCaseString: String): String {
  return kebabCaseString.lowercase().replace('-', '_')
}

fun pascalcase(kebabCaseString: String): String {
  var pascalCaseString = ""

  val splitString = kebabCaseString.split("-")

  for (part in splitString) {
    pascalCaseString += capitaliseFirstLetter(part)
  }

  return pascalCaseString
}

val projectAuthor = "rolyPolyVole"

group = "net." + projectAuthor.lowercase() + "." + snakecase(rootProject.name)
version = "1.0.0-SNAPSHOT"
description = "Adds the Bedrock Edition pose customisation to armour stands as well as allowing base-plate manipulation."

val javaVersion = 21
val paperApiVersion = "1.21"

java {
  toolchain.languageVersion = JavaLanguageVersion.of(javaVersion)
}

dependencies {
  paperweight.paperDevBundle(paperApiVersion + "-R0.1-SNAPSHOT")
}

tasks {
  compileJava {
    options.release = javaVersion
  }

  javadoc {
    options.encoding = Charsets.UTF_8.name()
  }
}

bukkitPluginYaml {
  main = project.group.toString() + "." + pascalcase(rootProject.name)
  load = BukkitPluginYaml.PluginLoadOrder.STARTUP
  authors.add(projectAuthor)
  apiVersion = paperApiVersion
}
