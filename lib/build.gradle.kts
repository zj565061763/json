plugins {
    id("com.android.library")
    `maven-publish`
}

val libGroupId = "com.sd.lib.android"
val libArtifactId = "json"
val libVersionName = "2.0.0-beta01"

android {
    namespace = "com.sd.lib.json"
    compileSdk = libs.versions.androidCompileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.androidMinSdk.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

dependencies {
    api(libs.squareup.moshi)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = libGroupId
            artifactId = libArtifactId
            version = libVersionName

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}