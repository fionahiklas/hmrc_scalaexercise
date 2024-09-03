## Overview

Scala version of the Oyster code

## Getting Started

### Installing Scala 

Downloading the following packages

* Scala: From [Scala lang](https://www.scala-lang.org/download/) - specifically scala-2.12.0.tgz 
* Scala Build Tool: From [scala-sbt.org](http://www.scala-sbt.org/download.html) - the all platform sbt-0.13.13.tgz

Uncompressed both of these packages under /opt and added to the PATH using the following command:

```
export PATH=$PATH:/opt/scala-2.12.0/bin:/opt/sbt-launcher-packaging-0.13.13/bin
```


### Creating a build.sbt 

Following the [instructions](http://www.scala-sbt.org/0.13/docs/Basic-Def.html) on the [Scala SBT site](http://www.scala-sbt.org/)


### Creating IntelliJ project

First of all install the Scala language plugin.

Create a new project from sources and select the build.sbt file.

Select a custom SBT and navigate to the installed SBT under /opt


