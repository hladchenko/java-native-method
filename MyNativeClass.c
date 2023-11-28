// MyJavaClass.c
#include <stdio.h>
#include "MyNativeClass.h"

JNIEXPORT void JNICALL Java_MyNativeClass_myNativeMethod(JNIEnv *env, jobject obj) {
    // Native method implementation
    printf("Hello from native method!\n");
}
