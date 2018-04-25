#include <jni.h>
#include "string"



extern "C" {


JNIEXPORT jint JNICALL
Java_com_example_mylibrary_libActivity_jhg(JNIEnv *env, jobject instance) {

    return 9;
}
}