zdd-annotation
==============

##usage

### eclipse
プロジェクトのプロパティで下記の箇所を設定。

 * Java Compiler -> Annotation Processing
  * Enable Project specific settings : true
  * Enable annotation processing : true
  * Enable processing in editor: true
 * Java Compiler -> Annotation Processing -> Factory Path
  * Enable project specific settings
   * add annotations.jar to plugins list as a "ExternalJARs"

## build
ビルドシステムには、[Gradle](http://www.gradle.org/)を利用しています。  
[wrapper](http://www.gradle.org/docs/current/userguide/userguide_single.html#gradle_wrapper)を用意しているので、以下のコマンドでビルドできます。  
    `gradlew clean build`

Gradle 2.11以降をインストールしている場合、通常のGradleのコマンドも利用できます。  
    `gradle clean build`
