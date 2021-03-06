//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.jvm;

/**
 * MJI NativePeer class for java.lang.Integer library abstraction
 */
public class JPF_java_lang_Integer {
  public static int parseInt__Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, 
                                                   int strRef) {
    try {
      return Integer.parseInt(env.getStringObject(strRef));
    } catch (NumberFormatException e) {
      env.throwException("java.lang.NumberFormatException");

      return 0;
    }
  }

  public static int parseInt__Ljava_lang_String_2I__I (MJIEnv env, int clsObjRef, 
                                                    int strRef, int radix) {
    try {
      return Integer.parseInt(env.getStringObject(strRef), radix);
    } catch (NumberFormatException e) {
      env.throwException("java.lang.NumberFormatException");

      return 0;
    }
  }

  public static int toBinaryString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val) {
    return env.newString(Integer.toBinaryString(val));
  }

  public static int toHexString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val) {
    return env.newString(Integer.toHexString(val));
  }

  public static int toOctalString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val) {
    return env.newString(Integer.toOctalString(val));
  }

  public static int toString__I__Ljava_lang_String_2 (MJIEnv env, int objref, int val) {
    return env.newString(Integer.toString(val));
  }

  public static int toString__II__Ljava_lang_String_2 (MJIEnv env, int objref, int val, int radix) {
    return env.newString(Integer.toString(val, radix));
  }
}
