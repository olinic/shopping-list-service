plugins {
    id("application") 
    id("java") 
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.micronaut.platform:micronaut-platform:4.5.0"))
    implementation("io.micronaut.starter:micronaut-starter-aws-cdk:4.3.7") {
      exclude(group = "software.amazon.awscdk", module = "aws-cdk-lib")
    }
    implementation("software.amazon.awscdk:apigatewayv2-alpha:2.110.1-alpha.0")
    implementation("software.amazon.awscdk:apigatewayv2-integrations-alpha:2.110.1-alpha.0")
    implementation("software.amazon.awscdk:aws-cdk-lib:2.129.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
}
application {
    mainClass = "service.Main"
}
tasks.withType<Test> {
    useJUnitPlatform()
}

