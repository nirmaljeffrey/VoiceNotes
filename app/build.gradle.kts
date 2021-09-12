import java.io.FileInputStream
import java.util.*

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

val properties = Properties()
properties.load(FileInputStream(rootProject.file("local.properties")))

android {
    compileSdk = 30

    defaultConfig {
        applicationId = "com.nirmaljeffrey.dev.voicenotes"
        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        dataBinding = true
    }

    signingConfigs {
        create("release") {
            keyAlias = properties["RELEASE_KEY_ALIAS"] as String
            keyPassword = properties["RELEASE_KEY_PASSWORD"] as String
            storeFile = file(properties["RELEASE_KEYSTORE_PATH"] as String)
            storePassword = properties["RELEASE_KEYSTORE_PASSWORD"] as String
        }
    }
    buildTypes {
        getByName("release") {
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libs.core_ktx)
    implementation(Libs.appcompat)
    implementation(Libs.material)
    implementation(Libs.constraintlayout)
    implementation(Libs.junit_junit)
    implementation(Libs.androidx_test_ext_junit)
    implementation(Libs.espresso_core)
    // Retrofit
    implementation(Libs.retrofit)
    implementation(Libs.converter_gson)
    implementation(Libs.okhttp)
    // Firebase
    implementation(Libs.firebase_analytics_ktx)
    implementation(Libs.firebase_crashlytics_ktx)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.lifecycle:lifecycle-common-java8:2.3.1")

    debugImplementation(Libs.logging_interceptor)
    debugImplementation(Libs.stetho)
    debugImplementation(Libs.stetho_okhttp3)
    //Chucker
    debugImplementation(Libs.library)
    // Timber
    implementation(Libs.timber)
    // Coroutines
    implementation(Libs.kotlinx_coroutines_core)
    implementation(Libs.kotlinx_coroutines_android)
    // Coroutine Lifecycle Scopes
    implementation(Libs.lifecycle_viewmodel_ktx)
    implementation(Libs.lifecycle_runtime_ktx)
    //Dagger - Hilt
    implementation(Libs.hilt_android)
    kapt(Libs.hilt_android_compiler)
    implementation(Libs.hilt_lifecycle_viewmodel)
    kapt(Libs.hilt_compiler)
    // App Startup
    implementation(Libs.startup_runtime)
    // room
    implementation(Libs.room_runtime)
    kapt(Libs.room_compiler)
    implementation(Libs.room_ktx)
    testImplementation(Libs.room_testing)
    // Navigation
    implementation(Libs.navigation_fragment_ktx)
    implementation(Libs.navigation_ui_ktx)
    androidTestImplementation(Libs.navigation_testing)
    implementation(Libs.cardview)

}