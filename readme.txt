-- 建置專案命令 --

mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate \
  -DarchetypeCatalog=https://maven.repository.redhat.com/ga/io/fabric8/archetypes/archetypes-catalog/2.2.195.redhat-000017/archetypes-catalog-2.2.195.redhat-000017-archetype-catalog.xml \
  -DarchetypeGroupId=org.jboss.fuse.fis.archetypes \
  -DarchetypeArtifactId=spring-boot-camel-amq-archetype \
  -DarchetypeVersion=2.2.195.redhat-000017


-- 佈署進 minishift 相關 build 設定 --

Goals 填rclean compile fabric8:deploy -e
勾選 Skip Tests

JRE 頁填入：
-Dkubernetes.master=https://192.168.99.100:8443
-Dkubernetes.namespace=amq-quickstart
-Dkubernetes.auth.basic.username=developer
-Dkubernetes.auth.basic.password=developer
-Dfabric8.mode=openshift
-Dkubernetes.trust.certificates=true
-Dfabric8.build.strategy=s2i
-Dkubernetes.auth.tryServiceAccount=false
-Dfabric8.generator.from=registry.access.redhat.com/fuse7/fuse-java-openshift
-Dfabric8.generator.fromMode=docker
-Dkubernetes.auth.tryKubeConfig=false

-- deployment.yml --

區段 env 加上：
          - name: ACTIVEMQ_BROKER_USERNAME
            value: admin
          - name: ACTIVEMQ_BROKER_PASSWORD
            value: admin
