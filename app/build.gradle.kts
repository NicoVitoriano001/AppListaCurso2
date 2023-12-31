plugins {
    id("com.android.application")
}

android {
    namespace = "devandroid.nico.applistacurso2"
    compileSdk = 34

    defaultConfig {
        applicationId = "devandroid.nico.applistacurso2"
        minSdk = 22 //required minimum SDK for Clover apps
        targetSdk = 34 //API level used for testing
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

}