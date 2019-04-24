// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;


// Referenced classes of package com.amap.api.maps.offlinemap:
//			OfflineMapManager

public static interface OfflineMapManager$OfflineMapDownloadListener
{

	public abstract void onCheckUpdate(boolean flag, String s);

	public abstract void onDownload(int i, int j, String s);

	public abstract void onRemove(boolean flag, String s, String s1);
}
