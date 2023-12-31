/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class RtcpFbEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RtcpFbEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RtcpFbEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_RtcpFbEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFbType(int value) {
    pjsua2JNI.RtcpFbEvent_fbType_set(swigCPtr, this, value);
  }

  public int getFbType() {
    return pjsua2JNI.RtcpFbEvent_fbType_get(swigCPtr, this);
  }

  public void setIsParamLengthZero(boolean value) {
    pjsua2JNI.RtcpFbEvent_isParamLengthZero_set(swigCPtr, this, value);
  }

  public boolean getIsParamLengthZero() {
    return pjsua2JNI.RtcpFbEvent_isParamLengthZero_get(swigCPtr, this);
  }

  public RtcpFbEvent() {
    this(pjsua2JNI.new_RtcpFbEvent(), true);
  }

}
