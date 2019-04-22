// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders

public static class HitBuilders$TransactionBuilder extends HitBuilders.HitBuilder
{

	public HitBuilders$TransactionBuilder setAffiliation(String s)
	{
		((HitBuilders.HitBuilder)this).set("&ta", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #27  <String "&ta">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$TransactionBuilder setCurrencyCode(String s)
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

	public HitBuilders$TransactionBuilder setRevenue(double d)
	{
		((HitBuilders.HitBuilder)this).set("&tr", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #34  <String "&tr">
	//    2    3:dload_1         
	//    3    4:invokestatic    #40  <Method String Double.toString(double)>
	//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$TransactionBuilder setShipping(double d)
	{
		((HitBuilders.HitBuilder)this).set("&ts", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "&ts">
	//    2    3:dload_1         
	//    3    4:invokestatic    #40  <Method String Double.toString(double)>
	//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$TransactionBuilder setTax(double d)
	{
		((HitBuilders.HitBuilder)this).set("&tt", Double.toString(d));
	//    0    0:aload_0         
	//    1    1:ldc1            #46  <String "&tt">
	//    2    3:dload_1         
	//    3    4:invokestatic    #40  <Method String Double.toString(double)>
	//    4    7:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$TransactionBuilder setTransactionId(String s)
	{
		((HitBuilders.HitBuilder)this).set("&ti", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #49  <String "&ti">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$TransactionBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void HitBuilders$HitBuilder()>
		((HitBuilders.HitBuilder)this).set("&t", "transaction");
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "&t">
	//    4    7:ldc1            #18  <String "transaction">
	//    5    9:invokevirtual   #22  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}
}
