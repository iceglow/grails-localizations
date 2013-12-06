grails.release.scm.enabled=false
grails.project.work.dir = 'target'
grails.project.dependency.resolution = {
    inherits("global") {
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
    }
    dependencies {
    }
    plugins {
      build(":tomcat:$grailsVersion",
            ":release:2.2.0") {
        export = false
      }
    }
}
