// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders

public static class HitBuilders$ScreenViewBuilder extends HitBuilders.HitBuilder
{

	public HitBuilders$ScreenViewBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
		((HitBuilders.HitBuilder)this).set("&t", "screenview");
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "&t">
	//    4    7:ldc1            #17  <String "screenview">
	//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}
}
