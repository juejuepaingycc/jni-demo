//hello_world.c
#include <jni.h>

jstring Java_com_jnidemo_NativeKeyModule_getNativeKey(JNIEnv* env, jobject thiz) {
  return (*env)->NewStringUTF(env, "RypBmdIUbwxHnEkmfa0jfD2n3ltRfDIeQfHUtfzuNh0=");
}
