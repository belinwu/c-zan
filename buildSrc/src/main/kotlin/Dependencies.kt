import org.gradle.api.JavaVersion

/**
 * @author Vivien Mahe
 * @since 23/07/2022
 */

object Dependencies {

    object Versions {

        const val kotlin = "2.0.0"
        const val gradle = "8.2.2"
        const val dependencyVersionsPlugin = "0.51.0"
        const val nexusSonatype = "2.0.0-rc-1"
        const val dokka = "1.9.10"
        const val composeMultiplatform = "1.6.10"
        const val compose = "1.6.7"
        const val activityCompose = "1.7.2"
        const val accompanist = "0.34.0"
        const val coil = "3.0.0-alpha01"
        const val ktor = "2.3.4"
        const val annotations = "1.7.1"
        const val shimmer = "1.2.0"
        const val cupertinoCompose = "0.1.0-alpha03"

        object Czan {
            const val packageName = "com.tweener.czan"
            const val versionName = "2.3.0"
            const val namespace = "$packageName.android"
            const val compileSDK = 34
            const val minSDK = 24

            object Maven {
                const val group = "io.github.tweener"
                const val packageUrl = "https://github.com/Tweener/c-zan"
                const val gitUrl = "github.com:Tweener/c-zan.git"
            }
        }

        object Compiler {
            const val jvmTarget = "17"
            val javaCompatibility = JavaVersion.VERSION_17
        }

        object Tweener {
            const val bom = "2.0.0"
        }

        object Android {
            object AndroidX {
                const val lifecycle = "2.6.2"
            }
        }
    }

    object Libraries {

        const val shimmer = "com.valentinilk.shimmer:compose-shimmer:${Versions.shimmer}"
        const val ktor = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
        const val annotations = "androidx.annotation:annotation:${Versions.annotations}"
        const val cupertinoCompose = "io.github.alexzhirkevich:cupertino-adaptive:${Versions.cupertinoCompose}"

        object Tweener {
            const val bom = "io.github.tweener:kmp-bom:${Versions.Tweener.bom}"
            const val common = "io.github.tweener:kmp-common"
        }

        object Coil {
            const val compose = "io.coil-kt.coil3:coil-compose:${Versions.coil}"
            const val network = "io.coil-kt.coil3:coil-network:${Versions.coil}"
        }

        object Ktor {
            object Client {
                object Android {
                    const val okhttp = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
                }

                object iOS {
                    const val client = "io.ktor:ktor-client-darwin:${Versions.ktor}"
                }
            }
        }

        object ComposeMultiplatform {
            const val material3 = "org.jetbrains.compose.material3:material3:${Versions.composeMultiplatform}"
        }

        object Android {
            object AndroidX {
                object Compose {
                    const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
                    const val activity = "androidx.activity:activity-compose:${Versions.activityCompose}"
                    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.Android.AndroidX.lifecycle}"
                }
            }

            object Accompanist {
                const val systemUIController = "com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanist}"
            }
        }
    }
}
