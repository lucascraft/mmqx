timestamp=`date "+%Y%m%d%H%M"`

eclipseVersion=Eclipse3.5M4

rcpProductDir=/Users/lb/Documents/workspace-xqz-fwk/net.sf.xqz.rcp
rcpProductFile=xqz.product
rcpLauncherName=xqz

rootDir=/XQZBuild
baseDirectory=$rootDir/Base/$eclipseVersion
buildTempDir=$rootDir/Build
deliveryDir=$rootDir/Deliveries
testDirectory=$rootDir/Tests
updateSiteDirectory=$rootDir/UpdateSite
updateSiteStagingDir=$buildTempDir/UpdateSite

productBuildDir=$baseDirectory/eclipse/plugins/org.eclipse.pde.build_3.5.0.v20081210/scripts/productBuild/

codeBaseDirectory=/Users/lb/Documents/workspace-xqz-fwk/

relengDir=/Users/lb/Documents/workspace-xqz-fwk/net.sf.xqz.engine.releng

mapDirectory=$relengDir/builder/maps
mapFilePath=$mapDirectory/xqz.map
mapsRepository=:pserver:anonymous@smartambient.cvs.sourceforge.net:/cvsroot/smartambient

pdeScriptsDir=$productBuildDir/scripts

javaExe=/usr/bin/java

echo "$javaExe -jar $baseDirectory/eclipse/plugins/org.eclipse.equinox.launcher_1.0.200.v20081201-1815.jar \
 -application org.eclipse.ant.core.antRunner \
 -buildfile $productBuildDir/productBuild.xml \
 -Dbuilder=$relengDir/builder \
 -DbaseDir=$baseDirectory \
 -DproductFile=$rcpProductDir/$rcpProductFile \
 -DbuildDir=$buildTempDir \
 -DdeliveriesDirectory=$deliveryDir \
 -DtestsDir=$testDirectory \
 -Dstamp=$timestamp \
 -DmapDir=$mapDirectory \
 -DmapFile=$mapFilePath \
 -DmapsRepoTag=$mapsRepository \
 -DproductDir=$rcpProductDir \
 -DlauncherName=$rcpLauncherName \
 -DcodeBaseDir=$codeBaseDirectory \
 -DupdateSiteDir=$updateSiteDirectory \
 -DupdateSiteStagingLocation=$updateSiteStagingDir \
 -DacmeVersion=1.0.0 \
 -DisNightlyBuild"
 
$javaExe -jar $baseDirectory/eclipse/plugins/org.eclipse.equinox.launcher_1.0.200.v20081201-1815.jar \
 -application org.eclipse.ant.core.antRunner \
 -buildfile $productBuildDir/productBuild.xml \
 -Dbuilder=$relengDir/builder \
 -DbaseDir=$baseDirectory \
 -DproductFile=$rcpProductDir/$rcpProductFile \
 -DbuildDir=$buildTempDir \
 -DdeliveriesDirectory=$deliveryDir \
 -DtestsDir=$testDirectory \
 -Dstamp=$timestamp \
 -DmapDir=$mapDirectory \
 -DmapFile=$mapFilePath \
 -DmapsRepoTag=$mapsRepository \
 -DproductDir=$productBuildDir \
 -DlauncherName=$rcpLauncherName \
 -DcodeBaseDir=$codeBaseDirectory \
 -DupdateSiteDir=$updateSiteDirectory \
 -DupdateSiteStagingLocation=$updateSiteStagingDir \
 -DacmeVersion=1.0.0 \
 -DisNightlyBuild
 

 
