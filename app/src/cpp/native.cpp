#include <jni.h>
#include "string"



extern "C" {


JNIEXPORT jstring JNICALL
Java_com_example_i12magaf_twinmodules_module1Activity_hola(JNIEnv *env, jobject instance) {

    std::string st = "hola c++";

    return env->NewStringUTF(st.c_str());
}
}