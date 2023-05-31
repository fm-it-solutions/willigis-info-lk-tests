cd $GITHUB_WORKSPACE
for dir in $GITHUB_WORKSPACE/src/main/java/*; do
mvn -B -Dtest="$(basename "$dir")".* test
done
