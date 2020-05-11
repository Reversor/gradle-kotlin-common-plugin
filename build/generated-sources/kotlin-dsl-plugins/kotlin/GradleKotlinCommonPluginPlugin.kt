/**
 * Precompiled [gradle-kotlin-common-plugin.gradle.kts][Gradle_kotlin_common_plugin_gradle] script plugin.
 *
 * @see Gradle_kotlin_common_plugin_gradle
 */
class GradleKotlinCommonPluginPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Gradle_kotlin_common_plugin_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}