load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "main",
    srcs = ["Main.java"],
    deps = [
        "@maven//:com_github_javaparser_javaparser_symbol_solver_core",
        "@maven//:com_github_javaparser_javaparser_core",
        "@maven//:com_google_guava_guava",
    ],
)
