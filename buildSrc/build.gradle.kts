/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
plugins {
    `kotlin-dsl`
}

//configurations.all {
//    resolutionStrategy.cacheChangingModulesFor(0, "seconds")
//}

repositories {
    mavenCentral()
    maven {
        url = uri("http://oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencies {
    implementation("org.pushing-pixels:nova-core:0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.72")
    compile(localGroovy())
    compile(gradleApi())
}
