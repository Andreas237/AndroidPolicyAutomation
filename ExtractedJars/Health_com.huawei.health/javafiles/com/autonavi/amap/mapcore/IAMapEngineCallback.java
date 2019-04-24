// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


public interface IAMapEngineCallback
{

	public abstract void OnIndoorBuildingActivity(int i, byte abyte0[]);

	public abstract void cancelRequireMapData(Object obj);

	public abstract void onMapRender(int i, int j);

	public abstract void reloadMapResource(int i, String s, int j);

	public abstract byte[] requireCharBitmap(int i, int j, int k);

	public abstract byte[] requireCharsWidths(int i, int ai[], int j, int k);

	public abstract void requireMapData(int i, byte abyte0[]);

	public abstract void requireMapRender(int i, int j, int k);

	public abstract byte[] requireMapResource(int i, String s);
}
