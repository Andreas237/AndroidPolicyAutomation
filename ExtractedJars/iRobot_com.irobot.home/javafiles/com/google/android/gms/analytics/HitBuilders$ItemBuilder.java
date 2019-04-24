// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders

public static class HitBuilders$ItemBuilder extends HitBuilders.HitBuilder
{

	public HitBuilders$ItemBuilder setCategory(String s)
	{
		((HitBuilders.HitBuilder)this).set("&iv", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #27  <String "&iv">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$ItemBuilder setCurrencyCode(String s)
	{
		((HitBuilders.HitBuilder)this).set("&cu", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "&cu">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$ItemBuilder setName(String s)
	{
		((HitBuilders.HitBuilder)this).set("&in", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "&in">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$ItemBuilder setPrice(double d)
	{
		((HitBuilders.HitBuilder)this).set("&ip", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "&ip">
	//    2    3:dload_1         
	//    3    4:invokestatic    #43  <Method String Double.toString(double)>
	//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$ItemBuilder setQuantity(long l)
	{
		((HitBuilders.HitBuilder)this).set("&iq", Long.toString(l));
	//    0    0:aload_0         
	//    1    1:ldc1            #47  <String "&iq">
	//    2    3:lload_1         
	//    3    4:invokestatic    #52  <Method String Long.toString(long)>
	//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$ItemBuilder setSku(String s)
	{
		((HitBuilders.HitBuilder)this).set("&ic", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #55  <String "&ic">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$ItemBuilder setTransactionId(String s)
	{
		((HitBuilders.HitBuilder)this).set("&ti", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "&ti">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$ItemBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void HitBuilders$HitBuilder()>
		((HitBuilders.HitBuilder)this).set("&t", "item");
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "&t">
	//    4    7:ldc1            #18  <String "item">
	//    5    9:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}
}
