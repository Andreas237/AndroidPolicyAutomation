// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders

public static class HitBuilders$EventBuilder extends HitBuilders.HitBuilder
{

	public HitBuilders$EventBuilder setAction(String s)
	{
		((HitBuilders.HitBuilder)this).set("&ea", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "&ea">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$EventBuilder setCategory(String s)
	{
		((HitBuilders.HitBuilder)this).set("&ec", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "&ec">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$EventBuilder setLabel(String s)
	{
		((HitBuilders.HitBuilder)this).set("&el", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "&el">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$EventBuilder setValue(long l)
	{
		((HitBuilders.HitBuilder)this).set("&ev", Long.toString(l));
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "&ev">
	//    2    3:lload_1         
	//    3    4:invokestatic    #48  <Method String Long.toString(long)>
	//    4    7:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$EventBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
		((HitBuilders.HitBuilder)this).set("&t", "event");
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "&t">
	//    4    7:ldc1            #17  <String "event">
	//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}

	public HitBuilders$EventBuilder(String s, String s1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void HitBuilders$EventBuilder()>
		setCategory(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method HitBuilders$EventBuilder setCategory(String)>
	//    5    9:pop             
		setAction(s1);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #31  <Method HitBuilders$EventBuilder setAction(String)>
	//    9   15:pop             
	//   10   16:return          
	}
}
