Generated with the eclipse command line call:

$ECLIPSE -debug -consolelog -nosplash -verbose -application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher -metadataRepository file:$REPO_ROOT -artifactRepository file:$REPO_ROOT -source $REPO_ROOT -compress -publishArtifacts

Requires plugins folder in $REPO_ROOT with all needed plugins

source: https://docs.sonatype.org/display/TYCHO/How+to+make+existing+OSGi+bundles+consumable+by+Tycho

pom.xml:
<repositories>
    <!-- configure p2 repository to resolve against -->
    <repository>
        <id>eclipse-platform-m6</id>
        <layout>p2</layout>
        <url>file:///path/to/repo</url>
    </repository>
</repositories>