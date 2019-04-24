// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;


// Referenced classes of package com.bumptech.glide.request.transition:
//			DrawableCrossFadeFactory

public static class DrawableCrossFadeFactory$Builder
{

	public DrawableCrossFadeFactory build()
	{
		return new DrawableCrossFadeFactory(durationMillis, isCrossFadeEnabled);
	//    0    0:new             #6   <Class DrawableCrossFadeFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int durationMillis>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field boolean isCrossFadeEnabled>
	//    6   12:invokespecial   #30  <Method void DrawableCrossFadeFactory(int, boolean)>
	//    7   15:areturn         
	}

	public DrawableCrossFadeFactory$Builder setCrossFadeEnabled(boolean flag)
	{
		isCrossFadeEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean isCrossFadeEnabled>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final int DEFAULT_DURATION_MS = 300;
	private int durationMillis;
	private boolean isCrossFadeEnabled;

	public DrawableCrossFadeFactory$Builder()
	{
		this(300);
	//    0    0:aload_0         
	//    1    1:sipush          300
	//    2    4:invokespecial   #18  <Method void DrawableCrossFadeFactory$Builder(int)>
	//    3    7:return          
	}

	public DrawableCrossFadeFactory$Builder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		durationMillis = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int durationMillis>
	//    5    9:return          
	}
}
