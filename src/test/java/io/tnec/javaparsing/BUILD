load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_test(
    name = "main_test",
    srcs = ["MainTest.java"],
    test_class = "io.tnec.javaparsing.MainTest",
    deps = [
        "//src/main/java/io/tnec/javaparsing:main",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)
