// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders

public static class HitBuilders$TimingBuilder extends HitBuilders.HitBuilder
{

	public HitBuilders$TimingBuilder setCategory(String s)
	{
		((HitBuilders.HitBuilder)this).set("&utc", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "&utc">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$TimingBuilder setLabel(String s)
	{
		((HitBuilders.HitBuilder)this).set("&utl", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #40  <String "&utl">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$TimingBuilder setValue(long l)
	{
		((HitBuilders.HitBuilder)this).set("&utt", Long.toString(l));
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "&utt">
	//    2    3:lload_1         
	//    3    4:invokestatic    #48  <Method String Long.toString(long)>
	//    4    7:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$TimingBuilder setVariable(String s)
	{
		((HitBuilders.HitBuilder)this).set("&utv", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #50  <String "&utv">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$TimingBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
		((HitBuilders.HitBuilder)this).set("&t", "timing");
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "&t">
	//    4    7:ldc1            #17  <String "timing">
	//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}

	public HitBuilders$TimingBuilder(String s, String s1, long l)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void HitBuilders$TimingBuilder()>
		setVariable(s1);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #28  <Method HitBuilders$TimingBuilder setVariable(String)>
	//    5    9:pop             
		setValue(l);
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:invokevirtual   #32  <Method HitBuilders$TimingBuilder setValue(long)>
	//    9   15:pop             
		setCategory(s);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #35  <Method HitBuilders$TimingBuilder setCategory(String)>
	//   13   21:pop             
	//   14   22:return          
	}
}
