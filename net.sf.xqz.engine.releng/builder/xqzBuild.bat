for /f "tokens=1-3 delims=:." %%a in ("%time%") do set tstamp=%%a%%b
for /f "tokens=1-3 delims=/." %%a in ("%date%") do set dstamp=%%c%%b%%a

set timestamp=%dstamp%%tstamp%

set eclipseVersion=Ganymede-SR1

set originDir=C:/Users/lucas/workspace-xqz

set rcpProductDir=%originDir%/net.sf.xqz.rcp
set rcpProductFile=xqz.product
set rcpLauncherName=xqz

set rootDir=d:/PDEBuild
set baseDirectory=%rootDir%/Base/%eclipseVersion%
set buildTempDir=%rootDir%/Build
set deliveryDir=%rootDir%/Deliveries
set testDirectory=%rootDir%/Tests
set updateSiteDirectory=%rootDir%/UpdateSite
set updateSiteStagingDir=%buildTempDir%/UpdateSite

set eclipseAutomatedTestHome=%rootDir%/Tests/eclipse-testing

set productBuildDir=%baseDirectory%/eclipse/plugins/org.eclipse.pde.build_3.4.1.R34x_v20080805/scripts/productBuild/

set codeBaseDirectory=%originDir%/

set relengDir=%originDir%/net.sf.xqz.engine.releng

set mapFileName=xqz.map
set mapDirectory=%relengDir%/builder/maps
set mapFilePath=%mapDirectory%/%mapFileName%

set mapsRepository=:pserver:anonymous@smartambient.cvs.sourceforge.net:/cvsroot/smartambient

set eclipseLauncherPath=%baseDirectory%/eclipse/plugins/org.eclipse.equinox.launcher_1.0.101.R34x_v20080819.jar

set pdeScriptsDir=%productBuildDir%/scripts

set javaExe=c:/progra~1/Java/jre6/bin/java

echo %javaExe% -jar %eclipseLauncherPath% -application org.eclipse.ant.core.antRunner -buildfile %productBuildDir%/productBuild.xml -DoriginDir=%originDir% -Dbuilder=%relengDir%/builder -DbaseDir=%baseDirectory% -DproductFile=%rcpProductDir%/%rcpProductFile% -DbuildDir=%buildTempDir% -DdeliveriesDirectory=%deliveryDir% -DtestsDir=%testDirectory% -Dstamp=%timestamp% -DmapDir=%mapDirectory% -DmapFile=%mapFilePath% -DmapFileName=%mapFileName% -DmapsRepoTag=%mapsRepository% -DproductDir=%rcpProductDir% -DlauncherName=%rcpLauncherName% -DcodeBaseDir=%codeBaseDirectory% -DupdateSiteDir=%updateSiteDirectory% -DupdateSiteStagingLocation=%updateSiteStagingDir% -DacmeVersion=1.0.0 -DisNightlyBuild -DeclipseAutomatedTestHome=%eclipseAutomatedTestHome% -DeclipseLauncherPath=%eclipseLauncherPath% -DarchivePrefix=%archivePrefix% -DjavaExe=%javaExe% -Dvm=%javaExe% -Djunit-report-output=%eclipseAutomatedTestHome%/results -Dtimeout=72000
 
%javaExe% -jar %eclipseLauncherPath% -application org.eclipse.ant.core.antRunner -buildfile %productBuildDir%/productBuild.xml -DoriginDir=%originDir% -Dbuilder=%relengDir%/builder -DbaseDir=%baseDirectory% -DproductFile=%rcpProductDir%/%rcpProductFile% -DbuildDir=%buildTempDir% -DdeliveriesDirectory=%deliveryDir% -DtestsDir=%testDirectory% -Dstamp=%timestamp% -DmapDir=%mapDirectory% -DmapFile=%mapFilePath% -DmapFileName=%mapFileName% -DmapsRepoTag=%mapsRepository% -DproductDir=%productBuildDir% -DlauncherName=%rcpLauncherName% -DcodeBaseDir=%codeBaseDirectory% -DupdateSiteDir=%updateSiteDirectory% -DupdateSiteStagingLocation=%updateSiteStagingDir% -DacmeVersion=1.0.0 -DisNightlyBuild -DeclipseAutomatedTestHome=%eclipseAutomatedTestHome% -DeclipseLauncherPath=%eclipseLauncherPath% -DarchivePrefix=%archivePrefix% -DjavaExe=%javaExe% -Dvm=%javaExe% -Djunit-report-output=%eclipseAutomatedTestHome%/results -Dtimeout=72000
 

 
