eclipseVersion=Ganymede-SR1

rootDir=/XQZBuild

baseDirectory=$rootDir/Base/$eclipseVersion

eclipseLauncherPath=$baseDirectory/eclipse/plugins/org.eclipse.equinox.launcher_1.0.101.R34x_v20080819.jar

jreExe=/usr/bin/java

$jreExe -jar $eclipseLauncherPath \
-application net.sf.xqz.engine.cmdEngine \
-os macosx -ws carbon -arch ppc \
-Declipse.application.registerDescriptors=true -Declipse.ignoreApp=false \
-noExit \
-data /tmp/ \
-console \
-debug