buildscript {
	repositories {
		maven {
			name = "Sonatype Snapshots"
			url = uri("https://oss.sonatype.org/content/repositories/snapshots")
		}
	}
}

plugins {
	`kordex-module`
}

group = "com.kotlindiscord.kord.extensions"

dependencies {
	detektPlugins(libs.detekt)
	detektPlugins(libs.detekt.libraries)

	implementation(libs.bundles.logging)
	implementation(libs.kotlin.stdlib)

	api(project(":plugins"))
}

dokkaModule {
	moduleName = "Kord Extensions Plugin Framework: Test Plugin (Core)"
}
