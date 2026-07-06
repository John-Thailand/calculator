// Javaプラグインを追加する
// compileJava、processResources、jar、testタスクを自動で追加する
// そしてGradleはJavaプロジェクトとして振る舞う
plugins {
  application
}

application {
  mainClass.set("com.example.calculator.Main")
}

// ライブラリをダウンロードする場所を指定する
repositories {
  mavenCentral()
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// testタスクではJUnit Platform（JUnit5）を使ってください
tasks.named<Test>("test") {
  useJUnitPlatform()
}

tasks.named<JavaCompile>("compileJava") {
  options.isVerbose = true
}

tasks.named<Copy>("processResources") {
  include("**/*.txt")
}

// compileJava -> .javaを.classにコンパイルする
// jar -> .classを.jarにまとめる
tasks.named<Jar>("jar") {
  manifest {
    attributes["Main-Class"] = "com.example.calculator.Main"
  }
  archiveFileName.set("calculator-app.jar")
}
