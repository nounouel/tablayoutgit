plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.n222102520.tablayout"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.n222102520.tablayout"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}