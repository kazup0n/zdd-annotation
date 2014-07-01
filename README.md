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

