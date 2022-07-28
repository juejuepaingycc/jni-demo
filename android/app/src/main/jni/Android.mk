LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := get_key_jni
LOCAL_SRC_FILES := get_key.c

include $(BUILD_SHARED_LIBRARY)