#include <jni.h>
#include "string"



extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_module2_module2Activity_hola2(JNIEnv *env, jobject instance) {

    std::string st = "hola c++ de nuevo";


    return env->NewStringUTF(st.c_str());
}