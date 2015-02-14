java -Xmx32m -Xms32m -Xss256k\
 -XX:NewRatio=4 \
 -XX:SurvivorRatio=4 \
 -XX:PermSize=16m \
 -XX:+PrintGCDetails\
 -XX:+UseParallelGC \
 -Xloggc:gc.log \
 -cp ./target/jvm-* jp.co.worksap.Program
