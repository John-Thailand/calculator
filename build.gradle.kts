// Javaプラグインを追加する
// compileJava、processResources、jar、testタスクを自動で追加する
// そしてGradleはJavaプロジェクトとして振る舞う
plugins {
  java
}

// ライブラリをダウンロードする場所を指定する
repositories {
  mavenCentral()
}

// compileJava -> .javaを.classにコンパイルする
// jar -> .classを.jarにまとめる
tasks.named<Jar>("jar") {
  manifest {
    attributes["Main-Class"] = "com.example.calculator.Main"
  }
}
