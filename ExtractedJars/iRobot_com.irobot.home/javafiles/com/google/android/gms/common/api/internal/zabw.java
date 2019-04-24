// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			RegisterListenerMethod, UnregisterListenerMethod

public final class zabw
{

	public zabw(RegisterListenerMethod registerlistenermethod, UnregisterListenerMethod unregisterlistenermethod)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zajw = registerlistenermethod;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field RegisterListenerMethod zajw>
		zajx = unregisterlistenermethod;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field UnregisterListenerMethod zajx>
	//    8   14:return          
	}

	public final RegisterListenerMethod zajw;
	public final UnregisterListenerMethod zajx;
}
