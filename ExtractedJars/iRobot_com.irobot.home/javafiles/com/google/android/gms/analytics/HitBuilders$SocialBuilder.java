// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders

public static class HitBuilders$SocialBuilder extends HitBuilders.HitBuilder
{

	public HitBuilders$SocialBuilder setAction(String s)
	{
		((HitBuilders.HitBuilder)this).set("&sa", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <String "&sa">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$SocialBuilder setNetwork(String s)
	{
		((HitBuilders.HitBuilder)this).set("&sn", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "&sn">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$SocialBuilder setTarget(String s)
	{
		((HitBuilders.HitBuilder)this).set("&st", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "&st">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$SocialBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
		((HitBuilders.HitBuilder)this).set("&t", "social");
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "&t">
	//    4    7:ldc1            #17  <String "social">
	//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}
}
