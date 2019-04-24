// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


public class AMapNativeRenderer
{

	public AMapNativeRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static native void nativeDrawGradientColorLine(float af[], int i, float f, int ai[], int j, int ai1[], int k, int l, 
			float af1[], int i1, int j1);

	public static native void nativeDrawLineByMultiColor(float af[], int i, float f, int j, int ai[], int k, int ai1[], int l, 
			float af1[], int i1, int j1);

	public static native void nativeDrawLineByMultiTextureID(float af[], int i, float f, int ai[], int j, int ai1[], int k, float f1, 
			float af1[], int l, int i1);

	public static native void nativeDrawLineByTextureID(float af[], int i, float f, int j, float f1, float f2, float f3, float f4, 
			float f5, boolean flag, boolean flag1, boolean flag2, float af1[], int k, int l);

	public static native void nativeDrawLineInit();
}
