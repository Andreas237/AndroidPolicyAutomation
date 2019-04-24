// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


// Referenced classes of package com.autonavi.amap.mapcore:
//			Inner_3dMap_locationListener, Inner_3dMap_locationOption

public interface Inner_3dMap_locationManagerBase
{

	public abstract void destroy();

	public abstract void setLocationListener(Inner_3dMap_locationListener inner_3dmap_locationlistener);

	public abstract void setLocationOption(Inner_3dMap_locationOption inner_3dmap_locationoption);

	public abstract void startLocation();

	public abstract void stopLocation();

	public abstract void unRegisterLocationListener(Inner_3dMap_locationListener inner_3dmap_locationlistener);
}
