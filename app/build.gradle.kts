plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs.kotlin")

}

android {
    namespace = "com.example.mynit32132b3"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.mynit32132b3"
        minSdk = 26
        targetSdk = 36
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
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.fragment)

    //navigation dependancies
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    //viewmodel dependancies
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")

    // retrofit dep
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.11.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")

    //recycleview dep
    implementation(libs.androidx.recyclerview)


    // Local unit test dependencies (run on the JVM)
    testImplementation("io.mockk:mockk:1.13.12") // Core MockK library for local unit tests
    testImplementation("io.mockk:mockk-android:1.13.12") // Android-specific MockK for local unit tests
    testImplementation("io.mockk:mockk-agent:1.13.12") // MockK agent for advanced mocking (e.g., static methods)
    testImplementation("junit:junit:4.13.2")
    testImplementation(libs.junit.jupiter) // JUnit for local unit tests

// Instrumented test dependencies (run on an Android device or emulator) androidTestImplementation("io.mockk:mockk-android:1.13.12") // Android-specific MockK for instrumented tests
    androidTestImplementation("io.mockk:mockk-agent:1.13.12") // MockK agent for advanced mocking in instrumented tests
    androidTestImplementation("androidx.test.ext:junit:1.1.3") // AndroidX JUnit for instrumented tests


    //testing dependancies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}