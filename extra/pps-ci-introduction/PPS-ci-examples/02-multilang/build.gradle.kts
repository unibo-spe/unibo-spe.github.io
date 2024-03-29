plugins {
    java
    scala
    groovy
    kotlin("jvm") version "1.9.22"
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.codehaus.groovy:groovy:3.0.20")
    implementation(kotlin("stdlib"))
    implementation("org.scala-lang:scala3-library_3:3.4.0")
}
