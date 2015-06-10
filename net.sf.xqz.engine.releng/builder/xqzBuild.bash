timestamp=`date "+%Y%m%d%H%M"`

eclipseVersion=Galileo

originDir=/home/lb/workspace-e4/

rcpProductDir=$originDir/net.sf.xqz.rcp
rcpProductFile=xqz.product
rcpLauncherName=xqz

rootDir=/XQZBuild
baseDirectory=$rootDir/Base/$eclipseVersion
buildTempDir=$rootDir/Build
deliveryDir=$rootDir/Deliveries
testDirectory=$rootDir/Tests
updateSiteDirectory=$rootDir/UpdateSite
updateSiteStagingDir=$buildTempDir/UpdateSite

eclipseAutomatedTestHome=$rootDir/Tests/eclipse-testing

productBuildDir=$baseDirectory/eclipse/plugins/org.eclipse.pde.build_3.5.0.v20090527-1800/scripts/productBuild/

codeBaseDirectory=$originDir/

relengDir=$originDir/net.sf.xqz.engine.releng

mapFileName=xqz.map
mapDirectory=$relengDir/builder/maps
mapFilePath=$mapDirectory/$mapFileName

mapsRepository=:pserver:anonymous@smartambient.cvs.sourceforge.net:/cvsroot/smartambient

eclipseLauncherPath=$baseDirectory/eclipse/plugins/org.eclipse.equinox.launcher_1.0.200.v20090520.jar

pdeScriptsDir=$productBuildDir/scripts

javaExe=/usr/bin/java

echo "$javaExe -jar $eclipseLauncherPath \
 -application org.eclipse.ant.core.antRunner \
 -buildfile $productBuildDir/productBuild.xml \
 -DoriginDir=$originDir \
 -Dbuilder=$relengDir/builder \
 -DbaseDir=$baseDirectory \
 -DproductFile=$rcpProductDir/$rcpProductFile \
 -DbuildDir=$buildTempDir \
 -DdeliveriesDirectory=$deliveryDir \
 -DtestsDir=$testDirectory \
 -Dstamp=$timestamp \
 -DmapDir=$mapDirectory \
 -DmapFile=$mapFilePath \
 -DmapFileName=$mapFileName \
 -DmapsRepoTag=$mapsRepository \
 -DproductDir=$rcpProductDir \
 -DlauncherName=$rcpLauncherName \
 -DcodeBaseDir=$codeBaseDirectory \
 -DupdateSiteDir=$updateSiteDirectory \
 -DupdateSiteStagingLocation=$updateSiteStagingDir \
 -DacmeVersion=1.0.0 \
 -DisNightlyBuild \
 -DeclipseAutomatedTestHome=$eclipseAutomatedTestHome \
 -DeclipseLauncherPath=$eclipseLauncherPath \
 -DarchivePrefix=$archivePrefix \
 -DjavaExe=$javaExe \
 -Dvm=$javaExe \
 -Djunit-report-output=$eclipseAutomatedTestHome/results \
 -Dtimeout=72000"
 
$javaExe -jar $eclipseLauncherPath \
 -application org.eclipse.ant.core.antRunner \
 -buildfile $productBuildDir/productBuild.xml \
 -DoriginDir=$originDir \
 -Dbuilder=$relengDir/builder \
 -DbaseDir=$baseDirectory \
 -DproductFile=$rcpProductDir/$rcpProductFile \
 -DbuildDir=$buildTempDir \
 -DdeliveriesDirectory=$deliveryDir \
 -DtestsDir=$testDirectory \
 -Dstamp=$timestamp \
 -DmapDir=$mapDirectory \
 -DmapFile=$mapFilePath \
 -DmapFileName=$mapFileName \
 -DmapsRepoTag=$mapsRepository \
 -DproductDir=$productBuildDir \
 -DlauncherName=$rcpLauncherName \
 -DcodeBaseDir=$codeBaseDirectory \
 -DupdateSiteDir=$updateSiteDirectory \
 -DupdateSiteStagingLocation=$updateSiteStagingDir \
 -DacmeVersion=1.0.0 \
 -DisNightlyBuild \
 -DeclipseAutomatedTestHome=$eclipseAutomatedTestHome \
 -DeclipseLauncherPath=$eclipseLauncherPath \
 -DarchivePrefix=$archivePrefix \
 -DjavaExe=$javaExe \
 -Dvm=$javaExe \
 -Djunit-report-output=$eclipseAutomatedTestHome/results \
 -Dtimeout=72000
 

 
