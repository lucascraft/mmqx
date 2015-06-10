set eclipseVersion=Ganymede-SR1

set rootDir=d:/PDEBuild

set baseDirectory=%rootDir%/Base/%eclipseVersion%

set eclipseLauncherPath=%baseDirectory%/eclipse/plugins/org.eclipse.equinox.launcher_1.0.101.R34x_v20080819.jar

set jreExe=c:/progra~1/java/jre6/bin/java

%jreExe% -jar %eclipseLauncherPath% -application net.sf.xqz.engine.cmdEngine -os win32 -ws win32 -arch x86  -noExit -data d:/tmp/ -console -debug