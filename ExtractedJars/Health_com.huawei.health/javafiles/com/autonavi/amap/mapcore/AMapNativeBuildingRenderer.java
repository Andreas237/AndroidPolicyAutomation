// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import com.amap.api.maps.model.BuildingOverlayOptions;

public class AMapNativeBuildingRenderer
{

	public AMapNativeBuildingRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static native void addBuildingOptions(long l, BuildingOverlayOptions buildingoverlayoptions);

	public static native void nativeClearBuildingOptions(long l);

	public static native long nativeCreate();

	public static native void nativeDestory(long l);

	public static native void render(long l, float af[], float af1[], int i, int j, float f, int ai[]);

	public static native void setCurTileIDs(long l, int ai[]);
}
