cd /tmp/willigis-info-lk-tests/src/main/java
mv -r $(find $GITHUB_WORKSPACE -name "src")/* .
cp -r /tmp/willigis-info-lk-tests/* $GITHUB_WORKSPACE/
