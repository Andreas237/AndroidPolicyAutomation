// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.app.ActivityManager;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

private static final class ImageManager$zza
{

	static int zza(ActivityManager activitymanager)
	{
		return activitymanager.getLargeMemoryClass();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method int ActivityManager.getLargeMemoryClass()>
	//    2    4:ireturn         
	}
}
