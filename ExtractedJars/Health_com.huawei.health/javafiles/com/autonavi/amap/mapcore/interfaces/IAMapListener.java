// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import com.autonavi.ae.gmap.GLMapState;

public interface IAMapListener
{

	public abstract void afterAnimation();

	public abstract void afterDrawFrame(int i, GLMapState glmapstate);

	public abstract void afterDrawLabel(int i, GLMapState glmapstate);

	public abstract void beforeDrawLabel(int i, GLMapState glmapstate);
}
